function eliminar(ID_Venta) {
Swal.fire({
		title: '¿Estás seguro?',
		text: "¡Una vez confirme se eliminara este registro de venta, no podrá recuperarse!",
		icon: 'warning',
		showCancelButton: true,
		confirmButtonColor: '#3085d6',
		cancelButtonColor: '#d33',
		confirmButtonText: 'Si, eliminar!'
	}).then((result) => {
		if (result.isConfirmed) {
			$.ajax({
			url: "/descargar/eliminar/" + ID_Venta,
			succes: function(res) {
			console.log(res);
			}
		});
			Swal.fire(
				'Eliminado!',
				'Este refistro se ha eliminado.',
				'success'
			)
		}
	});

}