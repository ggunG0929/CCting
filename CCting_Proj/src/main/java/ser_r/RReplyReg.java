package ser_r;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import control.BoardService;
import model_r.PageData;
import model_r.RBoardDAO;
import model_r.RBoardDTO;

public class RReplyReg implements BoardService{
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		try {
		
			RBoardDTO dto = new RBoardDTO();
			PageData pd = (PageData)request.getAttribute("pd");
			
			dto.setRtype(request.getParameter("rtype"));
			dto.setTitle( request.getParameter("title"));
			dto.setNic( request.getParameter("nic"));
			dto.setPw( request.getParameter("pw"));
			dto.setContent( request.getParameter("content"));
			
			dto.setGid(Integer.parseInt(request.getParameter("gid")));
			dto.setLev(Integer.parseInt(request.getParameter("lev")));
			dto.setSeq(Integer.parseInt(request.getParameter("seq")));
			
			new RBoardDAO().reply(dto);
					
			request.setAttribute("mainPage", "inc/alert");
			request.setAttribute("msg","작성되었습니다.");
			request.setAttribute("goUrl","RDetail?id="+dto.getId()+"&page="+pd.page);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		
	}

}
