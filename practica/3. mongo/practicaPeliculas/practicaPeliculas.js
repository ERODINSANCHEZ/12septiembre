var contenido = document.getElementById('contenido');

function traer(){
    fetch('peliculas.json')
    .then(res => res.json())
    .then(datos => {
        tabla(datos)
    })
}

function tabla(datos){
    contenido.innerHTML = ''
    for(let valor of datos){
        contenido.innerHTML += `
        <tr>
            <td>${valor.title}</td>
            <td>${valor.Writer}</td>
            <td>${valor.year}</td>
            <td>${valor.Franchise}</td>
            <td>${valor.synopsis}</td>
        </tr>
        `
    }
}