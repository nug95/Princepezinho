<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.ArrayList , model.Crianca" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Princepezinho - Crianca</title>
</head>
<body>
<center><h1>Adicionar Crian&ccedil;a</h1></center>

<form action="HCrianca" method="post">
	<label>
		Nome:
		<input type="text" name="c_nome">
	</label>
	<label>
		Data nascimento:
		<input type="date" name="c_dataNascimento">
	</label>
	<label>
		Cartão cidadão:
		<input type="text" name="c_ccidadao">
	</label>
	<label>
		Observações:
		<textarea name="c_observacoes" rows="4" cols="25"></textarea>
	</label>
	<label>
		<input type="submit" value="Adicionar">
	</label>
</form>
<center><h2>Lista de Crianças</h2></center>
<table>
	<tr>
		<th>Nome</th>
		<th>Observações</th>
	</tr>
	<%
		ArrayList arC = (ArrayList) request.getAttribute("listaCrianca");
		
		for (int i=0; i < arC.size(); i++){
			Crianca c = (Crianca) arC.get(i);
			
			out.append("<tr><td>" + c.getNome() + "</td>");
			out.append("<td>" + c.getObservacoes() + "</td></tr>");
		}
	%>
</table>

</body>
</html>