const datos = {
    nombre: "Roberto",
    apellido: "Ceñera",
    edad: 39,
    altura: 175,
    eresDesarrollador: false
};

console.log(datos);

const edad = datos.edad;

console.log(edad);

const lista = [{
    ...datos},
    {
    nombre: "Alberto",
    apellido: "Garcia",
    edad: 34,
    altura: 185,
    eresDesarrollador: false
    },
    {
    nombre: "Raul",
    apellido: "Gonzalez",
    edad: 29,
    altura: 171,
    eresDesarrollador: true
    }
];

console.log(lista);

lista.sort((a, b) => b.edad - a.edad);

console.log(lista);