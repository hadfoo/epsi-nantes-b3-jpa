<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Liste des articles</title>
</head>
<body>
<div>
	<a href="/article2/add">Ajouter un article</a>
</div>
<div>
	<h2>Liste des articles</h2>
	<div>
		Catégorie
		<form action="/article2/list" method="get">
			<input name="categorie">
			<button>Filter</button>
		</form>
	</div>
	<c:forEach items="${articles}" var="article">
		<div>
			<c:out value="${article.name}"/>
			(<c:forEach items="${article.categories}" var="categorie">
				<c:out value="${categorie.libelle}"/>,
			</c:forEach>)
		</div>
	</c:forEach>
</div>
</body>
</html>