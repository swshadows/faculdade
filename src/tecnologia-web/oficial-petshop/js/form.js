function validate() {
  let nome = document.getElementById("name").value;
  let pass = document.getElementById("password").value;
  let confPass = document.getElementById("conf-password").value;
  let email = document.getElementById("email").value;
  let gender = document.form.gender.value;
  let terms = document.form.confirm.checked;

  if (nome != "" && pass != "" && confPass != "" && email != "" && gender != "" && terms == true) {
    if (confPass == pass) {
      return true;
    } else {
      alert("Senhas não são iguais");
      return false;
    }
  } else {
    alert("Faltam informações");
    return false;
  }
}
