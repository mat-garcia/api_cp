/*
 * 
 */
package br.com.hdnit.lotus.foundation.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.log4j.Logger;

/**
 * The Class FileUtils.
 */
public final class FileUtils {

	/** The Constant CENTRALIZER_TEST_FILES_BASE_DIR. */
	private static final String CENTRALIZER_TEST_FILES_BASE_DIR = "testFilesDir";

	/** The Constant CENTRALIZER_WORK_BASE_DIR. */
	private static final String CENTRALIZER_WORK_BASE_DIR = "workDir";

	/**
	 * Instantiates a new file utils.
	 */
	private FileUtils() {
		// Construtor privado.
	}

	/** The Constant LOGGER. */
	public static final Logger LOGGER = Logger.getLogger(FileUtils.class.getName());

	/**
	 * File save.
	 *
	 * @param fileName
	 *            the file name
	 * @param content
	 *            the content
	 * @return the file
	 */
	public static File fileSave(final String fileName, final String content) {

		File file = null;
		FileWriter fileWriter = null;

		try {
			file = new File(fileName);
			fileWriter = new FileWriter(file);
			fileWriter.write(content);
		
			fileWriter.close();
			fileWriter = null;
			if (LOGGER.isInfoEnabled()) {
				LOGGER.info("Arquivo " + fileName + " gravado com sucesso.");
			}
		} catch (IOException e) {
			LOGGER.error("", e);
		}
		return file;
	}

	/**
	 * Creates the file.
	 *
	 * @param path
	 *            the path
	 * @param name
	 *            the name
	 * @return the file
	 * @throws IOException
	 */
	public static File createFile(final File file) throws IOException {

		org.apache.commons.io.FileUtils.forceMkdir(file);

		return file;
	}

	/**
	 * Creates the file.
	 *
	 * @param path
	 *            the path
	 * @param name
	 *            the name
	 * @return the file
	 */
	public static File createFile(final String path, final String name) {
		String baseDir = System.getProperty(CENTRALIZER_WORK_BASE_DIR, "C:");
		if (baseDir == null) {
			baseDir = "";
		}

		File file = null;
		String fileName = "";
		fileName = baseDir + "/" + path + "/" + name;
		file = new File(fileName);
		createPath(file.getParentFile());

		return file;
	}

	/**
	 * Creates the path.
	 *
	 * @param file
	 *            the file
	 */
	private static void createPath(final File file) {
		if (file != null && !file.exists()) {
			createPath(file.getParentFile());
			file.mkdir();
		}
	}

	public static void delete(final String fileName, String imagePath) {

		// Decode the file name (might contain spaces and on) and prepare file
		// object.
		File image = new File(imagePath, fileName);
		if (image != null && image.exists()) {
			image.delete();
		}
	}

	/**
	 * Zip it
	 * 
	 * @param zipFile
	 *            output ZIP file location
	 * @throws IOException
	 */
	public static void zipIt(String zipFile, List<String> fileList) throws IOException {

		byte[] buffer = new byte[1024];
		FileOutputStream fos = null;

		fos = new FileOutputStream(zipFile);
		ZipOutputStream zos = new ZipOutputStream(fos);

		System.out.println("Output to Zip : " + zipFile);

		for (String file : fileList) {

			System.out.println("File Added : " + file);
			File fileObj = new File(file);
			
			ZipEntry ze = new ZipEntry(fileObj.getName());
			zos.putNextEntry(ze);

			FileInputStream in = new FileInputStream(fileObj);

			int len;
			while ((len = in.read(buffer)) > 0) {
				zos.write(buffer, 0, len);
			}

			in.close();
		}

		zos.closeEntry();
		// remember close it
		zos.close();

		System.out.println("Done");

	}

	

	// Utility method
	public static void writeFile(byte[] content, String filename) throws IOException {
		File file = new File(filename);

		if (!file.exists()) {
			System.out.println("not exist> " + file.getAbsolutePath());
			file.createNewFile();

		}
		FileOutputStream fop = new FileOutputStream(file);
		fop.write(content);
		fop.flush();
		fop.close();

	}
}
