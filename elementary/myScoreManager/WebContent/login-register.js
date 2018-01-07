/*
 *
 * login-register modal
 * Autor: Creative Tim
 * Web-autor: creative.tim
 * Web script: #
 * 
 */
function showRegisterForm(){
	/*登录的出场*/
    $('.loginBox').fadeOut('fast',function(){
    	//注册进场
        $('.registerBox').fadeIn('fast');
        //登录底部出场,注册底部进场
        $('.login-footer').fadeOut('fast',function(){
            $('.register-footer').fadeIn('fast');
        });
        //修改注册模态框的标题
        $('.modal-title').html('注册');
    }); 
    $('.error').removeClass('alert alert-danger').html('');
       
}
function showLoginForm(){
	/*注册模态框的出场动画*/
    $('#loginModal .registerBox').fadeOut('fast',function(){
    	/*登录进场*/
        $('.loginBox').fadeIn('fast');
        /*注册底部隐藏,登录底部显示*/
        $('.register-footer').fadeOut('fast',function(){
            $('.login-footer').fadeIn('fast');    
        });
        /*修改模态框标题为登录*/
        $('.modal-title').html('登录');
    });       
     $('.error').removeClass('alert alert-danger').html(''); 
}
/*模态框 1s=1000ms*/
function openLoginModal(){
    showLoginForm();
    /*延迟230ms之后显示登录模态框*/
    setTimeout(function(){
        $('#loginModal').modal('show');    
    }, 230);
    
}
/*打开注册模态框*/
function openRegisterModal(){
    showRegisterForm();
    //延迟230ms之后显示注册模态框
    setTimeout(function(){
        $('#loginModal').modal('show');    
    }, 230);
    
}

function loginAjax(){
    //想服务器发送请求并接收返回的数据
	$.ajax({
        url:"CheckLogin",
        type:"post",
        data:$('#loginf').serialize(),
        success:function(data){
            //success请求成功时执行的方法，这data是服务器返回的数据
        	if (data==1) {
				alert("登录成功");
				//进入主页
				window.location.replace("showStudent.jsp")
			}else {
				shakeModal();
			}
        },
        error:function(e){
            //请求失败时执行的方法
        }
    }); 	
}
//注册用户
function registerAjax(){
	//想服务器发送请求并接收返回的数据
	$.ajax({
        url:"registerAction",
        type:"post",
        data:$('#registerf').serialize(),
        success:function(data){
            //success请求成功时执行的方法，这data是服务器返回的数据
        	if (data==1) {
				alert("注册成功");
				//显示登录窗口
				showLoginForm();
			}else if(data==2){
				alert("两次密码不相同请重新输入")
			}else if(data==3){
				alert("用户名已存在");
			}else if(data==4){
				alert("用户名和密码不能为空");
			}
        },
        error:function(e){
            //请求失败时执行的方法
        }
    }); 		
}

function shakeModal(){
    $('#loginModal .modal-dialog').addClass('shake');
             $('.error').addClass('alert alert-danger').html("账号或密码无效");
             $('input[type="password"]').val('');
             setTimeout( function(){ 
                $('#loginModal .modal-dialog').removeClass('shake'); 
    }, 1000 ); 
}

   