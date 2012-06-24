(ns reading-clojure-stacktraces.core)

(defn -main []
  (#(throw (RuntimeException. "thrown"))))
