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
  (re-pattern (str "(" (str/join "|" words) ")")))

(defn transform [s pattern]
  (str/replace s pattern "[[$1]]"))

(defn -main
  [& args]
  (println))
