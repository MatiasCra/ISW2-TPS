; not c1 and c2
(declare-const a Int)
(declare-const b Int)
(declare-const c Int)
(assert (not (or (<= a 0) (<= b 0) (<= c 0)))) ; not c1
(assert (not (and (> (+ a b) c) (> (+ a c) b) (> (+ b c) a)))) ; c2
(check-sat)
(get-model)
