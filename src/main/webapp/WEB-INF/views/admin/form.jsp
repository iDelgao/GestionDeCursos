<%@ include file="../includes/header.jsp"%>

<a href="admin">Volver</a>

<c:if test="${not empty curso.nomCurso}">
	<h2>Detalle del curso: ${curso.nomCurso}</h2>
</c:if>

<c:if test="${empty curso.nomCurso}">
	<h2>Crear nuevo curso</h2>
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
					<form:button type="submit">Crear</form:button>
				</c:when>
				<c:otherwise>
					<form:button type="submit">Modificar</form:button>
				</c:otherwise>
			</c:choose>

			<form action="admin">
				<input type="submit" value="Volver" />
			</form>

		</form:form>

		<br>

		<c:if test="${curso.id != -1}">
			<a style="color: red;" href="admin/delete/${curso.id}">Eliminar</a>
		</c:if>


	</div>

</div>


<%@ include file="../includes/footer.jsp"%>
