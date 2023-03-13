package och02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Num
 */
@WebServlet("/Num")
public class Num extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Num() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");  
		response.setContentType("text/html;charset=utf-8");
		
		int num1 = Integer.parseInt(request.getParameter("num1")); 
		int num2 = Integer.parseInt(request.getParameter("num2")); 
		float num3 = (float)num1/num2;
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("<h1>연산결과</h1>");
		out.printf("<h5>덧셈 : %d + %d = %d", num1, num2, num1+num2);
		out.printf("<h5>뺄셈 : %d - %d = %d", num1, num2, num1-num2);
		out.printf("<h5>곱셈 : %d * %d = %d", num1, num2, num1*num2);
		out.printf("<h5>나눗셈 : %d / %d = %f", num1, num2, num3);
		out.println("</body><html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
