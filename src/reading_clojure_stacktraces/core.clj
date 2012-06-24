(ns reading-clojure-stacktraces.core)

(defn foo []
  (map (partial + 1) [0 1 nil]))

(defn -main []
  (println (foo)))
