<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Accueil</title>
</head>
<body>
<div>
	<a href="/article/add">Ajouter un article</a>
</div>
<div>
	<h2>Liste des articles (toutes catégorie)</h2>
	<c:forEach items="${articles}" var="article">
		<div>
			<a href="/article/${article.code}">
				<c:out value="${article.name}"/>
				(<c:out value="${article.informations.numeroLot}"/>,
				<c:out value="${article.categorie.libelle}"/>)
			</a>
		</div>
	</c:forEach>
</div>
</body>
</html>