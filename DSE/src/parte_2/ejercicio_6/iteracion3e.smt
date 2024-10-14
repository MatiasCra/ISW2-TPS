; c1_0 and c2_0
(declare-const k Real)
(assert (and (< 0 3) (= (+ k 5.0) 0.0)))
(check-sat)
(get-model)
