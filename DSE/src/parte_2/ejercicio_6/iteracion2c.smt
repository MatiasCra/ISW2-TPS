; c1_0 and not c2_0 and c1_1 and c2_1
(declare-const k Real)
(assert (and (< 0 3) (not (= (+ k 5.0) 0)) (< 1 3) (= (+ k 1.0) 0)))
(check-sat)
(get-model)
