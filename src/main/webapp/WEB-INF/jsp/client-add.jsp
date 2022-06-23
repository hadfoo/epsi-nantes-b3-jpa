<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Ajout d'un client</title>
</head>
<body>
<h1>Ajout d'un client</h1>
<div><a href="/">Accueil</a></div>
<form action="/client/add" method="post">
	<div>
		<label for="prenom">Prénom</label>
		<input id="prenom" name="prenom">
	</div>
	<div>
		<label for="nom">Nom</label>
		<input id="nom" name="nom">
	</div>
	<div>
		<label for="email">Email</label>
		<input id="email" name="email">
	</div>
	<div>
		<button>Ajouter l'article</button>
	</div>
</form>
</body>
</html>