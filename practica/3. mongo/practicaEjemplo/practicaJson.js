var contenido=document.querySelector('#contenido')

function traer(){
    fetch('practicaJson.json')
    .then(res => res.json())
    .then(datos => {
        tabla(datos)
    })
}

function tabla(datos){

    contenido.innerHTML = '';
    for(let valor of datos){
        //console.log(valor.nombre)
        contenido.innerHTML += ` 
        <tr>
            <th>${valor.id}</th>
            <td>${valor.nombre}</td>
            <td>${valor.email}</td>
            <td>${valor.estado ? "Activo" : "Eliminado"}</td>
        </tr>
        `
    }
}