(ns service.core
  (:gen-class))
;; t
(defn sum[a b]
  (println + a b)
  (def c 10)
  (println c)
)
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (sum 1 2)
)
