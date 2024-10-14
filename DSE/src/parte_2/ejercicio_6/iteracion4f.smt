; not c1_0
(declare-const k Real)
(assert (not (< 0 3)))
(check-sat)
(get-model)
