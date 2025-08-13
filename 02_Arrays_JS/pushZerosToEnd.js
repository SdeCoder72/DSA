/*
Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: arr[] = [1, 2, 4, 3, 5, 0, 0, 0]
Explanation: There are three 0s that are moved to the end.

Input: arr[] = [10, 20, 30]
Output: arr[] = [10, 20, 30]
Explanation: No change in array as there are no 0s.

Input: arr[] = [0, 0]
Output: arr[] = [0, 0]
Explanation: No change in array as there are all 0s.
*/

console.log("[Naive Approach] Using Temporary Array - O(n) Time and O(n) Space");


function pushZerosToEnd(arr) {
    const n = arr.length;
    const temp = new Array(n);

    let j = 0;

    for (let i = 0; i < n; i++) {
        if (arr[i] !== 0) {
            temp[j++] = arr[i];
        }
    }

    // Fill remaining positions in with zeros
    while (j < n)
        temp[j++] = 0;

    // Copy all the elements from temp[] to arr[]
    for (let i = 0; i < n; i++)
        arr[i] = temp[i];
}

const arr = [1, 2, 0, 4, 3, 0, 5, 0];
pushZerosToEnd(arr);

console.log(arr.join(" "));




console.log("Approach - 2 : Two Traversals");

function pushZerosToEnd2(arr) {
    
    let count = 0;  
    let n = arr.length

    for (let i = 0; i < n; i++) {
        if (arr[i] !== 0){
            arr[count] = arr[i];
            count++
        }
            
    }

    while (count < n){
        
        arr[count] = 0;
        count++
    }
}

const arr2 = [1, 2, 0, 4, 3, 0, 5, 0];
pushZerosToEnd2(arr2);
console.log(arr2.join(" "));


console.log("Approach - 3 : One Traversal");

function pushZerosToEnd3(arr) {
    
    let n = arr.length
    let count = 0;

    for(let i = 0; i < n; i++) {
        if(arr[i] !== 0) {
            [arr[i], arr[count]] = [arr[count], arr[i]];
            count++
        }
    }

}


const arr3 = [1, 2, 0, 4, 3, 0, 5, 0];
const arr4 = [10, 20, 30]
pushZerosToEnd3(arr3);
pushZerosToEnd3(arr4);
console.log(arr3.join(" "));
console.log(arr4.join(" "));


