import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Test1Class")
public class Test1Class extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		// 1 param
//		String text = "<h2>Hello Web Java!</h2>";
//		if(request.getParameter("id") != null) {
//			text = "<h1>User id is " + request.getParameter("id") + "</h1>";
//		}
		
//		try {
//			writer.println(text);
//			writer.println("<h2 style='color:red'>Hello Web Java!</h2>");
			
//			writer.println("Id of user is " + param1);
//
//		}
//		
//		finally {
//			writer.close();
//		}
		
		//array
		String[] nums = request.getParameterValues("nums");
		try
		{
			writer.println("<h1>Numbers from link</h1>");
			for(String n: nums)
			{
				writer.println(n + ",");
			}
		}
		finally
		{
			writer.close();
		}
	}
}