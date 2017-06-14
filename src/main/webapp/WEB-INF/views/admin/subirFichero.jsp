<%@ include file="../includes/header_admin.jsp"%>
<c:if test="${not empty msg}">
		<h1 class="alert alert-info" role="alert">${msg}</h1>
</c:if>
<p>El archivo debe de estar ubicado en: <code>C:/workspace/GestionDeCursos/deploy/cursos.csv</code></p>
<p>Después pulse el botón <code>UPLOAD</code> para iniciar el proceso.</p>

<a href="admin/curso/migrar" class="btn btn-info">Upload</a>
<a href="admin" class="btn btn-info">Volver</a>

<%@ include file="../includes/footer_admin.jsp"%>