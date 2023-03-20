function validar() {

    var nombre, contraseña;
    var nombre = document.getElementById("nombre").value;
    var contraseña = document.getElementById("contraseña").value;

    expresion1 = /\w+@\w+\.+[a-z]/;
    expresion2 = / ^\d{7,10}$/;


    if (nombre | contraseña == "") {
        Swal.fire({
            icon: 'error',
            title: 'OOPS...',
            text: '¡Parece que no llenaste ningún campo o te saltaste alguno, verifica por favor!',
            footer: 'INDUSTRIAS ASOCIADAS S.A.S'
          })
        return false;
    }

    if (nombre == "") {
        Swal.fire('¡Debe escribir sus nombres!')
        return false;
    }
    if (nombre.length > 30) {
        Swal.fire('¡Los nombres pasan el rango de 30 caracteres!')
        return false;

    }

    if (contraseña == "") {
        Swal.fire('¡Escriba una contraseña!')
        return false;
    }

    if (contraseña.length > 20) {
        Swal.fire('¡Su contraseña pasa el rango de 20 caracteres!')
        return false;

    }
}

function iniciar() {
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
        title: 'Inicio de cuenta exitoso'
      })
}