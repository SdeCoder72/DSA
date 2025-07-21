/*
i/p - a= 20, b = 28 
o/p - 4  Explaination the Greatest Common divisor of 20 and 28 is 4

*/

// Approach 1 - Using loop

console.log("Approach 1 - Using loop");

function gcd1(a, b) {
    let result = Math.min(a,b)

    while(result > 0) {
        if(a % result === 0 && b % result === 0) {
            break
        }
        result--
    }

    console.log(result);
    return result
}
gcd1(20,28);
gcd1(60, 36)


console.log("Approach 2 - Euclidean Algorithm using Subtraction");

function gcd2(a, b) {
    // base cases
    if(a === 0) return b
    if(b === 0) return a
    if(a === b) return a

    if(a > b) {
        return gcd2(a-b, b)
    }
    return gcd2(a, b-a);
}

console.log(gcd2(20, 28));
console.log(gcd2(60, 36));
console.log(gcd2(34, 88));


console.log("Approach 3 - Euclidean Algorithm using Subtraction by checking divisibility");

function gcd3(a, b) {
    //base cases
    if(a === 0) return b
    if(b === 0) return a
    if(a === b) return a

    // a is greater

    if(a > b) {
        if(a % b === 0) {
            return b;
        }
        return gcd3(a-b, b)
    }

    // b is greater
    if(b % a === 0) {
        return a;
    }

    return gcd3(a, b-a)
}

console.log(gcd2(60, 36));
console.log(gcd2(34, 88));
console.log(gcd3(98, 34));

console.log("Approach 4 - Optimized Euclidean Algo By checking remainder");

function gcd4(a, b) {
    return b === 0 ? a : gcd4(b, a%b)
}

console.log(gcd2(60, 36));
console.log(gcd2(34, 88));
console.log(gcd3(98, 34));