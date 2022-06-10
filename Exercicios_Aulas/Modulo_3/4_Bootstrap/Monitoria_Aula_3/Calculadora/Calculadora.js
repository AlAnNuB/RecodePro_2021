const botao = document.getElementById("btn")

botao.addEventListener("click", () => {
  const input = document.querySelectorAll("input")
  const select = document.querySelector("select")
  const resultado = document.getElementById("resultado")
  const opcao = select.children[select.selectedIndex].value

  if (opcao == "+") {
    resultado.value = Number(input[0].value) + Number(input[1].value)
  } else if (opcao == "-") {
    resultado.value = Number(input[0].value) - Number(input[1].value)
  } else if (opcao == "/") {
    resultado.value = Number(input[0].value) / Number(input[1].value)
  } else if (opcao == "*") {
    resultado.value = Number(input[0].value) * Number(input[1].value)
  } else {
    alert("Por favor selecione uma opção valida")
  }

})