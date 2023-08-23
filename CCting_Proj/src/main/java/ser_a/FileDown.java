package ser_a;

import java.io.FileInputStream;
import java.net.URLEncoder;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.BoardService;

public class FileDown implements BoardService {

	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String fName = request.getParameter("fName");
		System.out.println("FileDown execute 실행 "+fName);
		
		// 학원
		String path = "C:\\CCting\\CCting_Proj\\src\\main\\webapp\\up";
		// 놋북
//		String path = "C:\\coding0\\CCting\\CCting_Proj\\src\\main\\webapp\\up";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			String encFName = URLEncoder.encode(fName, "utf-8");
			System.out.println(fName + ", " + encFName);
			response.setHeader("Content-Disposition", "attachment;filename="+encFName);
			
			ServletOutputStream sos = response.getOutputStream();
			byte[] buf = new byte[1024];
			while(fis.available()>0) { // 읽을 내용이 남아있다면
				int len = fis.read(buf); // 읽어서 buf에 넣음 넣은 byte 길이(개수)가 len
				sos.write(buf, 0, len); // buf의 처음(0)부터 len만큼 계속 보냄
			}
			
			sos.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
