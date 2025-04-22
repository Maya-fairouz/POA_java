<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@page import ="beans.Compte" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accueil d'un Gérant</title>
</head>
<body>
<form action="" method="post">

<fieldset>
<legend> Accueil du Gérant</legend>
<label> <%=((Compte)request.getAttribute("cpte")).getNom() + " " +
((Compte)request.getAttribute("cpte")).getPrenom() %></label> <br/> <br/><br/>
<label> <input type="radio" name = "menu" value="Nouveau" checked> Créer
Compte</label> <br/><br/>
<label> <input type="radio" name = "menu" value="Modiif"> Modifier Compte</label>
<br/><br/>
<label> <input type="radio" name = "menu" value="Deconect"> Déconecter</label>
<br/><br/><br/><br/>
<input type="submit" value="valider Votre choix" >
</fieldset>
</form>
</body>
</html>