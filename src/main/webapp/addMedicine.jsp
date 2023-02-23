<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Medicine</title>
</head>
<body>
<h1>Add Medicine</h1>
<form method="post" action="AddMedicineServlet">
<label for="batchNo">BatchNo:</label>
<input type="text" id="batchNo" name="batchNo"><br><br>
<label for="name">MedicineName</label>
<input type="text" id="name" name="name"><br><br>
<label for="description">Description:</label>
<textarea id="description" name="description"></textarea><br><br>
<label for="price">Price:</label>
<input type="text" id="price" name="price"><br><br>
<label for="quantity">Quantity:</label>
<input type="text" id="quantity" name="quantity"><br><br>
<label for="Section">Section:</label>
<select id="section" name="section">
<% for (char c='A';c<='Z';c++) {%>
<option value="<%= c %>"<%= c %>></option>
<% } %>
</select>
<label for="expireryDate">Expiration Date:</label>
<input type="date" id="expireryDate" name="expireryDate"><br><br>
<label for="dealerName">Dealer Name:</label>
<input type="text" id="dealerName" name="dealerName"><br><br>
<label for="dealerContact">Dealer Cantact:</label>
<input type="text" id="dealerContact" name="dealerContact"><br><br>
<input type="submit" value="Add">
</form>
</body>
</html>