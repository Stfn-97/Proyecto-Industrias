function recuperar() {

  var email;

  var email = document.getElementById("email").value;

  const expresionEmail = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;



  if (email.trim() === '') {
    Swal.fire({
      icon: 'error',
      title: 'Error',
      text: 'Por favor complete el campo para realizar la solicitud.',
      footer: 'Industrias Asociadas S.A.S Tienda En Linea'
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


function rec() {
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
    title: 'Su solicitud se ha enviado correctamente'
  })
}