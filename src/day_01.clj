(ns day-01
  (:require [clojure.java.io :as io]
            [clojure.string :as s]))

;; (()) and ()() both result in floor 0.
;; ((( and (()(()( both result in floor 3.
;; ))((((( also results in floor 3.
;; ()) and ))( both result in floor -1 (the first basement level).
;; ))) and )())()) both result in floor -3.

(def input
  (s/split
   (slurp
    (io/resource "day01.txt")) #""))

(defn calculate [directions start-floor]
  (let [floor start-floor]
    (if (nil? (last directions))
      floor
      (if (= (first directions) "(")
        (recur  (rest directions) (inc floor))
        (recur  (rest directions) (dec floor))))))

(defn puzzle-a [directions]
  (calculate directions 0))

;; Off by one?
(puzzle-a input);; => 73


