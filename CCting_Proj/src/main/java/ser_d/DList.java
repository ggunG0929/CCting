package ser_d;

import javax.servlet.http.HttpServletRequest;


import javax.servlet.http.HttpServletResponse;

import control.BoardService;
import model_d.DistDAO;
import model_d.PageData;


public class DList implements BoardService {
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("mainTitle", "작품 목록");
		System.out.println("DList.execute() 실행");
		
		PageData pd = (PageData)request.getAttribute("pd");
		pd.calc();
		
		request.setAttribute("mainData", new DistDAO().list(pd));
	}

}
