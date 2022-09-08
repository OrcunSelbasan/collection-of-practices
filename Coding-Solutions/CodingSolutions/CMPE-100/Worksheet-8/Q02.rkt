;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname Q02) (read-case-sensitive #t) (teachpacks ((lib "universe.rkt" "teachpack" "2htdp") (lib "image.rkt" "teachpack" "2htdp") (lib "batch-io.rkt" "teachpack" "2htdp"))) (htdp-settings #(#t constructor repeating-decimal #f #t none #f ((lib "universe.rkt" "teachpack" "2htdp") (lib "image.rkt" "teachpack" "2htdp") (lib "batch-io.rkt" "teachpack" "2htdp")) #f)))
;*********************Question02**************
;purpose: to find power of an integer power of a number
;contract : power: number(base) number(exponent) --> number(amountOfPower)
(check-expect (power 2 4) 2)
(check-expect (power 3 4) 2)


(define (power base exponent)
  (cond
    ((not(and(integer? base)(integer? exponent)))(error "invalid"))
    ((= base 0) 0)
    ((< exponent 0) (sub1 (abs exponent)))
    ((or(= exponent 1)(= exponent 0)) 0)
    ((= 0(modulo exponent 2))(+ 1 (power base (/ exponent 2))))
    ((= 1 (modulo exponent 2))(+ 2 (power base (/ (sub1 exponent) 2))))
    ((integer? (sqrt base))(+ 1 (power (sqrt base) exponent)))
    ))

(power 2 -4)
(power 2 16)
(power 2 17)
(power 243 2)  ; At this point 9 = 3^2 => ***ABOUT BASE*** result=2 if base is included but including base makes function way more complicated depending on value of base (243^2= (3*(3^(2^2)))^2=> result is 4 multiplication,but 81 will add 2 apart from exponent)
(power 0 64)
    

    