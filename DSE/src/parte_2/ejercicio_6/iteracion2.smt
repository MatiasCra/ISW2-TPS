; c1_0 and not c2_0 and not c1_1 and not c2_1 and c1_2 and not c2_2 and not c1_3
(declare-const k Real)
(assert ((< 0 3) and (not (eq (+ k 5) 0)) and (not (< 1 3)) and (not (eq (+ k 1) 0)) and (< 2 3) and (not (eq (+ k 3) 0)) and (not (< 3 3))))
(check-sat)
(get-model)
