; c1_0 and c2_0 and not c1_1
(declare-const k Real)
(assert (and (< 0 3) (= (+ k 5.0) 0.0) (not (< 1 3))))
(check-sat)
(get-model)
