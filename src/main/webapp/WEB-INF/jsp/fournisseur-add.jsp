<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Ajout d'un fournisseur</title>
</head>
<body>
<h1>Ajout d'un fournisseur</h1>
<div><a href="/">Accueil</a></div>
<form action="/fournisseur/add" method="post">
	<div>
		<label for="nom">Nom du fournisseur</label>
		<input id="nom" name="nom">
	</div>
	<div>
		<label for="email">Email de contact</label>
		<input id="email" name="email">
	</div>
	<div><button>Ajouter le fournisseur</button></div>
</form>
</body>
</html>