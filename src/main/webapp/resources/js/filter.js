$(function() {
	console.log('Autocomplete cursos');
	$("#buscador").autocomplete(
			{
				source : function(request, response) {
					var url = "/cursos/api/curso/?filter="
							+ $("#buscador").val().trim() + "";

					$.ajax({
						"url" : url,
						"type" : "GET",
						"dataType" : "json",
						"success" : function(data) {

							var cursos = [];

							$.each(data, function(i, v) {
								cursos.push(v.nomCurso);
							});

							response(cursos);

							console.log(
									"Llego el contenido %o y no hubo error",
									cursos);

						}

					});
				},

				minLength : 2

			});
});