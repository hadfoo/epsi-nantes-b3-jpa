<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Liste des catégories</title>
</head>
<body>
<div>
	<h1>Liste des catégories</h1>
	<c:forEach items="${categories}" var="categorie">
		<div>
			<h2>
				<c:out value="${categorie.libelle}"/>
			</h2>
			<ul>
				<c:forEach items="${categorie.articles}" var="article">
					<li><c:out value="${article.name}"/></li>
				</c:forEach>
			</ul>
		</div>
	</c:forEach>
</div>
</body>
</html>