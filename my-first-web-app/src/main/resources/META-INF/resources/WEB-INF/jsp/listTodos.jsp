<%@include file = "common/navigation.jspf" %>
<%@include file = "common/header.jspf" %>

<div class = "container">
	<h1>Your todos</h1>
	<table class = "table">
		<thead>
		<tr>
			<th>Description</th>			
			<th>Target Date</th>
			<th>Is Done</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
		</thead>
		<tbody>
			<c:forEach items = "${todos}" var = "todo">
				<tr>
					<td>${todo.description}</td>
					<td>${todo.targetDate}</td>
					<td>${todo.done}</td>
					<td><a href = "delete-Todo?id=${todo.id}" class = "btn btn-warning">Delete</a></td>
					<td><a href = "update-Todo?id=${todo.id}" class = "btn btn-success">Update</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href = "add-Todo" class = "btn btn-success">Add Todo</a>
</div>

<%@include file = "common/footer.jspf" %>