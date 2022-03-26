let buttons = document.querySelectorAll("button");
buttons.forEach((e) => {
  e.addEventListener("click", sale);
});

function sale() {
  let address = prompt("Aonde você mora?", "");
  if (address == "" || address == null) alert("Endereço em branco, digite um endereço");
  else alert("O produto será enviado para " + address);
}
