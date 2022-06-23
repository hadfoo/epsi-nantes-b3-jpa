<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Création d'une commande</title>
</head>
<body>
<h1>Création d'une commande</h1>
<div><a href="/">Accueil</a></div>
<form action="/commande/init" method="post">
	<div>
		<label for="client">Client</label>
		<select id="client" name="client.id">
			<option></option>
			<c:forEach items="${clients}" var="client">
				<option value="${client.id}">
					<c:out value="${client.prenom} ${client.nom}"/>
				</option>
			</c:forEach>
		</select>
	</div>
	<div><button>Initialiser la commande</button></div>
</form>
</body>
</html>