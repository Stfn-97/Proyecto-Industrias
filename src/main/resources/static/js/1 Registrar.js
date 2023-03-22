function registrar() {

    var nombres, apellidos, email, telefono, documento, direccion, ciudad;
    var nombres = document.getElementById("nombres").value;
    var apellidos = document.getElementById("apellidos").value;
    var email = document.getElementById("email").value;
    var telefono = document.getElementById("telefono").value;
    var documento = document.getElementById("documento").value;
    var direccion = document.getElementById("direccion").value;
    var ciudad = document.getElementById("ciudad").value;

    expresion1 = /^w+@[a-zA-Z_]+?.[a-zA-Z] {2,3}$/;
    expresion2 = / ^\d{7,10}$/;


    if (nombres | apellidos | email | telefono | documento | direccion | ciudad == "") {
        Swal.fire({
            icon: 'error',
            title: 'OOPS...',
            text: '¡Parece que no llenaste ningún campo o te saltaste alguno, verifica por favor!',
            footer: 'INDUSTRIAS ASOCIADAS S.A.S'
          })
        return false;
    }

    if (nombres == "") {
        Swal.fire('¡Debe escribir su nombre!')
        return false;
    }
    if (nombres.length > 20) {
        Swal.fire('¡El nombre pasa el rango de caracteres!')
        return false;
    }
    
    if (apellidos == "") {
        Swal.fire('¡Debe escribir sus apellidos!')
        return false;
    }
    
    if (apellidos.length > 20) {
        Swal.fire('¡Los apellidos pasa el rango de caracteres!')
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

    if (telefono == "") {
        Swal.fire('¡Escriba un telefono!')
        return false;
    }

    if (telefono.length > 10) {
        Swal.fire('¡Su telefono pasa el rango de 10 caracteres!')
        return false;

    }
    
    if (documento == "") {
        Swal.fire('¡Escriba un documento!')
        return false;
    }

    if (documento.length > 15) {
        Swal.fire('¡Su documento pasa el rango de 15 caracteres!')
        return false;

    }
    
    if (direccion == "") {
        Swal.fire('¡Escriba una direccion!')
        return false;
    }

    if (direccion.length > 20) {
        Swal.fire('¡Su direccion pasa el rango de 20 caracteres!')
        return false;

    }
    
    if (ciudad == "") {
        Swal.fire('¡Escriba una ciudad!')
        return false;
    }
}


$("#registro").click(function(){
	
});

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
        title: 'Registro exitoso'
      })
}