/*
Input: a = 5, b = 3, M = 11
Output: 4
Explanation: a × b = 5 × 3 = 15, 15 % 11 = 4, so the result is 4.

Input: a = 12, b = 15, M = 7
Output: 5
Explanation:  a × b = 12 × 15 = 180, 180 % 7 = 5, so the result is 5.
*/

console.log("Modular Multiplication");

function modMul(a, b, M) {

    // return Number(((a % M) * (b % M)) % (M));
    let res = ((a%M) * (b%M)) % M
    return res
}

const a = 5;
const b = 3;
const M = 11;

console.log(modMul(a, b, M));