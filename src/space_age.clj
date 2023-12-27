(ns space-age)

(defn on-earth [age-in-seconds] ;; <- arglist goes here
      ;; your code goes here
      (/ age-in-seconds 31557600)
)

(defn on-mercury [age-in-seconds] ;; <- arglist goes here
  ;; your code goes here
  (/ (on-earth age-in-seconds) 0.2408467) 
)

(defn on-venus [age-in-seconds] ;; <- arglist goes here
  ;; your code goes here
  (/ (on-earth age-in-seconds) 0.61519726)
)

(defn on-mars [age-in-seconds] ;; <- arglist goes here
  (/ (on-earth age-in-seconds) 1.8808158) 
)

(defn on-jupiter [age-in-seconds] ;; <- arglist goes here
  ;; your code goes here
  (/ (on-earth age-in-seconds) 11.862615)
)

(defn on-saturn [age-in-seconds] ;; <- arglist goes here
  ;; your code goes here
  (/ (on-earth age-in-seconds) 29.447498)
)

(defn on-neptune [age-in-seconds] ;; <- arglist goes here
  ;; your code goes here
  (/ (on-earth age-in-seconds) 164.79132)
)

(defn on-uranus [age-in-seconds] ;; <- arglist goes here
  ;; your code goes here

  (/ (on-earth age-in-seconds) 84.016846)
)
