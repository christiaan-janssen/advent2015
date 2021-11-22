(ns day-01-test
  (:require [clojure.string :as str]
            [clojure.test :refer [deftest is]]
            day-01))

(deftest result-is-floor-0
  (is (= (day-01/puzzle-a (str/split "(())" #"")) 0)))

(deftest result-is-floor-3
  (is (= (day-01/puzzle-a (str/split "(((" #"")) 3)))

(deftest result-is-floor-also-3
  (is (= (day-01/puzzle-a (str/split "))(((((" #"")) 3)))

(deftest result-is-floor--3
  (is (= (day-01/puzzle-a (str/split ")())())" #"")) -3)))

