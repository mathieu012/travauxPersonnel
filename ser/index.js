const express = require('express')
const app = express()
const data = require('./data.json')

// Middleware
app.use(express.json())

app.get('/data', (req,res) => {
    res.status(200).json(data)

})

app.get('/data/:id', (req,res) => {
    const id = parseInt(req.params.id)
    data = data.find(data => data.id === id)
    res.status(200).json(data)
})

app.post('/data', (req,res) => {
    data.push(req.body)
    res.status(200).json(data)
})

app.listen(8080, () => {
    console.log("Serveur à l'écoute")
})