$(function() {
	$("#sname").blur(function() {
		// alert(123 + ' ' +ctxpath)
		var sname = $(this).val();

		if ($.trim(sname) != '') {
			$.post(ctxpath + "/CheckNameServlet", {
				sname : sname
			}, function(data) {
				if (data == 1) {
					$("#snameSpan").html("用户名可以使用");
					$("#snameSpan").css("color", "green");
					$("#regBtn").prop("disabled", false);
				} else if (data == 2) {
					$("#snameSpan").html("用户名已经被占用");
					$("#snameSpan").css("color", "red");
					$("#regBtn").prop("disabled", true);
				}
			});
		}
	});
});