/*
i/p - n = 11
o/p -  3    Explaination - print the exact sqrt if possible (i.e n = 16, o/p - 4) , if not then print the floor value 

*/

console.log("Naive Approach : iterating till n");

function floorSqrt1(n) {
    let result = 1
    while (result * result <= n) {
        result++
    }

    return result - 1
}

console.log(floorSqrt1(11))
console.log(floorSqrt1(64))


console.log("Using Binary Search");

function floorSqrt2(n) {
    let high = n, low = 1
    let result = 1

    while(low <= high) {
        let mid = Math.floor(high + low / 2)

        if(mid * mid <= n) {
            result = mid
            low = mid + 1
        }
        else{
            high = mid -1
        }
    }
    return result
}

console.log(floorSqrt2(36));
console.log(floorSqrt2(93));

console.log("Alternate Approach : Using built-in function");

function floorSqrt3(n) {
    return Math.floor(Math.sqrt(n))
}

console.log(floorSqrt3(49));
console.log(floorSqrt3(101));

console.log("Alternate Approach : Using Formula");

function floorSqrt4(n) {
    let result = Math.floor(Math.exp(0.5 * Math.log(n)))
    if((result+1) * (result+1) <= n) {
        result++
    }
    return result
}

console.log(floorSqrt4(81));
console.log(floorSqrt4(135));