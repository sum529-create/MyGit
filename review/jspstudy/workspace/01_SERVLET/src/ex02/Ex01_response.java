package ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex01_response")
public class Ex01_response extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Ex01_response() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// response.setCharacterEncoding("UTF-8");
		// response.setContentType("text/html");
		response.setContentType("text/html; charset=UTF-8"); 
		
		PrintWriter out = response.getWriter();
		// out.println();
		// out.print();
		// out.printf(format, args)
		
		
		/*
		out.println("<!DOCTYPE.html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>�������� ���� ����</title>");
		out.println("<style>h1{color:red;}</style>");
		out.println("<script>alert('�ݰ����ϴ�.');</script>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>�ȳ��ϼ���</h1>");
		out.println("</body>");
		out.println("</head>");
		out.println("</html>");
		 * */
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
