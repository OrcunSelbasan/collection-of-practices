;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-intermediate-lambda-reader.ss" "lang")((modname worksheet_11) (read-case-sensitive #t) (teachpacks ((lib "universe.rkt" "teachpack" "2htdp") (lib "image.rkt" "teachpack" "2htdp") (lib "batch-io.rkt" "teachpack" "2htdp"))) (htdp-settings #(#t constructor repeating-decimal #f #t none #f ((lib "universe.rkt" "teachpack" "2htdp") (lib "image.rkt" "teachpack" "2htdp") (lib "batch-io.rkt" "teachpack" "2htdp")) #f)))
;***********************************************Q01****************************************************

;definition of structure
(define-struct CD (artist genre price))

;constructor:
(define cd1 (make-CD "Johnny Cash" "Country" 1))
(define cd2 (make-CD "BB King" "Blues" 2))
(define cd3 (make-CD "Trivium" "Metal" 3))
(define cd4 (make-CD "Alter Bridge" "Metal" 4))
(define cd5 (make-CD "Tool" "Metal" 5))

;selector:
(CD-artist cd1)
(CD-genre cd2)

;predictor:
(CD? cd1)
(CD? 5)

;list of CD
(define CDList (list cd1 cd2 cd3 cd4 cd5))

;::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
;::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

;purpose: to produce a music album collection with given genre
;contract: list g --> list
(check-expect (mac CDList "Metal") (list "Trivium" "Alter Bridge" "Tool"))

;function:
(define (mac alist g)
  (cond
    [(empty? alist) '()]
    [(string=? g (CD-genre (first alist)))(cons (CD-artist (first alist)) (mac (rest alist) g))]
    [else (mac (rest alist) g)]))

;::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
;::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

;purpose: to produce total price of given album
;contract: list g --> integer
(check-expect (totalPrice CDList "Metal") 12)
(check-expect (totalPrice CDList "Blues") 2)
;function:
(define (totalPrice alist genre)
  (local
    ((define (tp-acc lst g acc)
       (cond
         [(empty? lst) acc]
         [(string=? g (CD-genre (first lst)))(+ (CD-price (first lst)) (tp-acc (rest lst) g acc))]
         [else (tp-acc (rest lst) g acc)])))
    (tp-acc alist genre 0)))

;::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
;::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

;purpose: to produce a list containing all the artists of CDs
;contract: list --> list
(check-expect (allArtists CDList) (list "Johnny Cash" "BB King" "Trivium" "Alter Bridge" "Tool"))
;function:
(define (allArtists alist)
  (cond
    ((empty? alist) '())
    (else (cons (CD-artist (first alist)) (allArtists (rest alist))))))


;******************************************************************************************************************************
;=====================================================Q02=====================================================================

;purpose: apply union to given two lists with using accumulator style
;contract: list list --> list
(check-expect (unionLists (list 1 2 3) (list 3 5 2 4)) (list 1 3 5 2 4))
;function:
(define (unionLists l1 l2)
  (local
    ((define (UL-acc list1 list2 acc)
       (cond
         [(empty? list1) (append acc list2)]
         [(empty? list2) (append acc list1)]
         [(member? (first list1) list2)(UL-acc (rest list1) list2 acc)]
         [else (UL-acc (rest list1) list2 (cons (first list1) acc))])))
    (UL-acc l1 l2 empty)))
         

;test:
(unionLists (list 1 2 3 4) (list 2 0 5))

;******************************************************************************************************************************
;======================================================Q03======================================================================

;purpose: to produce a number which is the concatenation of given list of number
;contract: list --> integer
(check-expect (concatNumbers (list 1 2 3)) 123)
(check-expect (concatNumbers (list 9 0 0 1 7)) 90017)
;function:
(define (concatNumbers alist)
  (local
    ((define (CN-acc lst acc)
       [cond
         [(empty? lst) acc]
         [(integer? (first lst)) (string-append (number->string (first lst)) (CN-acc (rest lst) acc))]
         [else (CN-acc (rest lst) acc)]]))
    (string->number (CN-acc alist "" ))))
























