package ser_r;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.BoardService;
import model_r.PageData;
import model_r.RBoardDAO;


public class RList implements BoardService{

	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		request.setAttribute("mainTitle","리뷰 게시판 목록");
		
		PageData pd = (PageData)request.getAttribute("pd");
		pd.calc();
		System.out.println("RList.execute() 실행:"+pd.page);

		request.setAttribute("mainData",new RBoardDAO().list(pd));
	}
}
