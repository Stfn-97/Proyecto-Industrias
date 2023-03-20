function opinion() {

    var nombres, apellidos, email, ciudad, mensaje;

    var nombres = document.getElementById("nombres").value;
    var apellidos = document.getElementById("apellidos").value;
    var email = document.getElementById("email").value;
    var ciudad = document.getElementById("ciudad").value;
    var mensaje = document.getElementById("mensaje").value;

    expresion1 = /\w+@\w+\.+[a-z]/;
    expresion2 = / ^\d{7,10}$/;


    if (nombres | apellidos | email | ciudad | mensaje == "") {
        Swal.fire({
            icon: 'error',
            title: 'OOPS...',
            text: '¡Parece que no lleno ningún campo o se salto alguno, verifique por favor!',
            footer: 'INDUSTRIAS ASOCIADAS S.A.S'
          })
        return false;
    }

    if (nombres == "") {
        Swal.fire('¡Debe escribir sus nombres!')
        return false;
    }
    if (nombres.length > 30) {
        Swal.fire('¡Los nombres pasa el rango de caracteres (30)!')
        return false;
    }

    if (apellidos == "") {
        Swal.fire('¡Debe escribir sus apellidos!')
        return false;
    }
    if (apellidos.length > 30) {
        Swal.fire('¡Los apellidos pasa el rango de caracteres (30)!')
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
    
    if (ciudad == "") {
        Swal.fire('¡Debe escribir su ciudad!')
        return false;
    }
    if (ciudad.length > 20) {
        Swal.fire('¡El nombre de la cuidad pasa el rango de caracteres (20)!')
        return false;
    }
    if (mensaje == "") {
        Swal.fire('¡Debe escribir su mensaje!')
        return false;
    }
    if (mensaje.length > 50) {
        Swal.fire('¡El mensaje pasa el rango de caracteres (50)!')
        return false;
    }
}

function enviar() {
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
        title: 'Mensaje enviado, gracias por tú opinión'
      })
}