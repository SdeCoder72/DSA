/*
i/p - n = 6
o/p -  true    Explaination - factors of 6 are 1, 2, 3 (exclude the n itself) sum of these factors are
                                1 + 2 + 3 = 6 which is n 

*/

console.log("Native Approach : iterating from 2 to n");

let sum = 0
function perfectNumber(n) {
    for(let i = 0; i < n; i++) {
        if(n%i === 0) {
            sum += i
        }
    }
    if (sum === n) {
        return true;

    }
    else {
        return false
    }
}

console.log(perfectNumber(6));
console.log(perfectNumber(10));


console.log("Expected Approach : iterating till sqrt of n");

function perfectNumber2(n) {
    let sum = 1;
    let limit = Math.floor(Math.sqrt(n))

    for(let i = 2; i <= limit; i++) {
        if(n%i === 0) {
            sum += i + (n/i) 
        }
    }

    if (sum === n) {
        return true;

    }
    else {
        return false
    }
}

console.log(perfectNumber2(28));
console.log(perfectNumber2(442));