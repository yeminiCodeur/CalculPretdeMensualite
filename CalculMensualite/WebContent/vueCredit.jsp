<%@page import="web.CreditModel"%>
<%
   CreditModel model =( CreditModel ) request.getAttribute("model");
 %>
<!DOCTYPE htmle>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/style.css" type="text/css">
<title>Mensualité</title>

</head>
<body>
  <h1>Calcul de simulation de l'emprunt de credit mensuel</h1>
  <div>
  <form method="post" action="controller.php">
  <table>
  <tr>
      <td>Montant Credit</td>
      <td><input type="text" name="credit" value="<%=model.getCredit()%>"><b>FCA</b></td>
  </tr>
  <tr>
	  <td>Taux</td>
	  <td><input type="text" name="taux" value="<%=model.getTaux() %>"><b>%</b></td>
  </tr>
  <tr>
     <td>Durée</td>
     <td><input type="text" name="duree" value="<%=model.getDuree() %>"><b>Mois</b></td>
  </tr>
   <tr>
     <td></td>
     <td><input type="submit" value="Envoyer"></td>
  </tr>
   <tr>
     <td>Mensualité</td>
     <td><%=model.getMensualite()%></td>
     <td>Franc CFA</td>
  </tr>
  </table>
  </form>
  </div>
</body>
</html>