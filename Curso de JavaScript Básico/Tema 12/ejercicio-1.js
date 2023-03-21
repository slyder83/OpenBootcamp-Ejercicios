function fibonacci(num) {
    if (num <= 0){
        return [num];
    }

    let solucion = [0, 1];

    for (let i = 2; i < num; i++) {
        solucion[i] = solucion[i - 2] + solucion[i - 1];     
    }

    return solucion;   
}

console.log(fibonacci(10));