package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/arts/*")
public class ArtsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String serviceStr = request.getRequestURI().substring(
				(request.getContextPath()+"/arts/").length()
				);
		ArtsService service;
		try {
			request.setCharacterEncoding("utf-8");
			request.setAttribute("mainPage", serviceStr);
			service = (ArtsService)Class.forName("ser_p."+serviceStr).newInstance();	// try catch
			service.execute(request, response);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("views/template.jsp");
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
