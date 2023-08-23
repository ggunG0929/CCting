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


public class RFileDelete implements BoardService{
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		// 학원
		String path = "C:\\CCting\\CCting_Proj\\src\\main\\webapp\\up\\";
		// 놋북
//		String path = "C:\\coding0\\CCting\\CCting_Proj\\src\\main\\webapp\\up";
		PageData pd = (PageData)request.getAttribute("pd");
		
		try {
			MultipartRequest mr = new MultipartRequest(
					request,
					path,
					10*1024*1024,
					"utf-8",
					new DefaultFileRenamePolicy()
				);
			
			RBoardDTO dto = new RBoardDTO();
			dto.setId( Integer.parseInt(mr.getParameter("id")));
			dto.setRtype(mr.getParameter("rtype"));
			dto.setTitle( mr.getParameter("title"));
			dto.setNic( mr.getParameter("nic"));
			dto.setPw( mr.getParameter("pw"));
			dto.setContent( mr.getParameter("content"));
			dto.setUpfile( mr.getFilesystemName("upfile"));
			
			String msg = "비밀번호가 일치하지 않습니다.";
			String goUrl = "RModifyForm?id="+dto.getId()+"&page="+pd.page;
			
			System.out.println(dto);
			
			
			
			RBoardDTO delDto = new RBoardDAO().idPwChk(dto);
			
			if(delDto!=null) {//id, pw 가 일치한다면
				
				
				//파일 삭제
				new File(path+"\\"+delDto.getUpfile()).delete();
				new RBoardDAO().fileDelete(dto);
				
				msg = "파일 삭제되었습니다.";
				//goUrl = "BList";
			}
			
					
			request.setAttribute("mainPage", "alert");
			request.setAttribute("msg",msg);
			request.setAttribute("goUrl",goUrl);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		
	}

}
