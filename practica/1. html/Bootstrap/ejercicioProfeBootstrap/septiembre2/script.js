function saludarPorLasMañanas() {

    var nombre = prompt("Introduce tu nombre");

    console.log("hola " + nombre);

    alert("hola" + nombre);



    // location.replace("http://www.google.com");

}

function miPrimeraFuncion() {

    //busco dentro de los elementos de html el que tenga el id del input
    var mail = document.getElementById("exampleInputEmail1").value;

    var contraseña = document.getElementById("exampleInputPassword1").value;

    alert(contraseña);
}

saludar();