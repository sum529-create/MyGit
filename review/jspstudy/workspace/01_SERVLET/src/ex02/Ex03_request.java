package ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex03_request
 */
@WebServlet("/Ex03_request")
public class Ex03_request extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ex03_request() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		// �Ķ���ͷ� name, age, address�� ���޵ȴ�.
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String address = request.getParameter("address");

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		// ����� ���� ����
		out.println("<!DOCTYPE html>");		// html5
		out.println("<head>");
		out.println("<title>����</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>�̸�: "+ name + "</h3>");
		out.println("<h3>����: "+ age + "</h3>");
		out.println("<h3>�ּ�: "+ address + "</h3>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
