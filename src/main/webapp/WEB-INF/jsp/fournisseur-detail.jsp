<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Détail fournisseur</title>
</head>
<body>
<h1>Détail fournisseur</h1>
<div><a href="/">Accueil</a></div>
<div>
	<a href="/fournisseur/list">Liste des fournisseurs</a>
</div>
<div>
	<h2>Informations</h2>
	<div>
		Nom : <c:out value="${fournisseur.nom}"/>
	</div>
	<div>
		Contact : <a href="mailto:${fournisseur.email}"><c:out value="${fournisseur.email}"/></a>
	</div>
</div>
<div>
	<h2>Articles du fournisseur</h2>
	<div><a href="/article/add?fournisseur=${fournisseur.id}">Ajouter un article</a></div>
	<div>
		<c:forEach items="${fournisseur.articles}" var="article">
			<div><c:out value="${article.libelle}"/></div>
		</c:forEach>
	</div>
</div>
</body>
</html>