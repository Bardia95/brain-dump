(ns brain-dump.core
  (:require [cheshire.core :refer [parse-stream]]
            [clojure.java.io :refer [reader]]
            [clojure.string :as str]))

(defn db [src]
  (parse-stream (reader src)))

(defn clean [s]
  (str/replace s #"^\[" ""))

(defn references [db]
  (reverse (sort-by count (remove #(= % "the") (map #(clean (get % "title")) db)))))

(defn rgx [words]
  (re-pattern (str "\\b(" (str/join "|" words) ")\\b")))

(defn transform [s pattern]
  (str/replace s pattern "[[$1]]"))

(defn -main
  [roam-src input-md]
  (spit (str "roam-" input-md)
        (transform (slurp input-md) (rgx (references (db roam-src))))))
