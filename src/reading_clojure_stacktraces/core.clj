(ns reading-clojure-stacktraces.core)

(defn foo []
  (map inc [0 1 nil]))

(defn -main []
  (println (foo)))
