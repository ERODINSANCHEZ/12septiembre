const mongoose=require('mongoose')

const mongoose= require('mongoose');
const url='mongodb://localhost/alumnos';
 
mongoose.connect(url,{
 
})
    .then(() => console.log('conectado'))
    .catch((e) =>console.log('el error es ' + e))
   
    const asidomSchema=mongoose.Schema({
 
        id:Number,
        nombre:String,
       apellido:String,
        o:Number,
        curso:String
   
    })
    const AsidomModel=mongoose.model('Asidom',asidomSchema)
   
   
    const mostrar = async() => {
 
        const asidom=await AsidomModel.find()
        console.log(asidom)
 
    }

mostrar()