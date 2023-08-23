package ser_p;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.BoardService;
import model_m.MemberDAO;

public class MList implements BoardService{

	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		request.setAttribute("mainTitle", "회원 목록");
		System.out.println("MList.execute() 실행");
		
		request.setAttribute("mainData", new MemberDAO().list());
	}
}
