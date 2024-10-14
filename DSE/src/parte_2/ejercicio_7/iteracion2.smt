; c1_0 and c1_1
(declare-const n Int)
(assert (and (< 0 n) (< 1 n)))
(check-sat)
(get-model)
