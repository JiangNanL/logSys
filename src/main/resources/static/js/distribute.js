$(function() {
    //实现全选反选
    $("#theadInp").on('click', function() {
        $("tbody input:checkbox").prop("checked", $(this).prop('checked'));
    })
})   
    function submit(){
    	var checkId = [];
    	//获取已选择的复选框的值
    	$("input[name='checkbox']:checked").each(function(i){
    		checkId[i] = $(this).val();
    	});
    	console.log(checkId)
    var aid = $("#aid").val();
    	$.ajax({
    		url:"/distributeFunction",
    		traditional:true,
    		type:"post",
    		data: {"checkId":checkId,"aid":aid},
    		dataType:"json",
    		error : function() {// 请求失败处理函数
    			alert("请求失败");
            },
    		success: function(result){
    			alert(result.msg);
    		},
    		
    		
    	})
    }
