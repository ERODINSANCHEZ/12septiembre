function borrar() {
    document.getElementById("num1").value = "";
    document.getElementById("num2").value = "";
}
//Declarar variables
var num1, num2, operacion;

//Esta función se ejecuta autimaticamente cuando rellenamos el unput1
function num1Auto() {

    num1 = parseInt(document.getElementById("num1").value);
    console.log(num1)

}

//Esta función se ejecuta autimaticamente cuando rellenamos el unput2
function num2Auto() {
    num2 = parseInt(document.getElementById("num2").value);
    console.log(num2);
}

//al clicar en el boton de sumar, le enviamos la operación sumar con los parametros
function boton() {
    sumar(num1, num2);
    borrar();
}

function sumar(elemento1, elemento2) {

    var resultadoSuma = parseInt(elemento1 + elemento2);
    resultado(resultadoSuma);


}

// voy a crear una función para el botón de restar

function botonRestar() {
    restar(num1, num2);
    borrar();

}

function restar(elemento1, elemento2) {
    var resultadoResta = elemento1 - elemento2;
    resultado(resultadoResta);
}

function resultado(resultadoDiv) {

    document.getElementById("resul").innerHTML = `<h3>El resultado de la operación es <span style="color:red;">  ${resultadoDiv}</span> </h3>`;
}