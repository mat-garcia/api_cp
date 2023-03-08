package br.com.hdnit.lotus.domain.dto;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.imgscalr.Scalr;
import org.imgscalr.Scalr.Method;
import org.imgscalr.Scalr.Mode;

/**
 * 
 * 
 * @author Abhishek Somani
 * 
 */
public class ThumbnailGenerator {

	public static File generateThumbnail(String savePath, File f,
			String thumbName, String mimetype) throws IOException {

		BufferedImage img = ImageIO.read(f); // load image

		// Quality indicate that the scaling implementation should do everything
		// create as nice of a result as possible , other options like speed
		// will return result as fast as possible
		// Automatic mode will calculate the resultant dimensions according
		// to image orientation .so resultant image may be size of 50*36.if you
		// want
		// fixed size like 50*50 then use FIT_EXACT
		// other modes like FIT_TO_WIDTH..etc also available.

		BufferedImage thumbImg = Scalr.resize(img, Method.QUALITY,
				Mode.AUTOMATIC, 50, 50, Scalr.OP_ANTIALIAS);
		// convert bufferedImage to outpurstream
		ByteArrayOutputStream os = new ByteArrayOutputStream();

		String type = "";

		if (mimetype.trim().equals("image/jpeg"))
			type = "jpg";

		if (mimetype.trim().equals("image/png"))
			type = "png";

		if (mimetype.trim().equals("image/gif"))
			type = "gif";

		ImageIO.write(thumbImg, type, os);

		File diretorio = new File(savePath);
        if (! diretorio.exists()) {
           diretorio.mkdirs();
       }  
        
		File f2 = new File(savePath + "/" + thumbName + "." + type);

		ImageIO.write(thumbImg, type, f2);

		return f2;

	}

	public static File generateThumbnailPDF(String savePath,File f, String thumbName,
			String mimetype, int heigth, int width) throws IOException {

		BufferedImage img = ImageIO.read(f); // load image

		// Quality indicate that the scaling implementation should do everything
		// create as nice of a result as possible , other options like speed
		// will return result as fast as possible
		// Automatic mode will calculate the resultant dimensions according
		// to image orientation .so resultant image may be size of 50*36.if you
		// want
		// fixed size like 50*50 then use FIT_EXACT
		// other modes like FIT_TO_WIDTH..etc also available.

		BufferedImage thumbImg = Scalr.resize(img, Method.QUALITY,
				Mode.FIT_EXACT,width, heigth , Scalr.OP_ANTIALIAS);
		// convert bufferedImage to outpurstream
		ByteArrayOutputStream os = new ByteArrayOutputStream();

		String type = "";

		if (mimetype.trim().equals("image/jpeg"))
			type = "jpg";

		if (mimetype.trim().equals("image/png"))
			type = "png";

		if (mimetype.trim().equals("image/gif"))
			type = "gif";

		ImageIO.write(thumbImg, type, os);

		
		File diretorio = new File(savePath);
	       if (! diretorio.exists()) {
              diretorio.mkdirs();
          }    
   
		

		File f2 = new File(savePath + "/" + thumbName + "." + type);

		ImageIO.write(thumbImg, type, f2);

		return f2;

	}

}