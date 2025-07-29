/*
i/p - arr[] = [12, 43, 64, 34,23]
o/p - 43

*/

console.log("Native Approach 01 - Using sorting");

function getSecondLargest(arr) {

    let n = arr.length
    
    //sort the array
    arr.sort((a, b) => a - b)

    
    // console.log(arr); 

    //iterate from second last coz last element is largest

    for(let i = n-2; i >= 0; i--) {
        if(arr[i] !== arr[n-1]) {
            
            return arr[i]
        }
    }

    
    return -1

}
let arr1 = [23, 65, 45, 23, 51]
let arr2 = [10, 10,10]
let arr3 = [30, 25, 30, 14, 21]
console.log(getSecondLargest(arr1));
console.log(getSecondLargest(arr2));
console.log(getSecondLargest(arr3));


console.log("Approach - 2 Two pass search");

function getSecondLargest2(arr) {
    let n = arr.length

    // initialize 1st largest and 2nd largest by -1
    let firstLargest = -1, secondLargest = -1

    // iterate the arr and find the firstLargest number and store it in firstLargest variable

    for(let i = 0; i < n; i++) {
        if(arr[i] > firstLargest) {
            firstLargest = arr[i]
        }
    }

    // find second Largest

    for(let i = 0; i<n; i++) {
        if(arr[i] > secondLargest && arr[i] !== firstLargest) {
            secondLargest = arr[i]
        }
    }

    return secondLargest
}

console.log(getSecondLargest2(arr1));
console.log(getSecondLargest2(arr2));
console.log(getSecondLargest2(arr3));
