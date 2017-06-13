<%@ include file="../includes/header_admin.jsp"%>

<button onclick="topFunction()" id="boton_up" title="Ir arriba">
	<i class="fa fa-2x fa-arrow-up" aria-hidden="true"></i>
</button>

<h1>Gestión de Cursos</h1>

<form class="navbar-form">
	<div class="input-group herramientas">
		<span class="input-group-addon"> <span
			class="glyphicon glyphicon-search"></span>
		</span> <input id="buscador" type="text" class="form-control"
			placeholder="Nombre del curso...">
	</div>
	<a href="admin/edit" class="btn btn-info" role="button">Crear Nuevo</a>
	<a href="admin/curso/subir" class="btn btn-info" role="button">Subir
		archivo</a>
	<c:if test="${not empty msg}">
		<span class="alert alert-success" role="alert">${msg}</span>
	</c:if>
	<c:if test="${not empty msg}">
		<span class="alert alert-success" role="alert">${param.msg}</span>
	</c:if>
</form>


<div class="row">
	<div class="col-md-12">
		<div>
			<table class="tg">
				<thead>
					<tr>
						<th class="tg-imnp">Id.</th>
						<th class="tg-imnp">Nombre</th>
						<th class="tg-imnp">Código</th>
						<th class="tg-imnp" colspan="2">Opciones</th>

					</tr>
				</thead>
				<tbody>
					<c:forEach items="${cursos}" var="c">
						<tr>
							<td class="tg-eiwr">${cursos.lastIndexOf(c)+1}</td>
							<td class="tg-pxng">${c.nomCurso}</td>
							<td class="tg-7un6">${c.codCurso}</td>
							<td class="tg-7un6"><a href="admin/edit/${c.id}"><span
									class="glyphicon glyphicon-pencil"></a></td>
							<td class="tg-7un6"><a href="admin/delete/${c.id}"><span
									class="glyphicon glyphicon-trash"></a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>


<%@ include file="../includes/footer_admin.jsp"%>