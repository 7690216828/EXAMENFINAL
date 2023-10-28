const username = document.getElementById('username')
const password = document.getElementById('password')
const button = document.getElementById('button')

button.addEventListener('click', (e) => {
    e.preventDefault()
    const usuario  = "xini";
    const pass = 123;
    if(username.value==usuario & password.value ==pass ){
        window.location.href = "http://localhost:8080/";
    }else{
        alert("Tus credenciales son incorrectas vuelve a intentarlo");
        username.value=""
        password.value=""
    }
   
})