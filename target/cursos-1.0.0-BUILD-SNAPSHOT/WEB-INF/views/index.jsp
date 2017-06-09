<%@ include file="includes/header.jsp"%>

<h1>Pantalla de inicio</h1>

<p>P�gina de bienvenida donde se muestren los 10 �ltimos cursos
	creados y exista la posibilidad de buscar cursos sin tener que recargar
	la p�gina web.
</p>
	
	
<div class="row">
	<div class="col-md-8">
		<div class="tabla_cursos">
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Id.</th>
						<th>Nombre</th>
						<th>C�digo</th>

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
