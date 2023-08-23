package ser_d;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import control.BoardService;

public class DwriteForm implements BoardService {
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("mainTitle", "게시판 작성");
		System.out.println("DwriteForm.execute() 실행");
	}

}
