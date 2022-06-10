const express = require("express");
const cors = require("cors");

// Gerência de Dados
var listaTodos = {
    todos: []
};

function adicionar(chave, novoTexto) {
    listaTodos.todos.push({key: chave, text: novoTexto});
}

function obter(){
    return listaTodos;
}
// Final da Gerência de Dados

const app = express();

var corsOptions = {
  origin: "http://localhost:3000"
};

app.use(cors(corsOptions));

// parse requests of content-type - application/json
app.use(express.json());

// parse requests of content-type - application/x-www-form-urlencoded
app.use(express.urlencoded({ extended: true }));

// simple route
app.get("/", (req, res) => {
  res.json({ message: "Welcome to bezkoder application." });
});

app.post("/addTodo", (req,res)=> {
    console.log(req.body);
    adicionar(req.body.key, req.body.text);
    res.json(obter());
});

app.get("/listar", (req, res) => {
    res.json(obter());
});

// set port, listen for requests
const PORT = process.env.PORT || 8080;
app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}.`);
});