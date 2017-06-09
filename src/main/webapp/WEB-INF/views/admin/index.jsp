<%@ include file="../includes/header.jsp"%>


<h1>BackOffice</h1>

<a href="admin/edit" class="btn btn-info" role="button">Crear Nuevo</a>
<a href="#" class="btn btn-info" role="button">Subir archivo</a>

<!-- atributo request -->
<p>${msg}</p>
<!-- parametro request, ej: ?msg=Mensaje+para+el+usuario -->
<p>${param.msg}</p>

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
							<td><a href="admin/edit/${c.id}">${c.nomCurso}</a></td>
							<td><a href="admin/edit/${c.id}">${c.codCurso}</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>


<%@ include file="../includes/footer.jsp"%>