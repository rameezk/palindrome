(require '[clojure.string :as str])

(defn is-palindrome? [word]
  (= (->> word
          (reverse)
          (str/join))
     word))

(is-palindrome? "anna")
(is-palindrome? "racecar")
