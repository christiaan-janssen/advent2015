(ns day-01
  (:require [clojure.java.io :as io]
            [clojure.string :as s]))

(def input
  (s/split
   (s/trim
    (slurp
     (io/resource "day01.txt"))) #""))

(defn calculate [directions start-floor]
  (let [floor start-floor]
    (if (nil? (last directions))
      floor
      (if (= (first directions) "(")
        (recur  (rest directions) (inc floor))
        (recur  (rest directions) (dec floor))))))

(defn puzzle-a [directions]
  (calculate directions 0))

(puzzle-a input);; => 74


