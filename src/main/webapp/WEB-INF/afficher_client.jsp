<%@page import="beans.Client"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% Client client = (Client) request.getAttribute("client");
	
		if ("" == client.getNom() || "" == client.getAdresse() || "" == client.getTelephone()) {
	%>
		<p>Erreur : Vous n'avez pas rempli tous les champs obligatoires. </p>
		<a href="${pageContext.request.contextPath}/creationClient"> Cliquez ici</a>
		<span>pour accéder au formulaire de création de client.</span>
	<%
	} else {
	%>
		Client créé avec succès.
	<%
	} 
	%>
	
	<p>Prénom : <%= client.getPrenom() %></p>
	<p>Nom : <%= client.getNom() %></p>
	<p>Adresse : <%= client.getAdresse() %></p>
	<p>Telephone : <%= client.getTelephone() %></p>
	<p>Email : <%= client.getEmail() %></p>
</body>
</html> 