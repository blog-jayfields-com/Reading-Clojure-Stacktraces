(ns reading-clojure-stacktraces.core)

(defn -main []
  ((fn [] (throw (RuntimeException. "thrown")))))
