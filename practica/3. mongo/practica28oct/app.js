const mongoose = require('mongoose');
const url='mongodb://localhost/alumnos';

mongoose.connect(url, {

})
    .then (() => console.log('conectado'))
    .catch((e) => console.log('el error es '+ e))

    const alumnosSchema = mongoose.Schema({

        _id: Number,
        nombre:String,
        apellido:String,
        edad:Number

    })

    const AlumnosModel = mongoose.model('alumnos',alumnosSchema)

    const mostrar = async () => {
        const alumnos=await AlumnosModel.find()
        console.log(alumnos)
    }

    mostrar()