/*
i/p - 9
o/p - 1001 Explaination the binary representation of 9 is 1001
*/

// Approach-1 Division by 2
// Time Complexity - O(log2(n)) 
// Space Complexity - O(log2(n))

console.log("Approach-1 Division by 2 : ");

function decimalToBinary(n) {
    let bin = []
    while(n > 0) {
        let bit = n%2
        bin.push(String(bit))
        n = Math.floor(n/2)
    }

    // console.log(bin); // testing

    console.log(bin.reverse().join(""));
}

decimalToBinary(4);
decimalToBinary(15)
decimalToBinary(10)
decimalToBinary(19)

// Approach -2 Using head Recursion

console.log("Approach -2 Using head Recursion");

function decimalToBinaryRecursion(n, bin) {
    if(n === 0) {
        return
    }

    decimalToBinaryRecursion(Math.floor(n/2), bin)

    bin.push(n%2);
}

function decimalToBinary2(n){
    // Base case
    if(n === 0) 
        return "0"

    let bin = []
    decimalToBinaryRecursion(n, bin)
    // console.log(bin);  // testing

    console.log(bin.join(""));;
}

decimalToBinary2(6)
decimalToBinary2(11)
decimalToBinary2(93)
decimalToBinary2(41)


// Approach - 3 Using Bitwise Operator

console.log("Approach - 3 Using Bitwise Operator");

function decimalToBinary3(n) {

    let ans = 0
    let i = 0

        while(n > 0){
            let bit = n&1
            ans = (bit * Math.pow(10, i)) + ans;
            n = n>>1
            i++
        }
    console.log(String(ans));
}
decimalToBinary3(6);



// Approach - 4 Using Built-in Method

console.log("Approach - 4 Using Built-in Method");

function decimalToBinary4(n) {
    console.log(n.toString(2));
    // return n.toString(2)
}
decimalToBinary4(43)