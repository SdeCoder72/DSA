// 1- Naive approach (By finding the remainder) 
// time - O(1)
// Space = (O1)

function isEven1(n){

    if(n%2 == 0) {
        console.log(true); 
    }else{
        console.log(false)
    }
    
}

isEven1(3)
isEven1(12)

// 2- Efficient Approach (using bitwise AND Operator )
// time - O(1)
// Space = (O1)

function isEven2(n) {
    //don't forget to put n&1 inside the brackets
    if((n & 1) == 0) {
        console.log(true);
    }else{
        console.log(false);
    }
}

isEven2(64)
isEven2(97)
