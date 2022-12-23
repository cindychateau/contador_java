<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contador</title>
</head>
<body>
	<h1>Haz visitado el sitio <c:out value="${contador}" /> veces</h1>
	<a href="/">¿Probamos otra visita?</a>
	<a href="/reset"><button>Reiniciar sesión</button></a>
</body>
</html>