;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname ws-5) (read-case-sensitive #t) (teachpacks ((lib "universe.rkt" "teachpack" "2htdp") (lib "image.rkt" "teachpack" "2htdp"))) (htdp-settings #(#t constructor repeating-decimal #f #t none #f ((lib "universe.rkt" "teachpack" "2htdp") (lib "image.rkt" "teachpack" "2htdp")) #f)))

;************************************QUESTION_01****************

;Definition
(define (categoriseBMI index)
  (cond
    ((and(<= index 18.5)(> index 0))"Underweight")
    ((and(< 18.5 index)(<= index 25)) "Normalweight")
    ((and (< 25 index) (<= index 30)) "Overweight")
    ((> index 30) "Obesity")
    (else "Unknown index value!")))

;Test
(categoriseBMI 16)
(categoriseBMI 24)
(categoriseBMI 28)
(categoriseBMI 32)
(categoriseBMI -1)


;********************QUESTION_2***********************


(define (connectionBill capacity)
  (cond
    ((and (>= capacity 0) (<= capacity 3)) (string->number "29"))
    ((> capacity 3) (+ (*(- capacity 3) 12) 29))))

(connectionBill 3)
(connectionBill 0)
(connectionBill 2)
(connectionBill 3.2)
(connectionBill 6)


;***************************QUESTION_3***********************

(define MYSCN (empty-scene 250 250 "black")) ;SCENE

(define BURNING_METEOR(overlay/align "left" "top"      ;
               (overlay (circle 30 "solid" "brown")    ;     OBJECT
                       (circle 40 "solid" "orange"))   ;
               (rectangle 40 40 "solid" "yellow")))    ;

(define (goDiagonalback y)
  (cond
  ((< y 125)(place-image BURNING_METEOR y y MYSCN))                                                    ;
  ((= y 125)(place-image BURNING_METEOR 125 125 MYSCN))                                                ;
  ((and (> y 125) (< y 250))(place-image BURNING_METEOR (- 125 (- y 125)) (- 125 (- y 125)) MYSCN))    ;   FUNCTION
  ((>= y 250 )(place-image BURNING_METEOR 0 0 MYSCN))))                                                ;
  

(animate goDiagonalback)