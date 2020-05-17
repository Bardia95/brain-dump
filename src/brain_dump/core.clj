(ns brain-dump.core
  (:require [cheshire.core :refer [parse-stream]]
            [clojure.java.io :refer [reader file resource]]
            [clojure.string :as str]))

(def excluded-words
  (vec (mapcat #(vector % (str/capitalize %))
               ["the" "of" "and" "a" "to" "in" "is" "you" "i" "it"
                "for" "with" "this" "they" "them" "be" "at" "have"
                "but" "what" "by" "was" "had" "we" "can" "which"
                "were" "do" "their" "if" "will" "how" "put" "an"
                "us" "try" "any" "get" "very" "our" "some" "out"])))

(defn db [src]
  (parse-stream (reader src)))

(defn clean [s]
  (str/replace s #"^\[" ""))

(defn references [db]
  (->> db
       (map #(clean (get % "title")))
       (remove #(.contains excluded-words %))
       (sort-by count)
       reverse))

(defn rgx [words]
  (re-pattern (str "\\b(" (str/join "|" words) ")\\b")))

(defn transform [s pattern]
  (str/replace s pattern "[[$1]]"))

(def input-dir "input-notes")
(def output-dir "roamified-notes")

(defn -main [roam-src]
  (for [file (rest (file-seq (file input-dir)))]
    (spit (str output-dir "/" (.getName file))
          (->> roam-src
               db
               references
               rgx
               (transform (slurp (.getPath file)))))))
