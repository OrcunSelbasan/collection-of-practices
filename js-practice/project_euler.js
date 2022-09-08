// Multiples of 3 or 5
// Find the sum of all the multiples of 3 or 5 below 1000.
function mult35() {
    let sum = 0;
    let index = 2;
    while (index < 1000){
        if (index%3 === 0 || index%5 ===0) {
            sum+=index;
        }
        index++;
    }
    return sum;
}

// Even Fibonacci numbers
// By considering the terms in the Fibonacci sequence whose values do not exceed four million,
// find the sum of the even-valued terms.
function fibonacci() {
    const arr = [1,2];
    let sum = 2;
    let i = 2;
    let flag = true;
    while (flag) {
        arr[i] = arr[i-1] + arr[i-2];
        if (arr[i] >= 4000000) flag = false;
        if (arr[i]%2===0) sum+=arr[i]; 
        i++;
    }
    return sum;
}
// Largest prime factor
// What is the largest prime factor of the number 600851475143 ?
function largest_prime(n = 600851475143) {
    let div = 2;
    const factors = [];
    while (n>=2) {
        while (n%div === 0) {
            factors.push(div)
            n /= div;
        }
        div +=1;
    }

    return factors.sort((a,b) => a-b).reverse()[0];
}

// Largest palindrome product
// Find the largest palindrome made from the product of two 3-digit numbers.
function largest_palindrome() {
    let res = 0;
    const palindromes = []
    for (let n1 = 999; n1 >100 ; n1--) {
        for (let n2 = 999; n2>100; n2--) {
            res = n1*n2;
            let res_str = res.toString();
            let res_rev_str = res.toString().split("").reverse().join("");
            if (res_str === res_rev_str) {
                palindromes.push(res);
            }
        }
    }

    return palindromes.sort((a,b) => a-b).reverse()[0];
}

// Smallest multiple
// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
function smallest_multiple() {
    return 16*9*5*7*11*13*17*19;
}

// Sum square difference
// Find the difference between the sum of the squares of the first one hundred natural numbers 
// and the square of the sum.
function sumSquareDifference() {
    const sqrsum = (prev, curr) => prev + curr*curr;
    return Math.pow(50*101,2) - [...Array(101).keys()].reduce(sqrsum);
}

// 10001st prime
// What is the 10 001st prime number?
function isPrime(num) {
    for(var i = 2; i < num; i++)
      if(num % i === 0) return false;
    return num > 1;
}

function find10001stprime(){
    num = 4;
    nthPrime = 2;
    while(nthPrime<10002){
        if (num%2 == 0) num++;
        if (isPrime(num)) nthPrime++; 
        if (nthPrime == 10001) return num;
        num++
    }
    return primes.sort((a,b) => a - b)[10000];
}