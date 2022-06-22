<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Article</title>
</head>
<body>
<h1>Article</h1>
<div>
	<strong>Code :</strong>
	<c:out value="${article.code}"/>
</div>
<div>
	<strong>Libellé :</strong>
	<c:out value="${article.name}"/>
</div>
</body>
</html>