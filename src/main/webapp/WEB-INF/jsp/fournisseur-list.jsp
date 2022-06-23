<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Liste des fournisseurs</title>
</head>
<body>
<h1>Liste des fournisseurs</h1>
<div><a href="/">Accueil</a></div>
<div>
	<a href="/fournisseur/add">Ajouter un fournisseur</a>
</div>
<div>
	<c:forEach items="${fournisseurs}" var="fournisseur">
		<div>
			<a href="/fournisseur/${fournisseur.id}">
				<c:out value="${fournisseur.nom}"/>
			</a>
		</div>
	</c:forEach>
</div>
</body>
</html>