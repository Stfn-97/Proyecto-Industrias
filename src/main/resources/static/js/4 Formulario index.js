function opinion() {

    var nombres, apellidos, email, ciudad, mensaje;

    var nombres = document.getElementById("nombres").value;
    var apellidos = document.getElementById("apellidos").value;
    var email = document.getElementById("email").value;
    var ciudad = document.getElementById("ciudad").value;
    var mensaje = document.getElementById("mensaje").value;

    const expresionNombre = /^[a-zA-ZáéíóúñÁÉÍÓÚÑ\s]{1,20}$/;
    const expresionApellidos = /^[a-zA-ZáéíóúñÁÉÍÓÚÑ\s'-]{1,20}$/;
    const expresionEmail = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    const expresionCiudad = /^[a-zA-Z\s]{1,25}$/;
    const expresionMensaje = /^.{1,100}$/;


    if (nombres.trim() === '' ||
        apellidos.trim() === '' ||
        email.trim() === '' ||
        ciudad.trim() === '' ||
        mensaje.trim() === '') {
        Swal.fire({
            icon: 'error',
            title: 'Error',
            text: 'Por favor complete todos los campos.',
            footer: 'Industrias Asociadas S.A.S Tienda En Linea'
        });
        return false;
    }


    if (!expresionNombre.test(nombres)) {
        Swal.fire({
            icon: 'error',
            title: 'El campo nombres no es válido.',
            text: 'Ingreso dígitos no permitidos o supera más de los 20 caracteres.'
        });
        return false;
    }


    if (!expresionApellidos.test(apellidos)) {
        Swal.fire({
            icon: 'error',
            title: 'El campo apellido no es válido.',
            text: 'Ingreso dígitos no permitidos o supera más de los 20 caracteres.'
        });
        return false;
    }


    if (!expresionEmail.test(email)) {
        Swal.fire({
          icon: 'error',
          title: 'El campo email no es válido.',
          text: 'Introduce una dirección de correo electrónico válida.',
        });
        return false;
    }
    

    if (!expresionCiudad.test(ciudad)) {
        Swal.fire({
          icon: 'error',
          title: 'El campo ciudad no es válido.',
          text: 'Introduce una ciudad con máximo 25 caracteres, sin caracteres especiales ni números.',
        });
        return false;
    }


    if (!expresionMensaje.test(mensaje)) {
        Swal.fire({
          icon: 'error',
          title: 'El campo mensaje no es válido.',
          text: 'Introduce un mensaje hasta máximo 100 caracteres.',
        });
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