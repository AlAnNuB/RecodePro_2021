import express from "express"
import React from "react"
import ReactDOM from "react-dom/server"

import App from "./src/App"

const app = express()

app.get('/', (req, res) => {
    const html = `
    <!DOCTYPE html>
    <html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Monitoria SSR</title>
    </head>
    <body>
        <div id="root">
            ${ReactDOM.renderToString(<App />)}
        </div>
    </body>
    </html>
    `
    res.send(html)
})

app.listen(3030, () => {
    console.log('Escutando na porta 3030')
})