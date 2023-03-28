function registrar() {
    const nombres = document.getElementById('nombres').value;
    const apellidos = document.getElementById('apellidos').value;
    const email = document.getElementById('email').value;
    const telefono = document.getElementById('telefono').value;
    const documento = document.getElementById('documento').value;
    const direccion = document.getElementById('direccion').value;
    const ciudad = document.getElementById('ciudad').value;

    const expresionNombre = /^[a-zA-ZáéíóúñÁÉÍÓÚÑ\s]{1,20}$/;
    const expresionApellidos = /^[a-zA-ZáéíóúñÁÉÍÓÚÑ\s'-]{1,20}$/;
    const expresionEmail = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    const expresionTelefono = /^[0-9]{10}$/;
    const expresionDocumento = /^[0-9\s\-]{7,15}$/;
    const expresionDireccion = /^[a-zA-Z0-9\s\-\#\/]{1,30}$/;
    const expresionCiudad = /^[a-zA-Z\s]{1,25}$/;


    if (nombres.trim() === '' ||
        apellidos.trim() === '' ||
        email.trim() === '' ||
        telefono.trim() === '' ||
        documento.trim() === '' ||
        direccion.trim() === '' ||
        ciudad.trim() === '') {
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
            title: 'El campo nombre no es válido.',
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


    if (!expresionTelefono.test(telefono)) {
        Swal.fire({
          icon: 'error',
          title: 'El campo celular no es válido.',
          text: 'Introduce un número de celular de 10 dígitos sin espacios ni guiones.',
        });
        return false;
    }


    if (!expresionDocumento.test(documento)) {
        Swal.fire({
          icon: 'error',
          title: 'El campo documento no es válido.',
          text: 'Introduce un número de documento de 7 a 15 dígitos sin espacios ni guiones.',
        });
        return false;
    }


    if (!expresionDireccion.test(direccion)) {
        Swal.fire({
          icon: 'error',
          title: 'El campo dirección no es válido.',
          text: 'Introduce una dirección alfanumérica hasta máximo 30 caracteres, sin caracteres especiales excepto espacios, guiones o símbolo numeral.',
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

}


function registro() {
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
        title: 'Registro exitoso.'
    })
}