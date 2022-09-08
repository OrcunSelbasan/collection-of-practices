;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname Q01-02-03) (read-case-sensitive #t) (teachpacks ((lib "universe.rkt" "teachpack" "2htdp") (lib "image.rkt" "teachpack" "2htdp") (lib "batch-io.rkt" "teachpack" "2htdp"))) (htdp-settings #(#t constructor repeating-decimal #f #t none #f ((lib "universe.rkt" "teachpack" "2htdp") (lib "image.rkt" "teachpack" "2htdp") (lib "batch-io.rkt" "teachpack" "2htdp")) #f)))
;**********************Q01**********************

(define-struct CD (name artist genre releaseYear price))

;constructor
(define CD1 (make-CD "Reload" "Metallica" "Rock" "1991" "1$"))
(define CD2 (make-CD "The Flying Club Cup" "Beirut" "Indie Folk" "2007" "2$"))
(define CD3 (make-CD "The Resistance" "Muse" "Alternative Rock" "2009" "3$"))

;selector
(CD-name CD1) ;Reload
(CD-artist CD2) ;Beirut
(CD-releaseYear CD3) ;2009

;predicate
(CD? CD1)
(CD? "Rock")

;***************Q02********************

;findGenre: CD g --> artist
;purpose: to find genre of given album
(check-expect (findGenre CD1) "Metallica")
(check-expect (findGenre CD2) "Beirut")
(check-expect (findGenre CD3) "Muse")

;function:
(define (findGenre cd g)
  (cond
    ((and (CD? cd) (string=? (CD-genre cd) g)) (CD-artist cd))
    (else #false)))

;test:
(findGenre CD1 "Rock")
(findGenre CD2 "Indie Folk")
(findGenre CD3 "Alternative Rock")


;*******************Q03********************

;findPrice: CD g y ---> price
;purpose: to find price of given cd with genre and year of it
(check-expect (findPrice CD1) "1$")
(check-expect (findPrice CD2) "2$")

;function:
(define (findPrice cd g y)
  (cond
    ((and (CD? cd) (string=? (CD-genre cd) g) (string=? (CD-releaseYear cd) y)) (CD-price cd))
    (else #false)))

;test:
(findPrice CD1 "Rock" "1991")
(findPrice CD2 "Indie Folk" "2007")