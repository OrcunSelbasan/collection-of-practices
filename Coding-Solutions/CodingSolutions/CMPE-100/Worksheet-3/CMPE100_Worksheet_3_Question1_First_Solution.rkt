;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname Question1_First_Solution) (read-case-sensitive #t) (teachpacks ((lib "universe.rkt" "teachpack" "2htdp") (lib "image.rkt" "teachpack" "2htdp"))) (htdp-settings #(#t constructor repeating-decimal #f #t none #f ((lib "universe.rkt" "teachpack" "2htdp") (lib "image.rkt" "teachpack" "2htdp")) #f)))
(define str "helloworld")
(define i 5)

(string-append (string-ith str 0)(string-ith str 1)(string-ith str 2)(string-ith str 3)(string-ith str 4) "_" (string-ith str i)(string-ith str 6)(string-ith str 7)(string-ith str 8)(string-ith str 9) )

