function productos(ID_Producto) {

	Swal.fire({
		title: '¿Estás seguro?',
		text: "¡Una vez confirme se eliminaran los datos de este producto, no podrá recuperarse!",
		icon: 'warning',
		showCancelButton: true,
		confirmButtonColor: '#3085d6',
		cancelButtonColor: '#d33',
		confirmButtonText: 'Si, eliminar!'
	}).then((result) => {
		$.ajax({
			url: "/datos/eliminar/" + ID_Producto,
			succes: function(res) {
				console.log(res);
			}
		});

		if (result.isConfirmed) {
			Swal.fire(
				'Eliminado!',
				'Este refistro se ha eliminado.',
				'success'
			)
		}
	});

}