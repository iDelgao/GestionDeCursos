<%@ include file="../includes/header_admin.jsp"%>


<h1>BackOffice</h1>

<a href="admin/edit" class="btn btn-info" role="button">Crear Nuevo</a>

<a href="admin/curso/migrar" class="btn btn-info" role="button">Subir archivo</a>

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
						<th>#</th>
						<th>Nombre</th>
						<th>Código</th>
						<th></th>
						<th></th>

					</tr>
				</thead>
				<tbody>
					<c:forEach items="${cursos}" var="c">
						<tr>
							<td>${cursos.lastIndexOf(c)+1}</td>
							<td>${c.nomCurso}</td>
							<td>${c.codCurso}</td>
							<td><a href="admin/edit/${c.id}"><span class="glyphicon glyphicon-pencil"></a></td>
							<td><a href="admin/delete/${c.id}"><span class="glyphicon glyphicon-trash"></a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>


<%@ include file="../includes/footer.jsp"%>