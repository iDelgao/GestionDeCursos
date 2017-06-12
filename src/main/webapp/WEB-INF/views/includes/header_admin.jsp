<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ page session="false"%>

<html>
<head>
<title>Cursos</title>
<base href="/cursos/" />


<link href="http://getbootstrap.com/dist/css/bootstrap.min.css"
	rel="stylesheet">
	
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet">
	
<link
	href="https://cdn.datatables.net/1.10.13/css/dataTables.bootstrap.min.css"
	rel="stylesheet">

<!-- Custom -->
<link href="resources/css/custom.css" rel="stylesheet">


</head>
<body>


	<div class="container">


		<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Cursos</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">

				<form class="navbar-form navbar-left">
					<div class="input-group">
						<span class="input-group-addon"> <span
							class="glyphicon glyphicon-search"></span>
						</span> <input id="buscar_curso" type="text" class="form-control"
							placeholder="Nombre del curso...">
					</div>
				</form>

					<!-- Enlace en la derecha de la barra de navegación -->
					<ul class="nav navbar-nav navbar-right">
						<li><a href="logout" class="btn btn-info" role="button">Logout</a>
						</li>
					</ul>

				</div>
			</div>
		</nav>

		<div class="jumbotron">