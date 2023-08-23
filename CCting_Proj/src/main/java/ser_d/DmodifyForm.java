package ser_d;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import control.BoardService;
import model_d.DistDAO;

public class DmodifyForm implements BoardService {

	public void execute(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("mainTitle", "게시글 수정");
		System.out.println("DmodifyForm.execute() 실행");
		
		int id = Integer.parseInt(request.getParameter("id"));
		request.setAttribute("mainData", new DistDAO().detail(id));
	}

}
