package zhujie_action;

/*import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
@Namespace("/")
@ParentPackage("struts-default")
public class HelloAction {
	
	@Action(value="h",results={@Result(name="success",type="redirect",location="/success.jsp")})
	public String zhu(){
		System.out.println("55555555555");
		return "success";
	}

}*/


import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

@Namespace("/")
@ParentPackage("struts-default")
public class HelloAction {
	@Action(value="hello",results={@Result(name="success",type="redirect",location="/success.jsp")} )
	public String showHello() {
		System.out.println("Hello World!!!");
		
		return "success";
		
	}
}
