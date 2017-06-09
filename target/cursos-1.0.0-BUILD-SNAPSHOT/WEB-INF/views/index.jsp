<%@ include file="includes/header.jsp"%>

<h1>Listado de cursos</h1>
	
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
