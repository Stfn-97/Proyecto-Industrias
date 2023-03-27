function validar() {

    var nombre, contraseña;
    var nombre = document.getElementById("nombre").value;
    var contraseña = document.getElementById("contraseña").value;

    const expresionNombre = /^[a-zA-ZáéíóúñÁÉÍÓÚÑ\s]{1,20}$/;
    const expresionContraseña = /^[a-zA-Z0-9!@#$%^&*()_+\-=[\]{}|\\:;"'<,>.?/]{1,20}$/;



    if (nombre.trim() === '' ||
        contraseña.trim() === '') {
        Swal.fire({
            icon: 'error',
            title: 'Error',
            text: 'Por favor complete todos los campos.',
            footer: 'Industrias Asociadas S.A.S Tienda En Linea'
        });
        return false;
    }



    if (!expresionNombre.test(nombre)) {
        Swal.fire({
            icon: 'error',
            title: 'El campo nombre no es válido.',
            text: 'Ingreso dígitos no permitidos o supera más de los 20 caracteres.'
        });
        return false;
    }


    if (!expresionContraseña.test(contraseña)) {
        Swal.fire({
            icon: 'error',
            title: 'El campo contraseña no es válido.',
            text: 'La contraseña no cumple con los requisitos de seguridad o supera los 20 caracteres.'
        });
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
        title: 'Inicio de cuenta exitoso.'
    })
}