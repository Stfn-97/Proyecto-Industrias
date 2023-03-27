function devolucion() {

    var fac, sucursal, telefono, email, nada;

    var fac = document.getElementById("fac").value;
    var sucursal = document.getElementById("sucursal").value;
    var telefono = document.getElementById("telefono").value;
    var email = document.getElementById("email").value;
    var nada = document.getElementById("nada").value;

    const expresionNumeroFac = /^\d{1,6}$/;
    const expresionTelefono = /^[0-9]{10}$/;
    const expresionEmail = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if (fac.trim() === '' ||
        sucursal.trim() === '' ||
        email.trim() === '' ||
        telefono.trim() === '' ||
        email.trim() === '') {
        Swal.fire({
            icon: 'error',
            title: 'Error',
            text: 'Por favor complete todos los campos.',
            footer: 'Industrias Asociadas S.A.S Tienda En Linea'
        });
        return false;
    }

    if (!expresionNumeroFac.test(fac)) {
        Swal.fire({
            icon: 'error',
            title: 'El campo número de factura no es válido.',
            text: 'Ingreso un número de factura permitido o supera los 6 caracteres.'
        });
        return false;
    }

    if (sucursal == nada) {
        Swal.fire({
            icon: 'error',
            title: 'El campo sucursal no es válido.',
            text: 'Seleccioné una de las sucursales.'
        });
        return false;
    }

    if (!expresionTelefono.test(telefono)) {
        Swal.fire({
          icon: 'error',
          title: 'El campo teléfono no es válido.',
          text: 'Introduce un número de teléfono de 10 dígitos sin espacios ni guiones.',
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
        title: 'La Petición de devolución se envío correctamente'
      })
}