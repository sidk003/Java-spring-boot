<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<head>
		<title>Todos for ${name}</title>
		<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"	rel="stylesheet">
	</head>
	<body>
		<div class = "container">
			<table class = "table table-striped table-responsive">
			<div class="page-header">
  				<h1>Your todos are</h1>
			</div>
			<thead>
				<tr>
					<th>Description</th>
					<th>Date</th>
					<th>Progress</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items = "${todos}" var = "todo">
					<tr>
						<td>${todo.desc}</td>
						<td>${todo.targetDate}</td>
						<td>${todo.done}</td>
						<td>
						<a class="btn btn-warning" href = "/delete-todo?id=${todo.id}">Delete</a>
							
						</td>
					</tr>
				</c:forEach>	
			</tbody>
			</table> 
		
			<div class = "text-center">
				<a class="btn btn-primary btn-lg" href = "/add-todos">Add a todo</a>
			</div>
		
			<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	    	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
		</div>
	</body>
</html> 