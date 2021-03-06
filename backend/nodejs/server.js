var express = require('express');
var bodyParser = require('body-parser');
require('google-protobuf');
require('./messages/person_pb');


var app = express();
app.use(bodyParser.raw({type: 'application/x-protobuf'}));

// Configurar cabeceras y cors
app.use((req, res, next) => {
    res.header('Access-Control-Allow-Origin', '*');
    res.header('Access-Control-Allow-Headers', 'Authorization, X-API-KEY, Origin, X-Requested-With, Content-Type, Accept, Access-Control-Allow-Request-Method');
    res.header('Access-Control-Allow-Methods', 'GET, POST, OPTIONS, PUT, DELETE');
    res.header('Allow', 'GET, POST, OPTIONS, PUT, DELETE');
    next();
});


/**
 * Lanzamos el servidor.
 */
app.listen(3000, function () {
    console.log('Example app listening on port 3000!');
});

/**
 * Método get
 * 
 * @url http://localhost:3000/message
 */
app.get('/message', function (req, res) {

    // Creamos el message
    const person = new proto.Person();
    person.setName("Nombre 1");
    person.setEmail("correo@electronico.com");
    person.setId(1);
    person.getPhoneList().push( new proto.Person.PhoneNumber(["123 456 78 90", proto.Person.PhoneType.HOME]));

    // Especificamos que la peticion llevará un protobuf como tipo de contenido
    res.contentType('application/x-protobuf');

    // Creamos un buffer para enviar el message serializado.
    var buffer = new Buffer(person.serializeBinary());
    
    // Lanzamos el response
    res.send(buffer);
});

/**
 * Método de ejemplo.
 * 
 * @url http://localhost:3000/message
 */
app.post('/message', function (req, res, next) {
    
    //Creamos la persona a partir de la descerizalacion de los datos enviados en el body.
    const person = proto.Person.deserializeBinary(req.body);

    // Visualizamos la persona.
    console.log(person.toObject())

    // Rergesamos el nombre de la persona al cliente.
    res.send(person.getName());
});