<%@ include file="../includes/header_admin.jsp"%>



<c:if test="${not empty curso.nomCurso}">
	<h1>${curso.nomCurso}</h1>
</c:if>

<c:if test="${empty curso.nomCurso}">
	<h1>Crear nuevo curso</h1>
</c:if>

${msg}

<div class="row">
	<div class="col-md-6">
		<form:form action="admin/crear" modelAttribute="curso">

			<form:hidden path="id" readonly="true" />
			<br>
			<form:label path="nomCurso">Curso:</form:label>
			<form:input path="nomCurso" />
			<br>
			<form:errors path="nomCurso" cssStyle="color:red;" />
			<br>
			<form:label path="codCurso">Codigo:</form:label>
			<form:input path="codCurso" />
			<br>
			<form:errors path="codCurso" cssStyle="color:red;" />
			<br>

			<c:choose>
				<c:when test="${curso.id == -1}">
					<form:button type="submit" class="btn btn-info">Crear</form:button>
				</c:when>
				<c:otherwise>
					<form:button type="submit" class="btn btn-info">Modificar</form:button>
				</c:otherwise>
			</c:choose>

			

		</form:form>
		<a href="admin" class="btn btn-info">Volver</a>

	</div>

</div>


<%@ include file="../includes/footer.jsp"%>
