; c1_0 and c2_0 and c1_1 and not c2_1 and not c1_2
(declare-const k Real)
(assert (and (< 0 3) (= (+ k 5.0) 0.0) (< 1 3) (not (= (+ k 1.0) 0.0)) (not (< 2 3))))
(check-sat)
(get-model)
