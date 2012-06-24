(ns reading-clojure-stacktraces.core)

(defn -main []
  ((fn i-throw [] (throw (RuntimeException. "thrown")))))
