//************************************  VERY EASY  ***********************************\\
function addition(a, b) {
  return a + b;
}

function convert(min) {
  return min * 60;
}

function add1(num) {
  return ++num;
}

function triArea(base, height) {
  return (base * height) / 2;
}

function calcAge(age) {
  return age * 365;
}

function cubes(x) {
  return x * x * x;
}

// WHAT IS OTHER WAYS
function getFirstValue([...nums]) {
  return nums[0];
}

circuitPower = (voltage, current) => {
  return voltage * current;
};

howManySeconds = (hours) => {
  return 3600 * hours;
};

nextEdge = (first, second) => {
  return first + second - 1;
};

function remainder(a, b) {
  return a % b;
}

findPerimeter = (width, heigth) => {
  return (width + heigth) * 2;
};

giveMeSomething = (str) => {
  return "something " + str;
};

//RETURNS TRUE WHEN EMPTY?
function lessThanOrEqualToZero(num) {
  return num > 0 ? false : true;
}

sumPolygon = (sides) => {
  return (sides - 2) * 180;
};

points = (twop, threep) => {
  return twop * 2 + threep * 3;
};

nameString = (name) => {
  return name + "Edabit";
};

lessThan100 = (a, b) => {
  return a + b < 100 ? true : false;
};

boolToString = (flag) => {
  return typeof flag === "boolean" ? flag.toString() : undefined;
};

calculator = (expr) => {
  return eval(expr);
};

calculateFuel = (distance) => {
  return distance > 10 ? distance * 10 : 100;
};
//************************************  END OF VERY EASY  ***********************************\\

//************************************  EASY  ***********************************\\
function chessboard(str) {
  const letter = ["a", "b", "c", "d", "e", "f", "g", "h"];
  const numbers = [1, 2, 3, 4, 5, 6, 7, 8];
  const squares = [];

  for (let i = 0; i < letter.length; i++) {
    for (let j = 0; j < numbers.length; j++) {
      squares.push(letter[i] + numbers[j]);
    }
  }

  if (
    str.length !== 2 ||
    !letter.includes(str[0]) ||
    !numbers.includes(parseInt(str[1]))
  ) {
    return "Invalid input";
  }

  if (
    ("aceg".includes(str[0]) && parseInt(str[1]) % 2 === 1) ||
    ("bdfh".includes(str[0]) && parseInt(str[1]) % 2 === 0)
  ) {
    return "black";
  } else {
    return "white";
  }
}

function bitwiseAND(n1, n2) {
  return n1 & n2;
}

function bitwiseOR(n1, n2) {
  return n1 | n2;
}

function bitwiseXOR(n1, n2) {
  return n1 ^ n2;
}

function lonelyInteger(arr) {
  for (let i = 0; i < arr.length; i++) {
    if (!arr.includes(arr[i] * -1)) {
      return arr[i];
    }
  }
}

function addUp(num) {
  return (num * (num + 1)) / 2;
}

function matchHouses(house) {
  return 5 * house + 1;
}

function shiftToLeft(n1, n2) {
  return n1 << n2;
}

function minMax(arr) {
  let max = arr[0];
  let min = arr[0];
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] > max) {
      max = arr[i];
    }
    if (arr[i] < min) {
      min = arr[i];
    }
  }
  return [min, max];
}

function timeForMilkAndCookies(date) {
  const day = date.getDate();
  const month = date.getMonth();

  if (day === 24 && month === 11) {
    return true;
  }

  return false;
}

function sortDrinkByPrice(arr) {
  return arr.sort((a, b) => (a.price < b.price ? -1 : 1));
}

class Person {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }

  compareAge(obj) {
    if (this.age < obj.age) {
      return `${obj.name} is older than me`;
    } else if (this.age === obj.age) {
      return `${obj.name} is the same age as me`;
    } else {
      return `${obj.name} is younger than me`;
    }
  }
}

function detectWord(str) {
  return str
    .split("")
    .filter((letter) => letter === letter.toLowerCase())
    .join("");
}

function largestSwap(num) {
  return num >= parseInt(num.toString().split("").reverse().join(""))
    ? true
    : false;
}

function numberSquares(sqrGrid) {
  if (sqrGrid === 1) return 1;
  return sqrGrid * sqrGrid + numberSquares(sqrGrid - 1);
}

function charCount(char, word) {
  this.char = char;
  return word.split("").filter((i) => this.char === i).length;
}

//Write a function that returns 0 if the input is 1, and returns 1 if the input is 0.
function flip(n) {
  return (n - 1) * (n - 1);
}

