function converterMaisculo (){
    let texto = document.getElementById('texto').value
    let resultado = document.getElementById('resultado')

    resultado.innerHTML = texto.toUpperCase()

}
function converterMinusculo (){
    let texto = document.getElementById('texto').value
    let resultado = document.getElementById('resultado')

    resultado.innerHTML = texto.toLowerCase()

}