import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*Простой пример*/
/*@WebServlet("/Test1Class")
public class Test1Class extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("<h2>Hello Web Java!</h2>");
		writer.println("<h2 style='color:red'>Hello Web Java!</h2>");
	}
}*/

/*Применение doGet*/
/*@WebServlet("/Test1Class")
public class Test1Class extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter writer1 = response.getWriter();
	
		writer1.println("<h2 style='color:green'>Hello Web Java!</h2>");
		if(request.getParameter("id") != null)
		{
			writer1.println("<h2>You entered: " + request.getParameter("id") + "</h2>");
		}
		else
		{
			try
			{
				writer1.println("<h2>ID not entered yet\nEnter for example ?id=11</h2>");
			}
			catch(Exception exception1)
			{
				writer1.println("Error: " + exception1);
			}
			finally
			{
				writer1.close();
			}
		}
	}
}*/

/*Применение doGet: String-массив*/
@WebServlet("/Test1Class")
public class Test1Class extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter writer1 = response.getWriter();
		
		String[] nums = request.getParameterValues("nums");
		writer1.println("<h2 style='color:green'>Hello Web Java!</h2>");
		if(request.getParameter("id") != null)
		{
			writer1.println("<h2>You entered: " + request.getParameter("id") + "</h2>");
		}
		else
		{
			try
			{
				writer1.println("<h2>ID not entered yet\nEnter for example ?nums=1&nums=2&nums=3</h2>");
				for(String n: nums)
				{
					writer1.print(n + "");
				}
			}
			finally
			{
				writer1.close();
			}
		}
	}
}