;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname Question_2) (read-case-sensitive #t) (teachpacks ((lib "universe.rkt" "teachpack" "2htdp") (lib "image.rkt" "teachpack" "2htdp") (lib "batch-io.rkt" "teachpack" "2htdp"))) (htdp-settings #(#t constructor repeating-decimal #f #t none #f ((lib "universe.rkt" "teachpack" "2htdp") (lib "image.rkt" "teachpack" "2htdp") (lib "batch-io.rkt" "teachpack" "2htdp")) #f)))

;***********************Q_2****************
;Purpose: sum the numbers between given two numbers, [n,m] 
;Contract:  sumNtoM: number(n) number(m) --> number
;Example:
(check-expect (sumNtoM -1 1) 0)
(check-expect (sumNtoM 0 3) 6)
(check-expect (sumNtoM 3 0) 6)
;function:
(define (sumNtoM n m)
  (cond
    ((or (string? n) (string? m)) (error "Invalid"))
    ((and (= n 0) (= m 0)) 0)
    ((= n m) n)
    ((or(= n m)(< n m)) (+ n (sumNtoM (+ n 1) m)))
    (else (sumNtoM m n))))
    
;test:
(sumNtoM -5 3)
(sumNtoM 1 5)
(sumNtoM 5 1)
(sumNtoM 3 5)









