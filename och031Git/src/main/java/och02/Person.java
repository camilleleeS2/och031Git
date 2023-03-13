package och02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Person
 */
@WebServlet("/Person")
public class Person extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");  
		response.setContentType("text/html;charset=utf-8");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String job = request.getParameter("job");
		String[] notice = request.getParameterValues("notice");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<br>이름 : " + name);
		out.println("<br>아이디 : " + id);
		out.println("<br>암호 : " + password);
		out.println("<br>성별 : " + gender);
		out.println("<br>직업 : " + job);
		out.println("<br>수신메일 : ");
		
		if(notice != null) {
			for(int i=0; i<notice.length; i++) {
				out.println(notice[i] + " ");
			}
		} else out.println("없음");
		
		out.println("</body></html>");
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
