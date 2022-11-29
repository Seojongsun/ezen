package min.servlet.thum;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.renderable.ParameterBlock;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Enumeration;

import javax.imageio.ImageIO;
import javax.media.jai.JAI;
import javax.media.jai.RenderedOp;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/ImageThum")
public class ImageThum extends HttpServlet{
	
	

private static Log log = LogFactory.getLog(ImageThum.class);
private static final long serialVersionUID = 1L;


protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	String path = request.getSession().getServletContext().getRealPath("./img");
	
	int size = 10 * 1024 * 1024;
	String filename = "";
	
	try {
		

	
	MultipartRequest multipartRequest = new MultipartRequest(request, path, size, "UTF-8", new DefaultFileRenamePolicy());
	
	Enumeration<?> enumeration = multipartRequest.getFileNames();
	
	String file = (String) enumeration.nextElement();
	
	filename = multipartRequest.getFilesystemName(file);
	
	if (filename == null) {
		response.sendRedirect("/component/image_thumbnail.jsp");
		return;
		
		
	}
	} catch (Exception e) {
	}
	
	ParameterBlock parameterBlock = new ParameterBlock();
	
	parameterBlock.add(path + "\\" + filename);
	
	RenderedOp renderedOp  = JAI.create("fileload", parameterBlock);
	
	BufferedImage bufferedImage = renderedOp.getAsBufferedImage();
	
	BufferedImage bufferedImage2 = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
	
	Graphics2D graphics2d = bufferedImage2.createGraphics();
	
	graphics2d.drawImage(bufferedImage, 0, 0, 100, 100, null);
	
	File file = new File(path + "/sm_" + filename);
	
	ImageIO.write(bufferedImage2, "jpg", file);
	log.info(path);
	
	String file_name = filename;
	log.info(filename);
	
	file_name = URLEncoder.encode(file_name, "UTF-8");
	request.setAttribute("file_name", file_name);
	RequestDispatcher dispatcher = request.getRequestDispatcher("./component/image_thumbnail_download.jsp");
	dispatcher.forward(request, response);
	
	

	
	
	
}



}
