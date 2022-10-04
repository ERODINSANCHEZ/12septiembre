var asidom = {
    aulas: 6,
    profesores: 1,
    'nombre oficial': "asidom servicios personalizados",
    propietario: "Juan Francisco",
    abierto: true
}

console.log(asidom.abierto)
console.log(asidom['nombre oficial'])

function Coche(marca, modelo, color){
    this.marca=marca;
    this.modelo=modelo;
    this.color=color;
}

var cocheJoel=new Coche('Ford', 'monduo', 'gris');
console.log(cocheJoel.color)

var persona={
    sexo: "f",
    "fecha de nacimiento": "calle inventada 123",
    nombrePadre: "Papi",
    nombreMadre: "Mami",
    hospitalNacimiento: "Taxi"
}

function Persona(sexo,fechaNacimiento, direccion, padre, madre, hospital){
    this.sexo=sexo;
    this.fecha=fechaNacimiento;
    this.adress=direccion;
    this.papa=padre;
    this.mami=madre;
    this.hospital=hospital;
}

Alvaro = new Persona ("h", "01/01/1998", "Calle", "papa", "mama", "taxi");
Eugenia = new Persona ("m", "03/02/1998", "calle", "papa", "mama", "gregorio marañon");

console.log(Alvaro.sexo);