function numberSplit(num) {
  return num % 2 === 0 ? [num / 2, num / 2] : [(num - 1) / 2, (num + 1) / 2];
}

function filterArray(arr) {
  return arr.filter((element) => typeof element === "number");
}

function error(num) {
  return [
    "Check the fan: e1",
    "Emergency stop: e2",
    "Pump Error: e3",
    "c: e4",
    "Temperature Sensor Error: e5",
  ][num - 1];
}

function isTrue(exp) {
  switch (exp[1]) {
    case "=":
      return exp[0] === exp[2];
    default:
      return eval(exp);
      break;
  }
}

function doubleChar(str) {
  return str
    .split("")
    .map((char) => char + char)
    .join("");
}

const redundant = (str) => () => str;

function charIndex(str, char) {
  if (str.includes(char)) {
    return [str.indexOf(char), str.lastIndexOf(char)];
  }

  return undefined;

  //return (str.includes(char)) ? [str.indexOf(char),str.lastIndexOf(char)]: undefined;
}

function addNums(str) {
  const reducer = (a, b) => a + b;
  return str
    .split(", ")
    .map((x) => parseInt(x))
    .reduce(reducer);
}

function minutesToSeconds(len) {
  let min = parseInt(len.split(":")[0]);
  let sec = parseInt(len.split(":")[1]);

  return min * 60 + sec;
}
//************************************  END OF EASY  ***********************************\\
//************************************  MEDIUM  ***********************************\\
function countTrue(arr) {
  return arr.filter((element) => element && true === true).length;
}

function count(num) {
  return Math.abs(num).toString().length;
}

function countV2(num) {
  if (num / 10 < 1) return 0;
  return 1 + countV2(num / 10);
}

function intWithinBounds(n, lower, upper) {
  return Number.isInteger(n) && n >= lower && n < upper ? true : false;
}

function objectToArray(obj) {
  arr = [];
  for (const [key, value] of Object.entries(obj)) {
    arr.push([`${key}`, `${value}`]);
  }
  return arr;
}

function arrayOfMultiples(num, len) {
  return Array.from({ length: len }).map((_, i) => (i + 1) * num);
}

function keysAndValues(obj) {
  return [
    Object.entries(obj).map((items) => items[0]),
    Object.entries(obj).map((items) => items[1]),
  ];
}

function changeEnough(pocket, price) {
  const [quarter, dime, nickel, penny] = [
    pocket[0] * 0.25,
    pocket[1] * 0.1,
    pocket[2] * 0.05,
    pocket[3] * 0.01,
  ];
  const pocket_total = quarter + dime + nickel + penny;

  return pocket_total >= price ? true : false;
}

class Circle {
  constructor(radius) {
    this.radius = radius;
  }

  getArea() {
    return Math.PI * Math.pow(this.radius, 2);
  }

  getPerimeter() {
    return Math.PI * 2 * this.radius;
  }
}

function triangle(nth) {
  return ((nth + 1) * nth) / 2;
}

function add_suffix(suffix) {
  return function (body) {
    return body + suffix;
  };
}

function concat(...args) {
  return args.flat();
}

function toArray(obj) {
  return [Object.entries(obj)];
}

function makePlusFunction(base) {
  return function (add) {
    return add + base;
  };
}

function tetra(n) {
  if (n < 1) return "Error";
  if (n === 1) return 1;
  return ((n + 1) * n) / 2 + tetra(n - 1);
}

//Burglary_04
function addName(obj, k, v) {
  return Object.assign(obj, (obj[k] = v));
}

const derivative = (b, x) => {
  return b * Math.pow(x, b - 1);
};

const ascDesNone = (arr, order) => {
  switch (order.toLowerCase()) {
    case "asc":
      return arr.sort((a, b) => a - b);
    case "des":
      return arr.sort((a, b) => a - b).reverse();
    case "none":
      return arr;
    default:
      return "Invalid!";
  }
};

function totalVolume(...args) {
  const multiply = (prev, curr) => prev * curr;
  const sum = (prev, curr) => prev + curr;

  return args.map((item) => item.reduce(multiply)).reduce(sum);
}

function dis(price, discount) {
  return price - parseFloat((price * discount) / 100);
}

