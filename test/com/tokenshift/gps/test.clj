(ns com.tokenshift.gps.test
  (:use clojure.test
        com.tokenshift.gps))

(deftest test-simple-route
  (let [r (route [integer?])]
    (is (= "test" (reduce r "test" [42])))
    (is (nil? (reduce r "test" ["42"])))))

(deftest test-multi-element-route
  (let [r (route [integer? string?])]
    (is (= "test" (reduce r "test" [42 "42"])))
    (is (nil? (reduce r "test" ["42" 42])))))