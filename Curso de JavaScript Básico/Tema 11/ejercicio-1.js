class Estudiante {
    nombre = "Alberto";
    asignaturas = ["Javascript", "HTML", "CSS"];

    obtenDatos(nombre) {
        return {
            nombre: this.nombre,
            asignaturas: this.asignaturas
        }
    }
}

const estudiante = new Estudiante();
console.log(estudiante.obtenDatos());