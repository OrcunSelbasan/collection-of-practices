;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname Q_01) (read-case-sensitive #t) (teachpacks ((lib "universe.rkt" "teachpack" "2htdp") (lib "image.rkt" "teachpack" "2htdp") (lib "batch-io.rkt" "teachpack" "2htdp"))) (htdp-settings #(#t constructor repeating-decimal #f #t none #f ((lib "universe.rkt" "teachpack" "2htdp") (lib "image.rkt" "teachpack" "2htdp") (lib "batch-io.rkt" "teachpack" "2htdp")) #f)))
;************************Question01*************************
;purpose: counts integers in given number
;Contract: countDigit  : number --> number

(check-expect (countDigit 123) 3)
(check-expect (countDigit 64109) 5)

;function:
(define (countDigit num)
  (cond
    ((not (integer? num)) (error "Invalid" ))
    ((< num 0) (- (string-length (number->string num)) 1))
    (else (string-length (number->string num)))))

;test
(countDigit -512)
(countDigit 12)
(countDigit "f")

