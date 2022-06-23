<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Liste des clients</title>
</head>
<body>
<h1>Liste des clients</h1>
<div><a href="/">Accueil</a></div>
<div>
	<a href="/client/add">Ajouter un client</a>
</div>
<div>
	<c:forEach items="${clients}" var="client">
		<div>
			<c:out value="${client.prenom} ${client.nom}"/>
		</div>
	</c:forEach>
</div>
</body>
</html>