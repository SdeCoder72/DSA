// i/p = 786
// o/p = 7+8+6 = 21

function sumOfDigit(n) {
    let sum = 0
    while(n > 0) {
        let digit = n%10
        sum += digit
        n = Math.trunc(n/10)
    }

    console.log(sum);
}

sumOfDigit(786)
sumOfDigit(64763)
sumOfDigit(7968)