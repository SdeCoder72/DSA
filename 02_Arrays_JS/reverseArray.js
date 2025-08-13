/*
i/p - [1,2,3,4,5]
o/p - [5,4,3,2,1]

*/

// Approach - 1 
// T.C - O(n)
// S.C - O(n)

function reverseArray(arr) {
    let ans = []
    let n = arr.length -1
    for(let i = n; i>=0; i--) {
        ans.push(arr[i])
    }
    console.log(ans);
}

let arr1 = [2,3,5,7,8,1]
reverseArray(arr1)



// Approach - 1 
// T.C - O(n)
// S.C - O(1)



function reverseArray2(arr) {
    let i = 0;
    let n = arr.length
    let j = n-1

    while(i < j) {
        [arr[i], arr[j]] = [arr[j], arr[i]]

        i++
        j--
    }
    console.log(arr);
    
}

let arr = [1,2,3,4,5]
let arr2 = [3,5,2,6,3,7,3]
reverseArray2(arr)
reverseArray2(arr2)