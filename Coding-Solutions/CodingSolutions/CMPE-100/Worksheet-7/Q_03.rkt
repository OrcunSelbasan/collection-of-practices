;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname Q_03) (read-case-sensitive #t) (teachpacks ((lib "universe.rkt" "teachpack" "2htdp") (lib "image.rkt" "teachpack" "2htdp") (lib "batch-io.rkt" "teachpack" "2htdp"))) (htdp-settings #(#t constructor repeating-decimal #f #t none #f ((lib "universe.rkt" "teachpack" "2htdp") (lib "image.rkt" "teachpack" "2htdp") (lib "batch-io.rkt" "teachpack" "2htdp")) #f)))
;************************Question03**********************
;purpose : sum of all proper divisors of given number
;Contract : findProperDivisor : number --> number

(check-expect (findProperDivisor 20) 22)
(check-expect (findProperDivisor 36) 55)

;function:


(define (findProperDivisor num) (findProperDivisor_0 num (sub1 num)))

(define (findProperDivisor_0 num x)
  (cond
    ((= 1 x) 1)
    ((= (remainder num x) 0) (+ x (findProperDivisor_0 num (- x 1))))
    (else (findProperDivisor_0 num (- x 1)))))


;test
(findProperDivisor 6)
(findProperDivisor 7)
         