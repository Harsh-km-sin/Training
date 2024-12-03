console.log("Hello World");
//Variables
let a  = 10; let b = 2; let c = a + b; var d = "2";
//Arithmetic operators
console.log("A is: " + a + " B is: " + b);
console.log("Sum is: " + c);
console.log("A with b exponent: " + a ** b);
console.log("A =",a,"B =",b);
//Comparison operators
console.log("A is greater than B: " + (a > b));
console.log("A is greater or equal to B: ", a >= b);
console.log("A is less or equal to B: ", a <= b);
console.log("A == B: ", b == d);
console.log("A === B: ", a === b);

//special case
console.log("a - d: ", a - d);

//Logical Operators
 a = 5; b = "5";
 console.log(b == a && a== 5);
 console.log(a == 5 || b == 0);
 console.log(!(a == 5));

 //Conditional Statements
 let age = 19;
 if(age >= 18) {
    console.log("You are an adult");
    } else{
    console.log("You are a minor");
}

//odd and even
let num = 5;
if(num % 2 == 0) {
    console.log(num + " is even");
}else{
    console.log(num + " is odd");
    }

//loops
for(let i = 0; i < 5; i++){
    console.log("Harsh");
}
console.log("loop has ended");
let i = 1;
while(i <= 5){
    console.log("Harsh");
    i++;
}
console.log("loop has ended");
//Objects
const student = {
    name: "Harsh",
    age: 23,
    marks: 90,
    displayMarks : function(){
        console.log("Marks are: ", this.marks);
    }
};
console.log(student);

//Normal Functions
function add(a, b) {
    return a + b;
}
console.log("Addition is: ", add(10, 10));


function sub(a, b){
    return a - b;
}
console.log("Subtraction is: ", sub(10, 5));


//Arrow Functions
//does not count spaces
const stringCount = (mssg) => {
    let count = 0;
    for(let i = 0; i < mssg.length; i++){
        if(mssg[i] !== " "){
            count++;
        }
    }
    return count;
};
let length = stringCount("Hello world.");
console.log("Length of string without spaces: ", length);

//count spaces as well
const stringLength = (mssg) => {
    return mssg.length;
}

let value = stringLength("Hello World.");
console.log("Length of string with spaces: ",value);

//Callback functions
//Callback functions are functions passed as arguments to other functions.
//They are used to perform operations after a certain operation has been completed.
function greet(name, callback){
    console.log("Hello, " + name);
    callback();
}
function wish(){
    console.log("Have a great day!");
}
//Passing callback function to greet function
greet("John", wish);
