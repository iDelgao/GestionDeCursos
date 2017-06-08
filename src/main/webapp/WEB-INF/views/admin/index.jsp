<%@ include file="../includes/header.jsp"%>


<h1>BackOffice</h1>

<p>Página privada de gestión de cursos</p>
<p>Desde donde podremos consultar, modificar, crear y eliminar
	nuevos cursos</p>
<p>Tendrá un botón que servirá para leer un archivo CSV y cargará
	los datos de los cursos en la BBDD</p>

<a href="admin/edit">Crear Nuevo</a>

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