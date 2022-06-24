<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Création d'un article</title>
</head>
<body>
<h1>Création d'un article</h1>
<form action="/article2/add" method="post">
	<div>
		<label for="code">Code article</label>
		<input id="code" name="code">
	</div>
	<div>
		<label for="name">Libellé de l'article</label>
		<input id="name" name="name">
	</div>
	<div><button>Créer l'article</button></div>
</form>
</body>
</html>