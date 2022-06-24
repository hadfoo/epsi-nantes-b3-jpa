<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Création d'une catégorie</title>
</head>
<body>
<h1>Création d'une catégorie</h1>
<form action="/categorie2/add" method="post">
	<div>
		<label for="code">Code</label>
		<input id="code" name="code">
	</div>
	<div>
		<label for="libelle">Libellé</label>
		<input id="libelle" name="libelle">
	</div>
	<div><button>Créer la catégorie</button></div>
</form>
</body>
</html>