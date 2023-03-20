function devolucion() {

    var fac, sucursal, telefono, email, nada;

    var fac = document.getElementById("fac").value;
    var sucursal = document.getElementById("sucursal").value;
    var telefono = document.getElementById("telefono").value;
    var email = document.getElementById("email").value;
    var nada = document.getElementById("nada").value;

    expresion1 = /\w+@\w+\.+[a-z]/;
    expresion2 = /^\d{10}$/;

    if (fac | sucursal | telefono | email == "") {
        Swal.fire({
            icon: 'error',
            title: 'OOPS...',
            text: '¡Parece que no llenaste ningún campo o te saltaste alguno, verifica por favor!',
            footer: 'INDUSTRIAS ASOCIADAS S.A.S'
        })
        return false;
    }

    if (fac == "") {
        Swal.fire('¡Debe escribir el número de la factura!')
        return false;
    }
    if (fac.length > 10) {
        Swal.fire('¡El número de la factura es mayor a 10 caracteres!')
        return false;
    }
    if (!expresion2.test(fac)) {
        Swal.fire('¡El número de factura es invalido!')
        return false;
    }

    if (sucursal == nada) {
        Swal.fire('¡Seleccione la surcursal donde se compro el producto!')
        return false;
    }

    if (telefono == 0) {
        Swal.fire('¡Debe escribir su número de teléfono!')
        return false;
    }
    if (!expresion2.test(telefono)) {
        Swal.fire('¡El número de teléfono es invalido!')
        return false;
    }
    if (telefeno.length > 10) {
        Swal.fire('¡El número de teléfono es mayor a 10 caracteres!')
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

function aceptarD(){
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
        title: 'LA PETICIÓN DE DEVOLUCIÓN SE ENVÍO CORRECTAMENTE'
      })
}