<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="vendor/bulma/css/bulma.min.css">
<title>Ejercicio Unidad 2</title>
</head>
<body>
	<header >
		<div class="columns">
			<div class="column">
				<nav class="navbar has-background-warning" role="navigation" aria-label="main navigation">
					<div class="navbar-brand">
						<a class="navbar-item" href="index.jsp"> <img
							src="img/logo.png" width="64" height="64">
						</a> <a role="button" class="navbar-burger" aria-label="menu"
							aria-expanded="false" data-target="navbarBasicExample"> <span
							aria-hidden="true"></span> <span aria-hidden="true"></span> <span
							aria-hidden="true"></span>
						</a>
					</div>

					<div id="navbarBasicExample" class="navbar-menu">
						<div class="navbar-start">
							<a class="navbar-item"> Home</a>
							
							<div class="navbar-item has-dropdown is-hoverable">
								<a class="navbar-link"> Consolas </a>
								
								<div class="navbar-dropdown">
									<a class="navbar-item" href="AgregarConsolaController.do">Registrar</a> 
									<a class="navbar-item" href="VerConsolasController.do">Ver</a> 
								</div>
							</div>
							<div class="navbar-item has-dropdown is-hoverable">

								<a class="navbar-link"> Videojuegos </a>
								<div class="navbar-dropdown">
									<a class="navbar-item" href="AgregarJuegoController.do"> Registrar </a> 
									<a class="navbar-item">	Ver </a> 
								</div>
							</div>
						</div>
					</div>
				</nav>
			</div>
		</div>
	</header>