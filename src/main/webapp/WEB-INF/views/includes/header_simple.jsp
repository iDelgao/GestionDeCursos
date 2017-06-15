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


<!-- FAVICON -->

<link rel="apple-touch-icon" sizes="57x57"
	href="/cursos/resources/images/apple-icon-57x57.png">
<link rel="apple-touch-icon" sizes="60x60"
	href="/cursos/resources/images/apple-icon-60x60.png">
<link rel="apple-touch-icon" sizes="72x72"
	href="/cursos/resources/images/apple-icon-72x72.png">
<link rel="apple-touch-icon" sizes="76x76"
	href="/cursos/resources/images/apple-icon-76x76.png">
<link rel="apple-touch-icon" sizes="114x114"
	href="/cursos/resources/images/apple-icon-114x114.png">
<link rel="apple-touch-icon" sizes="120x120"
	href="/cursos/resources/images/apple-icon-120x120.png">
<link rel="apple-touch-icon" sizes="144x144"
	href="/cursos/resources/images/apple-icon-144x144.png">
<link rel="apple-touch-icon" sizes="152x152"
	href="/cursos/resources/images/apple-icon-152x152.png">
<link rel="apple-touch-icon" sizes="180x180"
	href="/cursos/resources/images/apple-icon-180x180.png">
<link rel="icon" type="image/png" sizes="192x192"
	href="/cursos/resources/images/android-icon-192x192.png">
<link rel="icon" type="image/png" sizes="32x32"
	href="/cursos/resources/images/favicon-32x32.png">
<link rel="icon" type="image/png" sizes="96x96"
	href="/cursos/resources/images/favicon-96x96.png">
<link rel="icon" type="image/png" sizes="16x16"
	href="/cursos/resources/images/favicon-16x16.png">

<!-- END: FAVICON -->

<link href="http://getbootstrap.com/dist/css/bootstrap.min.css"
	rel="stylesheet">

<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet">
	
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	

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

					<ul class="nav navbar-nav navbar-right">
						<li><a href="#" class="btn btn-info" role="button">Volver</a>
						</li>
					</ul>

				</div>
			</div>
		</nav>

		<div class="jumbotron">