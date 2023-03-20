function recuperar() {

    var email;

    var email = document.getElementById("email").value;

    expresion1 = /\w+@\w+\.+[a-z]/;


    if (email == "") {
        Swal.fire({
            icon: 'error',
            title: 'OOPS...',
            text: '¡Parece que no llenaste ningún campo o te saltaste alguno, verifica por favor!',
            footer: 'INDUSTRIAS ASOCIADAS S.A.S'
          })
        return false;
    }

    if (email == 0) {
        Swal.fire('¡Debe escribir su correo!')
        return false;
    }
    if (!expresion1.test(email)) {
        Swal.fire('¡Su correo no es valido!')
        return false;
    }
}

function rec(){
    const Toast = Swal.mixin({
        toast: true,
        position: 'top-end',
        showConfirmButton: false,
        timer: 3000,
        timerProgressBar: true,
        didOpen: (toast) => {
          toast.addEventListener('mouseenter', Swal.stopTimer)
          toast.addEventListener('mouseleave', Swal.resumeTimer)
        }
      })
      
      Toast.fire({
        icon: 'success',
        title: 'Petición enviada correctamente'
      })
}