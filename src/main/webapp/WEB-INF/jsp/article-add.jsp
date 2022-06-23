<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Ajout d'un article</title>
</head>
<body>
<h1>Ajout d'un article</h1>
<div><a href="/">Accueil</a></div>
<form action="/article/add" method="post">
	<div>
		<label for="code">Code article</label>
		<input id="code" name="code">
	</div>
	<div>
		<label for="libelle">Libellé de l'article</label>
		<input id="libelle" name="libelle">
	</div>
	<div>
		<input type="hidden" name="fournisseur.id" value="${fournisseur}">
		<button>Ajouter l'article</button>
	</div>
</form>
</body>
</html>