let nombre = "Roberto";
let apellido = "Ceñera";
let estudiante = nombre + " " + apellido
let estudianteMayus = estudiante.toUpperCase();
let estudianteMinus = estudiante.toLowerCase();
let numeroLetras = estudiante.length;
let LetraNombre = estudiante[0];
let letraApellido = estudiante[estudiante.length - 1];
let noEspacios = estudiante.split(" ").join("");
let bool = estudiante.includes(nombre);



console.log(nombre);
console.log(apellido);
console.log(estudiante);
console.log(estudianteMayus);
console.log(estudianteMinus);
console.log(numeroLetras);
console.log(LetraNombre);
console.log(letraApellido);
console.log(noEspacios);
console.log(bool);