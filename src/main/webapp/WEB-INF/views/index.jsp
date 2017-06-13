<%@ include file="includes/header.jsp"%>

<h1>Listado de cursos</h1>
	
<div class="row">
	<div class="col-md-12">
			<table class="tg col-md-12">
				<thead>
					<tr>
						<th class="tg-imnp">Id.</th>
						<th class="tg-imnp">Nombre</th>
						<th class="tg-imnp">Código</th>

					</tr>
				</thead>
				<tbody>
					<c:forEach items="${cursos}" var="c">
						<tr>
							<td class="tg-eiwr">${cursos.lastIndexOf(c)+1}</td>
							<td class="tg-pxng">${c.nomCurso}</td>
							<td class="tg-7un6">${c.codCurso}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
	</div>
</div>
	
	
	

<%@ include file="includes/footer.jsp"%>
