<%@ include file = "common/header.jspf"  %>
<%@ include file = "common/navigation.jspf"  %>

		<div class = "container">
			<div class="page-header text-center">
  				<h1>Welcome! ${name}</h1>
			</div>
			<div class="text-center">
				<a  type="button " class="btn btn-primary" href = "/list-todos">Click here to manage Todos</a>
			</div>
		</div>
		
<%@ include file = "common/footer.jspf"  %>