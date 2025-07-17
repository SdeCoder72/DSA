function isDivisibleBy13(s) {
    let rem = 0

    for(let i=0; i < s.length; i++) {
        rem = (rem * 10 + (s.charCodeAt(i) - '0'.charCodeAt(0))) % 13
    }

    //divisibility check
    //for direct return
    return rem === 0

    //to print it on console
    
    
}

    if(isDivisibleBy13('2911285')) {
        console.log(true);
    }else{
        console.log(false);
    }


