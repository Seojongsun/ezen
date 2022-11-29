package min.serlver.file;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/FileUpload")
public class FileUpload extends HttpServlet {
private static Log log = LogFactory.getLog(FileUpload.class);
	private static final long serialVersionUID = 1L;
  

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String path = request.getSession().getServletContext().getRealPath("./upload");
		int size = 10*1024*1024;
		MultipartRequest multipartRequest = new MultipartRequest(request, path, size, "UTF-8", new DefaultFileRenamePolicy());
		String name = multipartRequest.getParameter("name");
		String subject = multipartRequest.getParameter("subject");
		Enumeration<?> enumeration = multipartRequest.getFileNames();
		String file = (String) enumeration.nextElement();
		
		String filename = multipartRequest.getFilesystemName(file);
		
		if (filename == null) {
			response.sendRedirect("./component/file_upload.jsp");
			return;
		}
		
		//클라이언트가 업로드한 파일의 원본 이름을 호출하고 할당한다.
		String origfilename = multipartRequest.getOriginalFileName(file);
		log.info(origfilename);
		String file_name = filename;
		file_name = URLEncoder.encode(file_name, "UTF-8");
		request.setAttribute("name", name);
		request.setAttribute("subject", subject);
		request.setAttribute("origfilename", origfilename);
		request.setAttribute("file_name", file_name);
		RequestDispatcher dispacher = request.getRequestDispatcher("./component/file_download.jsp");
		dispacher.forward(request, response);
		
		
	
	}

}
