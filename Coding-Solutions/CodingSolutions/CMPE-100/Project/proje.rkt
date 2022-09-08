;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-intermediate-lambda-reader.ss" "lang")((modname proje) (read-case-sensitive #t) (teachpacks ((lib "universe.rkt" "teachpack" "2htdp") (lib "image.rkt" "teachpack" "2htdp") (lib "batch-io.rkt" "teachpack" "2htdp"))) (htdp-settings #(#t constructor repeating-decimal #f #t none #f ((lib "universe.rkt" "teachpack" "2htdp") (lib "image.rkt" "teachpack" "2htdp") (lib "batch-io.rkt" "teachpack" "2htdp")) #f)))
;CONSTANTS
(define HEIGHT 1000)
(define WIDTH 1000)
(define BACKGROUND (empty-scene WIDTH HEIGHT))
(define BG (square WIDTH "solid" "white"))

;definition of structure:
(define-struct shape (type posn direction color size))

;constructor:
(define s1 (make-shape "circle" (make-posn 300 300) "up" "blue" 100))
(define s2 (make-shape "square" (make-posn 300 600) "right" "gray" 200))
(define s3 (make-shape "circle" (make-posn 600 300) "down" "orange" 300))
(define s4 (make-shape "square" (make-posn 600 600) "left" "purple" 400))

;selector:
(shape-type s1)
(shape-posn s2)
(shape-direction s3)
(shape-color s4)
             
;predicator:
(shape? s1)
(shape? "circle")

;List of Structure

(define shapeStructureList (list s1 s2 s3 s4))

;*********************************************************************************************
;:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::


;TO DRAW PART

;-------------------------------------------------------------------------------------  
;purpose: creating image with given string in the structure(type)
;contract: structure --> img
(check-expect (typeselect s1) (circle 100 "solid" "blue"))
;function
(define (typeselect ashape)
  (cond
    ((string=? "circle" (shape-type ashape))(circle (shape-size ashape) "solid"(shape-color ashape)))
    ((string=? "square" (shape-type ashape))(square (shape-size ashape) "solid"(shape-color ashape)))
    (else (error "Invalid"))))
;-------------------------------------------------------------------------------------    
;purpose: creating Image list for place-images function
;contract: list(structure) --> list(image)
(check-expect (IMGlst shapeStructureList) (list (circle 100 "solid" "blue") (square 200 "solid" "gray") (circle 300 "solid" "orange") (square 400 "solid" "purple")))
;function:
(define (IMGlst x)
  (cond
    ((empty? x) empty)
    (else (cons (typeselect (first x)) (IMGlst(rest x))))))
;-------------------------------------------------------------------------------------    
;purpose: creating Position list for  place-images
;contract: list(structure) ---> list (posn)
(check-expect (POSNlst shapeStructureList) (list (shape-posn s1) (shape-posn s2) (shape-posn s3) (shape-posn s4)))
;function:
(define (POSNlst x) 
  (cond
    ((empty? x) empty)
    (else (cons (shape-posn (first x)) (POSNlst (rest x))))))
;-------------------------------------------------------------------------------------    
;to-draw
;purpose: creating function for rendering with given structure list
;contract: list -> image

;function
(define (render ashape)
  (place-images (IMGlst ashape) (POSNlst ashape) BG))


;*********************************************************************************************
;:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::


;ON TICK PART

;purpose: to change the posn of given structure in terms of its' direction
;contract: structure --> structure
(check-expect (dirselect s1) (make-shape "circle" (make-posn 300 301) "up" "blue" 100))
;function:
(define (dirselect ashape)
  (cond
  ((string=? "up" (shape-direction ashape))(make-shape (shape-type ashape) (make-posn (posn-x (shape-posn ashape)) (add1 (posn-y (shape-posn ashape)))) (shape-direction ashape) (shape-color ashape) (shape-size ashape)))
  ((string=? "down" (shape-direction ashape))(make-shape (shape-type ashape) (make-posn (posn-x (shape-posn ashape)) (sub1 (posn-y (shape-posn ashape)))) (shape-direction ashape) (shape-color ashape) (shape-size ashape)))
  ((string=? "right" (shape-direction ashape))(make-shape (shape-type ashape) (make-posn (add1 (posn-x (shape-posn ashape)))  (posn-y (shape-posn ashape))) (shape-direction ashape) (shape-color ashape) (shape-size ashape)))
  ((string=? "left" (shape-direction ashape))(make-shape (shape-type ashape) (make-posn (sub1 (posn-x (shape-posn ashape))) (posn-y (shape-posn ashape))) (shape-direction ashape) (shape-color ashape) (shape-size ashape)))
  (else (error "Invalid"))))

;-------------------------------------------------------------------------------------    
;on-tick:
;purpose: to define the behavior of function with respect to time;
;contract: list(structure) --> list(structure)
(define (on-tock ashape)
  (map (lambda (ashape) (dirselect ashape)) ashape))

;::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
;**********************************************************************************
;ON KEY PART
;purpose: delete one shape when key D is pressed
;contract: KE list(structure) --> list(structure)
(define (deletShape ashape ke)
  (cond
    ((key=? ke "d")(on-tock (rest ashape)))
    (else (on-tock ashape))))


;:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
;***************************************************************************************
;ON MOUSE PART
;purpose: to restart the animation when any mouse button is pressed
;contract: ME list(structure)--> list(structure)
(define (resShape ashape x y me)
  (cond
    ((mouse=? me "button-down")(on-tock shapeStructureList))
    (else ashape)))



;ACTION TIME
  (define (ActionTime alist)
    (big-bang alist
      (to-draw render) 
      (on-tick on-tock)
      (on-key deletShape)
      (on-mouse resShape)
      ))

(ActionTime shapeStructureList)



              