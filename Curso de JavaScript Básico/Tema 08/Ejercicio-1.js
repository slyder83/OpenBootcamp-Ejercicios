function devolverTrue() {
    return true;
}

console.log(devolverTrue());

async function asincrona() {
    return setTimeout(() => console.log("Hola soy una promesa"), 5000)
}
asincrona();

function* pares() {
    let id = 0;
    while (true) {
        id = id + 2;
        yield id;
        if (id >=50){
            return id;
        }
    }
}

const generadora = pares();

console.log(generadora.next());
console.log(generadora.next());
console.log(generadora.next());
console.log(generadora.next());
console.log(generadora.next());
console.log(generadora.next());
console.log(generadora.next());
console.log(generadora.next());
console.log(generadora.next());
console.log(generadora.next());
console.log(generadora.next());
console.log(generadora.next());
console.log(generadora.next());
console.log(generadora.next());
console.log(generadora.next());
console.log(generadora.next());
console.log(generadora.next());
console.log(generadora.next());
console.log(generadora.next());
console.log(generadora.next());
console.log(generadora.next());
console.log(generadora.next());
console.log(generadora.next());
console.log(generadora.next());
console.log(generadora.next());
console.log(generadora.next());