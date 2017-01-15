<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title></title>
<link rel="stylesheet" href="resources/css/style.css" />
<link rel="stylesheet" href="resources/css/bootstrap.min.css" />
<link rel="stylesheet" href="resources/css/bootstrap-theme.min.css" />
</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand">Cadastro de Vagas</a>
			</div>
		</div>
	</nav>
	<div class="container" style="min-height: 500px">

		<div class="starter-template">
			<form class="form-horizontal" id="cadastro-form">
				<div class="form-group form-group-lg">
					<label>Titulo</label> <input type=text class="form-control" id="titulo">
				</div>
				<div class="form-group form-group-lg">
					<label>Descricao</label> <input type=text class="form-control" id="descricao">
				</div>
				<div class="form-group form-group-lg">
					<label>Forma de contratação</label><br /> 
					<label class="checkbox-inline"><input type="checkbox" id="clt" value="">CLT</label> 
					<label class="checkbox-inline"><input type="checkbox" id="pj" value="">PJ</label> 
					<label class="checkbox-inline"><input type="checkbox" id="coop" value="">Cooperado</label>
				</div>
				<div class="form-group form-group-lg">
					<label>Vaga para:</label><br /> 
					<label class="radio-inline"><input type="radio" name="rd-tipo-vaga" value="pne">PNE</label> 
					<label class="radio-inline"><input type="radio" name="rd-tipo-vaga" value="todos">Todos</label>
				</div>
				<div class="form-group">
					<label for="sel1">Prazo para início:</label> <select class="form-control" id="select-prz">
						<option value="">Selecione</option>
						<option value="imediato">Imediato</option>
						<option value="15 dias">Ate 15 dias</option>
						<option value="a negociar">A Negociar</option>
					</select>
				</div>
				<div class="col-xs-2">
					<button id="btn-cadastro" class="btn btn-primary btn-xx">Cadastrar Vaga</button>
				</div>
			</form>

		</div>
	</div>

</body>
<script src="resources/js/jquery-3.1.1.min.js"></script>
<script src="resources/js/app.js"></script>
</html>