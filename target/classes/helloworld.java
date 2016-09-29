import java.io.IOException;
import java.io.PrintWriter;
@webServlet("/hello")
public class helloworld {
@override
public void doget(HttpServletRequest request,HttpServeletResponse response)
throws ServletException,IOException{
	PrintWriter out =response.getWriter();
	out.println("Helloword");
}
}
