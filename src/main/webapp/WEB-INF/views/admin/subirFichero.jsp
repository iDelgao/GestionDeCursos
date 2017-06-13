<%@ include file="../includes/header_admin.jsp"%>

<h1>Subir datos</h1>
<c:if test="${not empty msg}">
		<p class="alert alert-success" role="alert">${msg}</p>
</c:if>
<p>El archivo debe de estar ubicado en: <code>C:/workspace/GestionDeCursos/deploy/cursos.csv</code></p>
<p>Después pulse el botón para iniciar el volcado de datos.</p>

<a href="admin/curso/migrar" class="btn btn-warning">Upload</a>
<a href="admin" class="btn btn-default">Volver</a>

<%@ include file="../includes/footer_admin.jsp"%>