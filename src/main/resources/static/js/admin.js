function admin_approve(){
	var check = confirm("승인하시겠습니까?");
	
	if(check == true){
		location.href="administration_approve";
	}else{
	}
}
function admin_delete(){
	var check = confirm("승인 해제하시겠습니까?");
	
	if(check == true){
		location.href="administration_delete";
	}else{
	}
}
