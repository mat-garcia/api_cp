/*
 * 
 */
package br.com.hdnit.lotus.foundation.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

// TODO: Auto-generated Javadoc
/**
 * The Class ZIPUtils.
 */
public final class ZIPUtils {
    
    /** The Constant BUFFER_SIZE. */
    private static final int BUFFER_SIZE = 1024;

    /**
     * Instantiates a new ZIP utils.
     */
    private ZIPUtils() {
        // Construtor privado.
    }

    /**
     * Unzip.
     *
     * @param input the input
     * @return the map
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static Map unzip(final InputStream input) throws IOException {
        ZipInputStream in = new ZipInputStream(input);
        ZipEntry entry = null;
        ByteArrayOutputStream out = null;
        Map zipContent = new HashMap();
        byte[] buf = new byte[BUFFER_SIZE];
        int len;

        while ((entry = in.getNextEntry()) != null) {
            out = new ByteArrayOutputStream();

            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
            out.close();
            zipContent.put(entry.getName(), out.toByteArray());
        }

        in.close();

        return zipContent;
    }

    /**
     * Zip.
     *
     * @param output the output
     * @param content the content
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static void zip(final OutputStream output, final Map content)
            throws IOException {
        byte[] buf = new byte[BUFFER_SIZE];
        byte[] bytes = null;
        ByteArrayInputStream in = null;
        String entryName = null;
        int len;
        ZipOutputStream out = new ZipOutputStream(output);

        Iterator it = content.keySet().iterator();
        while (it.hasNext()) {
            entryName = (String) it.next();
            bytes = (byte[]) content.get(entryName);
            out.putNextEntry(new ZipEntry(entryName));

            in = new ByteArrayInputStream(bytes);
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }

            out.closeEntry();
        }
        out.close();
    }

}
