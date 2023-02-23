const fechaHoy = new Date();

console.log(fechaHoy);

const fechaNacimiento = new Date(1983, 2, 27);

console.log(fechaNacimiento);

const comparar = fechaHoy.getTime() > fechaNacimiento.getTime();

console.log(comparar);

const dia = fechaNacimiento.getDate();

console.log(dia);

const mes = fechaNacimiento.getMonth() + 1;

console.log(mes);

const year = fechaNacimiento.getFullYear();

console.log(year);