/* i/p - n=13, m=4
   o/p - 12 Explaination: closest to 13 and divisible by 4

   i/p - n=-15, m=6
   o/p - -18 Explaination: Both -12 and -18 are closest to -15 and divisible by 6, but -18 has the maximum absolute value.
*/

function closestNum(n, m) {
    let i = n-1
    let j = n+1
    let round = Math.trunc(n%m)

    while(round != 0) {
        if(i % m == 0) {
            console.log(i);
            return i;
        }
        else if(j % m == 0) {
            console.log(j);
            return j;
        }
        else {
            i--
            j++
            round--
        }
    }
}

closestNum(13, 4);
closestNum(-15, 6)
closestNum(31, 7)