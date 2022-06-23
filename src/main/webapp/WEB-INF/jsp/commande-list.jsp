<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Gestion des commandes</title>
</head>
<body>
<h1>Gestion des commandes</h1>
<div><a href="/">Accueil</a></div>
<div>
	<a href="/commande/init">Ajouter une commande</a>
</div>
<div>
	<h2>Filtrer les commandes</h2>
	<div>
		Par client
		<form action="/commande/list" method="get">
			<select name="client">
				<option></option>
				<c:forEach items="${clients}" var="client">
					<option value="${client.email}">
						<c:out value="${client.prenom} ${client.nom}"/>
					</option>
				</c:forEach>
			</select>
			<button>Filtrer</button>
		</form>
	</div>
	<div>
		Par fournisseur
		<form action="/commande/list" method="get">
			<select name="fournisseur">
				<option></option>
				<c:forEach items="${fournisseurs}" var="fournisseur">
					<option value="${fournisseur.id}">
						<c:out value="${fournisseur.nom}"/>
					</option>
				</c:forEach>
			</select>
			<button>Filtrer</button>
		</form>
	</div>
</div>
<div>
	<h2>Liste des commandes</h2>
	<c:forEach items="${commandes}" var="commande">
		<div>
			<div>
				<a href="/commande/${commande.id}">
					<c:out value="${commande.client.prenom} ${commande.client.nom}"/>
				</a>
			</div>
			<div>
				<c:forEach items="${commande.items}" var="item">
					<span>
						<c:out value="${item.article.libelle}"/>
						(<c:out value="${item.quantite}"/>)
					</span>
				</c:forEach>
			</div>
		</div>
	</c:forEach>
</div>
</body>
</html>