class Rectangle {
  constructor(x, y, width, height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  toString() {
    return `[x=${this.x}, y=${this.y}, width=${this.width}, height=${this.height}]`;
  }
}

function findNemo(str) {
  const wordList = str.split(" ");
  return wordList.includes("Nemo")
    ? `I found Nemo at ${wordList.indexOf("Nemo") + 1}`
    : "I can't find Nemo :(";
}

function perimeter(type, r) {
  return type === "s" ? r * 4 : (Math.PI * 2 * r).toFixed(2);
}

function testJackpot(arr) {
  const equal = (item) => item === arr[0];
  return arr.every(equal);
}

function paths(cities) {
  if (cities < 0) return "Invalid!";
  if (cities === 0) return 0;
  return cities === 1 ? 1 : cities * paths(cities - 1);
}

function coneVolume(h, r) {
  return h * r === 0
    ? 0
    : parseFloat(((Math.PI * Math.pow(r, 2) * h) / 3).toFixed(2));
}

function squareDigits(num) {
  return num
    .toString()
    .split("")
    .map((n) => Math.pow(parseInt(n), 2).toString())
    .join("");
}

function secondLargest(arr) {
  const sortedSet = Array.from(new Set(arr.sort((a, b) => a - b))).reverse();
  return sortedSet.length > 1 ? sortedSet[1] : parseInt(sortedSet.toString());
}

function same(arr1, arr2) {
  const ar1 = Array.from(new Set(arr1));
  const ar2 = Array.from(new Set(arr2));

  return ar1.length == ar2.length ? true : false;
}

class Name{
  constructor(fn, lastname){
    this.fname = fn.toLowerCase().replace(fn.substring(0,1), fn.substring(0,1).toUpperCase());
    this.lname = lastname[0].toUpperCase() + lastname.substring(1).toLowerCase();
    this.fullname = this.fname + " " + this.lname;
    this.initials = this.fname[0] + "." + this.lname[0];
  }
}

class OnesThreesNines{
  constructor(num){
    this.ones = Math.floor(num/1);
    this.threes = Math.floor(num/3);
    this.nines = Math.floor(num/9)
  }
}

class Book{
  constructor(title, author){
    this.title = title;
    this.author = author;
  }

  getTitle(){
    return "Title: "+this.title;
  }

  getAuthor(){
    return "Author: "+this.author;
  }
}


//************************************  END OF MEDIUM  ***********************************\\
//************************************  HARD  ***********************************\\
function balanced(arr) {
  const reducer = (prev, curr) => prev + curr;
  const first_half = arr.slice(0, arr.length / 2);
  const second_half = arr.slice(arr.length / 2);
  const first_half_sum = first_half.reduce(reducer);
  const second_half_sum = second_half.reduce(reducer);

  if (first_half_sum == second_half_sum) {
    return arr;
  } else if (first_half_sum > second_half_sum) {
    return [...first_half, ...first_half];
  } else {
    return [...second_half, ...second_half];
  }
}

function getLength(arr) {
  let len = 0;
  for (let i = 0; i < arr.length; i++) {
    if (typeof arr[i] == "object") {
      len += getLength(arr[i]);
    } else {
      len++;
    }
  }
  return len;
}

function getDays(date1, date2) {
  return Math.abs((date1.getTime() - date2.getTime()) / (60 * 60 * 24 * 1000));
}

function oddishOrEvenish(num) {
  return num
    .toString()
    .split("")
    .map((n) => parseInt(n))
    .reduce((p, c) => p + c) %
    2 ==
    1
    ? "Oddish"
    : "Evenish";
}

function countBoomerangs(arr) {
  let boomerang = 0;
  for (let i = 1; i < arr.length - 1; i++) {
    if (
      (arr[i] !== arr[i + 1]) & (arr[i] !== arr[i - 1]) &&
      arr[i - 1] == arr[i + 1]
    ) {
      boomerang++;
    }
  }
  return boomerang;
}

function countBy(arr, key) {
  let values = [];
  let res = {};
  //storing colors
  arr
    .map((pair) => Object.values(pair))
    .forEach((item) => values.push(item[1]));

  //set is for create unique key
  let keys = Array.from(new Set(values));

  //creating object  {color: amount,...}
  for (let color = 0; color < values.length; color++) {
    if (keys.includes(values[color])) {
      Object.assign(
        res,
        (res[values[color]] = values.filter((x) => x == values[color]).length)
      );
    }
  }

  return res;
}

//Formula is (2^n)-1
function towerHanoi(discs) {
  if (discs < 1) return 0;
  return Math.pow(2, discs) - 1;
}

function isPositiveDominant(arr) {
  const set = Array.from(new Set(arr));
  let pos = 0;
  let neg = 0;

  set.filter((x) => {
    if (x > 0) pos++;
    if (x < 0) neg++;
  });

  return pos > neg ? true : false;
}
//************************************  END OF HARD  ***********************************\\
