; c1_0 and not c2_0 and c1_1 and not c2_1 and c1_2 and c2_2 and c1_3
(declare-const k Real)
(assert (and (< 0 3) (not (= (+ k 5.0) 0)) (< 1 3) (not (= (+ k 1.0) 0)) (< 2 3) (= (+ k 3.0) 0) (< 3 3)))
(check-sat)
(get-model)
