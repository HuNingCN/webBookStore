$(document).ready(function () {
	$('[data-toggle="offcanvas"]').click(function () {
		$('.row-offcanvas').toggleClass('active')
	});
  
	
	
	var json = {
		"list":[
		  {"id":"1","name":"编程语言"},
		  {"id":"2","name":"算法"},
		  {"id":"3","name":"工具"}
		  ]
    };
	
	var str = "关键字：";
	for(var i=0; i<json.list.length; i++){
		str = str + "<button type='button' class='btn btn-default btn-sm' id='leibie" + json.list[i].id + "' onclick='select(this)'>" + json.list[i].name + "</button>";
	}
	$('#leibie').html(str);
});

function select(button){
	var id = button.id;
	if($("#"+id).hasClass("btn-primary")){
		$("#"+id).removeClass("btn-primary");
	}else{
		$("#"+id).addClass("btn-primary");
	}
}
