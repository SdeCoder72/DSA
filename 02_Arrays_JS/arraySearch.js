/*
i/p - arr = [3,6,2,8,5,9] , x = 5
o/p - 4 Explaination: 5 is present in index 4

if x is present - return the index 
if x is not present - return -1

*/

function search(arr, x) {
    let n = arr.length
    for(let i = 0; i<n; i++) {
        if(arr[i] == x) {
            //console.log(i);   //testing
            return i;
        }
    }
    console.log(-1);
    return -1
}

let arr = [5,3,8,4,5,6,9]

search(arr, 6)