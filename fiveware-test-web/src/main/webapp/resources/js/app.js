jQuery(document).ready(function($) {

	$("#btn-cadastro").click(function(event) {
		event.preventDefault();

		if(formValido()){
			var data = {}
			data["titulo"] = $("#titulo").val();
			data["descricao"] = $("#descricao").val();
			data["clt"] = $("#clt").prop("checked") ? true : false;
			data["pj"] = $("#pj").prop("checked") ? true : false;
			data["coop"] = $("#coop").prop("checked") ? true : false;
			data["tipoVaga"] = $('input[name=rd-tipo-vaga]:checked').val();
			data["prazo"] = $("#select-prz").val();

			$("#btn-cadastro").prop("disabled", true);

			$.ajax({
				type : "POST",
				contentType : "application/json",
				url : "salvar-cadastro",
				data : JSON.stringify(data),
				dataType : 'json',
				timeout : 600000,
				success : function(data) {
					$("#btn-cadastro").prop("disabled", false);
					alert(data.mensagem);
				},
				error : function(e) {
					$("#btn-cadastro").prop("disabled", false);
					alert("Erro ao salvar registro !");
				}
			});
		}
	});
	
	function formValido(){
		
		if($("#titulo").val() == ""){
			alert("Informe o titulo");
			return false;
		
		}else if($("#descricao").val() == ""){
			alert("Informe a descricao");
			return false;
		
		}else if($('input[name=rd-tipo-vaga]:checked').val() == undefined){
			alert("Informe o tipo de vaga");
			return false;
		
		}else if($("#select-prz").val() == ""){
			alert("Informe o prazo de inicio");
			return false;
		
		}else{
			return true;
		}
	}

});