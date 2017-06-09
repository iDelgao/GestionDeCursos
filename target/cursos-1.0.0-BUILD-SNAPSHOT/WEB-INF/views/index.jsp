<%@ include file="includes/header.jsp"%>

<h1>Pantalla de inicio</h1>

<p>Página de bienvenida donde se muestren los 10 últimos cursos
	creados y exista la posibilidad de buscar cursos sin tener que recargar
	la página web.
</p>
	
	
<div class="row">
	<div class="col-md-8">
		<div class="tabla_cursos">
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Id.</th>
						<th>Nombre</th>
						<th>Código</th>

					</tr>
				</thead>
				<tbody>
					<c:forEach items="${cursos}" var="c">
						<tr>
							<td>${cursos.lastIndexOf(c)+1}</td>
							<td>${c.nomCurso}</td>
							<td>${c.codCurso}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>
	
	
	

<%@ include file="includes/footer.jsp"%>
