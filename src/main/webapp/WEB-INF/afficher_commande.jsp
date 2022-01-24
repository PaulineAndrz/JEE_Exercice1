<%@page import="beans.Commande"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% Commande commande = (Commande) request.getAttribute("commande"); 
	
	if ("" == commande.getClient().getNom() 
			|| "" == commande.getClient().getAdresse() 
			|| "" == commande.getClient().getTelephone()
			|| "" == commande.getMontant()
			|| "" == commande.getModePaiement()
			|| "" == commande.getModeLivraison()) {
	%>
		<p>Erreur : Vous n'avez pas rempli tous les champs obligatoires. </p>
		<a href="${pageContext.request.contextPath}/creationCommande"> Cliquez ici</a>
		<span>pour accéder au formulaire de création de commande.</span>
	<%
	} else {
	%>
		Commande créée avec succès.
	<%
	} 
	%>	
	
	<p>Prénom Client : <%= commande.getClient().getPrenom() %></p>
	<p>Nom Client : <%= commande.getClient().getNom() %></p>
	<p>Adresse Client : <%= commande.getClient().getAdresse() %></p>
	<p>Mode de livraison : <%= commande.getModeLivraison() %></p>
	<p>Statut de la livraison : <%= commande.getStatutLivraison() %></p>
	<p>Mode de Paiement : <%= commande.getModePaiement() %></p>
	<p>Statut du Paiement : <%= commande.getStatutPaiement() %></p>
	<p>Montant : <%= commande.getMontant() %></p>
</body>
</html>