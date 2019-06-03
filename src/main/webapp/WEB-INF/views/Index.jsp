<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>

<div class="container">
	
<!-- <h3>Add a new item to the list </h3>
	<form action="add">
	Name: <input type="text" name="name">
	<input type="submit" value="search"></form> -->
	
	<h3>Add a new item to the list</h3>
	<form action="add-item">
	Name: <input type="text" name="name">
	Description: <input type="text" name="description">
	Quantity:<input type="number" name="Quantity">
	Price:<input type="number" name="Price">
	<input type="submit" value="Add Item">
	</form>
	
		
		<table border="1">
			<thead>
				<tr>
					<td>ID</td>
					<td>Name</td>
					<td>Description</td>
					<td>Quantity</td>
					<td>Price</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${ listOfItems}">
					<tr>
						<td>${item.id }</td>
						<td>${item.name }</td>
						<td>${item.description }</td>
						<td>${item.quantity }</td>
						<td>${item.price }</td>
						<td><a href="edit-item?id=${item.id }">Edit</a></td>
						<td><a href="delete-item?id=${item.id }">Delete</a></td>
					</tr>
					</c:forEach>
			</tbody>
		</table>
	</div>





</body>
</html>