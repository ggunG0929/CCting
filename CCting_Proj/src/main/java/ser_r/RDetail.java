package ser_r;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.BoardService;
import model_r.RBoardDAO;

public class RDetail implements BoardService{
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("mainTitle","게시판 상세");
		System.out.println("RDetail.execute() 실행");
		
		int id = Integer.parseInt(request.getParameter("id"));
		new RBoardDAO().addCount(id);
		request.setAttribute("mainData",new RBoardDAO().detail(id));
	}
}
