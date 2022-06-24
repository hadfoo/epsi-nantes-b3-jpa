<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Ajout d'une catégorie à un article</title>
</head>
<body>
<h1>Ajout d'une catégorie à un article</h1>
<form action="/article2/categorie2" method="post">
	<div>
		<select name="categorie.id">
			<option></option>
			<c:forEach items="${categories}" var="categorie">
				<option value="${categorie.id}">
					<c:out value="${categorie.libelle}"/>
				</option>
			</c:forEach>
		</select>
	</div>
	<div>
		<input type="hidden" name="article" value="${article}">
		<button>Créer l'article</button>
	</div>
</form>
</body>
</html>