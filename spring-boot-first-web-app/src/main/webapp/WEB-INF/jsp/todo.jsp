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

			
			<form method = "post">
  				<div class="form-group">
    				<label>Description</label>
    					 <textarea class="form-control"  name = "desc" rows="3"></textarea>
  				</div>
  				<button type="submit" class="btn btn-primary">Submit</button>
			</form>

			<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	    	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
		</div>	
	</body>
</html> 