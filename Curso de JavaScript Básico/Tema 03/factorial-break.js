let factorial = 1;
let n = 10;

while (n > 1) {
    if(n == 1 || n == 0){
        break;
    }
    factorial *= n;
    n--;
}

console.log(factorial);