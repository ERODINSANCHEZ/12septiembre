var contenido = document.querySelector("#contenido");

function traer() {

    contenido.innerHTML=``; //para eliminar el contenido anterior (refrescar).
    var numPersonas=document.getElementById("num").value
    var divs=new Array(numPersonas)

        if(numPersonas=="") {
            alert("Introduce un número")
        }

    for(var i=0;i<numPersonas;i++) {

        fetch('https://randomuser.me/api/')
            .then(res => res.json())
            .then(data => {
            
                divs[i]=document.createElement('div');
            
                contenido.appendChild(divs[i]);
                divs[i].innerHTML = `
                <img class="img-fluid rounded-circle" src="${data.results['0'].picture.large} " >
            
                <p>Nombre: ${data.results['0'].name.last} ${data.results['0'].name.first}</p>
                
                <p>Dirección: calle ${data.results['0'].location.street.name}, ${data.results['0'].location.street.number} </p>
                <p>Ciudad:${data.results['0'].location.city},</p>
                
                `
            })
    }
}

