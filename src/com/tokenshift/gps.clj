(ns com.tokenshift.gps
  "GPS core matchers and routing.")

(defn route
  "Given a sequence of matchers, returns a route function suitable for passing
  to `reduce` over a sequence of input elements (such as URL components)."
  [matchers]
  (constantly nil))