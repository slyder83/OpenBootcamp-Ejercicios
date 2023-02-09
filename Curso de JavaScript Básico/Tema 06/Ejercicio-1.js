let listaCompra = ["Arroz", "Agua", "Chocolate", "Huevos", "Queso"]

console.log(listaCompra);

listaCompra.push("Aceite de Girasol");

console.log(listaCompra);

listaCompra.pop();

console.log(listaCompra);

let listaPeliculas = [
    {titulo: "Star Wars", director: "George Lucas", fecha: new Date(1977, 4, 25)},
    {titulo: "Stargate", director: "Roland Emmerich", fecha: new Date(1994, 12, 2)},
    {titulo: "Avatar", director: "James Cameron", fecha: new Date(2009, 12, 18)}
]

console.log(listaPeliculas);

let peliculasNuevas = listaPeliculas.filter(peli => {
    if (peli.fecha > new Date(2010, 0, 1)) {
        return true;
    } else {
        return false;
    }    
})

console.log(peliculasNuevas);

let directores = listaPeliculas.map(pelicula => {
    return pelicula.director;
})

console.log(directores);

let titulos = listaPeliculas.map(pelicula => {
    return pelicula.titulo;
})

console.log(titulos);

let listaDirecTitu = directores.concat(titulos);

console.log(listaDirecTitu);

let listaDirecTituProp = [...directores, ...titulos]

console.log(listaDirecTituProp);