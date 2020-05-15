(ns brain-dump.core
  (:require [cheshire.core :refer :all]
            [clojure.java.io :refer [reader]]))

(defn db [src]
  (parse-stream (reader src)))

(defn extract-refs [db]
  (map #(get % "title") db))

(defn -main
  [& args]
  (println))

