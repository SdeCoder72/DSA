/*
i/p - arr = [1, 2, 3, 4, 5] d=2
o/p - [3, 4, 5, 1, 2]

i/p - arr = [1, 2, 3] d=4
o/p - [2, 3, 1]
*/



// Approach-1 : Using temp array

function reverseArray2(arr,d) {
    let n = arr.length
    let temp = new Array(n)
    for(let i = 0; i<n; i++) {
        temp[(i+d+1)%n] = arr[i]
    }
    //copy
    for(let i = 0; i<n; i++) {
        arr[i] = temp[i]
    }
    return arr
}

let arr2 = [1, 2, 3, 4, 5]
let d = 2
console.log(reverseArray2(arr2, d));


// Expected Approach : Using reversal Algorithm

function reverseArray(arr, l, r) {
    while(l < r) {
        [arr[l], arr[r]] = [arr[r], arr[l]]
        l++
        r--
    }
    return arr
}

function reverseArray3(arr,d) {
    let n = arr.length
    d %= n
    reverseArray(arr, 0, d-1)
    reverseArray(arr, d, n-1)
    return arr.reverse()
    
}

let arr3 = [1, 2, 3, 4, 5]
let d2 = 53
console.log(reverseArray3(arr3, d2));
