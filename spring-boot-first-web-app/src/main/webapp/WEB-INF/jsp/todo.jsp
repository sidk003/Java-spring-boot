<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
	<head>
		<title>First Web App</title>
		<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"	rel="stylesheet">
	</head>
	<body>
		<div class="page-header text-center">
  			<h1>Add Todos</h1>
		</div>
		<div class = "container w-50" style=" margin-top : 50px ;background-color: #eee; padding-top : 15px; width:50%;">

						
			<form:form method = "post" modelAttribute = "todo">
  				<form:hidden path = "id"/>
  				<div class="form-group">
    				<form:label path="desc">Description</form:label>
    					 <form:textarea class="form-control"  path = "desc" rows="3" required = "required"></form:textarea>
  				</div>

				
				<div class="form-group">
    				<form:label path="targetDate">Target Date</form:label>
    					 <form:input class="form-control"  path = "targetDate"  required = "required"></form:input>
    					 <form:errors path = "targetDate" cssClass = "text-warning"/>
  				</div>
  				<div  class="text-center">
  					<button type="submit" class="btn btn-success">Add Todo</button>
				</div>
				
			</form:form> 

			<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	    	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	    	<script src="webjars/bootstrap-datepicker/1.0.1/js/bootstrap-datepicker.js"></script>
	    		<script>
					$('#targetDate').datepicker({format : 'dd/mm/yyyy'});
				</script>
		</div>	
	</body>
</html> 