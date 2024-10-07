; not c1 and not c2 and not c3 and c4
(declare-const a Int)
(declare-const b Int)
(declare-const c Int)
(assert (not (or (<= a 0) (<= b 0) (<= c 0)))) ; not c1
(assert (and (> (+ a b) c) (> (+ a c) b) (> (+ b c) a))) ; not c2
(assert (not (and (= a b) (= b c)))) ; not c3
(assert (or (= a b) (= b c) (= a c))) ; c4
(check-sat)
(get-model)
