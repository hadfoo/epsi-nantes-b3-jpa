<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Ajout d'articles à la commande</title>
</head>
<body>
<h1>Ajout d'articles à la commande</h1>
<div><a href="/">Accueil</a></div>
<div>
	<a href="/commande/list">Liste des commandes</a>
</div>
<div>
	Numéro de commande : <c:out value="${commande.id}"/>
</div>
<div>
	Client : <c:out value="${commande.client.prenom} ${commande.client.nom}"/>
</div>
<div>
	<c:forEach items="${commande.items}" var="item">
		<div>
			<c:out value="${item.article.libelle}"/>
			(<c:out value="${item.quantite}"/>)
		</div>
	</c:forEach>
</div>
<form action="/commande/detail" method="post">
	<div>
		<label for="article">Article</label>
		<select id="article" name="article.id">
			<option></option>
			<c:forEach items="${articles}" var="article">
				<option value="${article.id}">
					<c:out value="${article.libelle}"/>
				</option>
			</c:forEach>
		</select>
	</div>
	<div>
		<label for="quantite">Quantité</label>
		<input type="number" name="quantite">
	</div>
	<div>
		<input type="hidden" name="commande.id" value="${commande.id}">
		<button>Ajouter l'article à la commande</button>
	</div>
</form>
</body>
</html>