function divFloor(a, b) {
    let q = Math.trunc(a/b);

    /* (a^b) checks if a and b have opposite sign
        if (a^b) < 0 ,then the signs are different
        if (a^b) > 0 , then the signs are same

    */

    // q= q-1, if numbers have different sign and a mod b = 0

    if((a^b)<0 && a % b !== 0) {
        q--
    }
    return q
}

function divCeil(a,b){
    let q = Math.trunc(a/b);

    if((a^b) > 0 && a % b !== 0) {
        q++
    }
    return q
}


function divFloorCeil(a,b){
    let result = [divFloor(a,b), divCeil(a,b)]

    // result.push(divFloor(a,b))
    // result.push(divCeil(a,b))

    console.log(result);

    return result
}

divFloorCeil(7,2);
divFloorCeil(-7,2);
divFloorCeil(5,3);
divFloorCeil(-11,3)