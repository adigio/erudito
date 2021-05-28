<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<!-- Bootstrap core CSS -->
	    <link href="css/bootstrap.min.css" rel="stylesheet" >
	    <!-- Bootstrap theme -->
	    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
	</head>
	<body>
		<div class = "container">
			<h1>Bienvenidos</h1>
		</div>
		<div>
			<form:form action="agregarJugador" method="POST" modelAttribute="jugador">
				<div class="form-group">
					<label for="name"  >Nombre:</label>
					<form:input path="nombre" id="name" class="form-control" type="text" placeholder="Nombre"/>

				</div>
				<div>
					${mensaje}
				</div>
				<button class="btn btn-primary" type="submit">Jugar</button>
			</form:form>
		</div>
		<!--div class = "container">
	<h1>Home - El Erudito</h1>
	<div>
		<form:form method="POST" action="invitar" modelAttribute="jugador">
			<div class="form-group">
				<label for="name">Ingrese su nombre:</label>
				<form:input path="nombre" class="form-control" id="name" type="text" placeholder="Nombre" />
			</div>

			<button class="btn btn-primary">Jugar</button>
		</form:form>
	</div>
	</div-->

		<!-- Placed at the end of the document so the pages load faster -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script>
		<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
		<script src="js/bootstrap.min.js" type="text/javascript"></script>
	</body>
</html>




