function tudoMaiusculo() {
  let maiusculo = document.getElementById('texto').value;
  let resultado = document.getElementById('saida');

  resultado.innerHTML = maiusculo.toUpperCase();
}

function tudoMinusculo() {
  let maiusculo = document.getElementById("texto").value;
  let resultado = document.getElementById("saida");

  resultado.innerHTML = maiusculo.toLowerCase();
}