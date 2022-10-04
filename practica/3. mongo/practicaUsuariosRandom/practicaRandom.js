var contenido = document.querySelector("#contenido");

function generarUsuario(num){
  
  for(var i=0;i<num;i++)
  {
    fetch('https://randomuser.me/api')
    .then(res => res.json())
    .then(data => {
        enviar(data,num);   
    })
  } 
}


function enviar (data,num){

    for (i=0;i<num;i++){

        if(i==1)
        {
            var primerDiv= document.createElement("div");
            primerDiv.innerHTML=`

    <img class="img-fluid rounded-circle" src="${data.results['0'].picture.large}">

    <p>Nombre: ${data.results['0'].name.last}</p>

    <p>Direccion: calle ${data.results['0'].location.street.name}, ${data.results['0'].location.street.number}</p>

    <p>Ciudad: ${data.results['0'].location.city}</p>

    <p>${data.results['0'].nat}</p>

    `;

    } else if (i==2)
            {
                var segundoDiv= document.createElement("div");

            }
            else if (i==3)
            {
                var tercerDiv= document.createElement("div")

            }



        }


    contenido.innerHTML=`

    <img class="img-fluid rounded-circle" src="${data.results['0'].picture.large}">

    <p>Nombre: ${data.results['0'].name.last}</p>

    <p>Direccion: calle ${data.results['0'].location.street.name}, ${data.results['0'].location.street.number}</p>

    <p>Ciudad: ${data.results['0'].location.city}</p>

    <p>${data.results['0'].nat}</p>

    `

}

generarUsuario(6)