const nombre = "Roberto"
const apellido = "Ceñera"
const estudiante = nombre + "''" + apellido
const estudianteMayus = estudiante.toUpperCase()
const estudianteMinus = estudiante.toLowerCase()
const numeroLetras = estudiante.length
const LetraNombre = estudiante[0]
const letraApellido = estudiante[estudiante.length - 1]
const noEspacios = estudiante.split(" ").join("")
const bool = estudiante.includes(nombre)

console.log(nombre)
console.log(apellido)
console.log(estudiante)
console.log(estudianteMayus)
console.log(estudianteMinus)
console.log(numeroLetras)
console.log(LetraNombre)
console.log(letraApellido)
console.log(noEspacios)
console.log(bool)
