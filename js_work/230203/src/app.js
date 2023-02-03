var express = require('express');
var app = express();

// localhost:3000
app.get('/', (req, res)=>{
    res.send('<h1>Hello Docker!</h1>')
});

// localhost:3000/aa
app.get('/aa', (req, res)=>{
    res.send('<h1>aa Docker!</h1>')
});

app.listen(3000,'0.0.0.0',()=>{
    console.log('Server Start : port 3000');
});