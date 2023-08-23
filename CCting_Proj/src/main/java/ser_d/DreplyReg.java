package ser_d;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.BoardService;
import model_d.DistDAO;
import model_d.DistDTO;
import model_d.PageData;

public class DreplyReg implements BoardService {

	public void execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("BmodifyReg execute 실행 ");
		
		DistDTO dto = new DistDTO();
		PageData pd = (PageData)request.getAttribute("pd");
		
		
		dto.setDname(request.getParameter("dname"));
		dto.setDpw(request.getParameter("dpw"));
		dto.setDtitle(request.getParameter("dtitle"));
		dto.setDcontent(request.getParameter("dcontent"));
		dto.setGid(Integer.parseInt(request.getParameter("gid")));
		dto.setSeq(Integer.parseInt(request.getParameter("seq")));
		dto.setLev(Integer.parseInt(request.getParameter("lev")));
				
		new DistDAO().reply(dto);
		
		String msg = "작성이 완료되었습니다.";
		String goUrl = "Ddetail?id="+dto.getDid()+"&page="+pd.page;
		
		request.setAttribute("mainPage", "inc/alert");
		request.setAttribute("msg", msg);
		request.setAttribute("goUrl", goUrl);

	}

}
