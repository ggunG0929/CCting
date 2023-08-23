package ser_r;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import control.BoardService;
import model_r.RBoardDAO;
import model_r.RBoardDTO;

public class RWriteReg implements BoardService{
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		// 학원
		String path = "C:\\CCting\\CCting_Proj\\src\\main\\webapp\\up";
		// 놋북
//		String path = "C:\\coding0\\CCting\\CCting_Proj\\src\\main\\webapp\\up";
		
		
		try {
			MultipartRequest mr = new MultipartRequest(
					request,
					path,
					10*1024*1024,
					"utf-8",
					new DefaultFileRenamePolicy()
				);
			
			RBoardDTO dto = new RBoardDTO();
			dto.setTitle(mr.getParameter("title"));
			dto.setNic(mr.getParameter("nic"));
			dto.setPw(mr.getParameter("pw"));
			dto.setContent(mr.getParameter("content"));
			dto.setUpfile(mr.getFilesystemName("upfile"));
			dto.setRtype(mr.getParameter("rtype"));
			
			new RBoardDAO().write(dto);
			
			System.out.println("newId:"+dto.getId());
			
			
			request.setAttribute("mainPage", "inc/alert");
			request.setAttribute("msg","입력되었습니다.");
			request.setAttribute("goUrl","RDetail?id="+dto.getId());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		
	}

}
