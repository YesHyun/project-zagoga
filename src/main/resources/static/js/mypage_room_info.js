function write_check(){
	if(document.form.room_no.value == ""){
        alert("방번호를 입력 해주세요.");
        form.gh_name.focus();
		return;
    }else if(document.form.people.value == ""){
        alert("인원수를 입력 해주세요.");
        form.gh_image.focus();
		return;
    
    }else if(document.form.detail.value == ""){
        alert("내용을 입력해주세요.");
    	form.gh_addr1.focus();
		return;
    }
    document.form.submit();
}