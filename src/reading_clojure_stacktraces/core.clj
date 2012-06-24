(ns reading-clojure-stacktraces.core)

(defn foo [] (throw (RuntimeException. "thrown")))

(defn -main []
  (foo))
