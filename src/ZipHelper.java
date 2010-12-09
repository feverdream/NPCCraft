//~--- JDK imports ------------------------------------------------------------

import java.io.*;

import java.util.*;
import java.util.zip.*;

/**
 *
 * @author vijay
 */
public class ZipHelper {

    /**
     *  Zips DirToZip to Name
     *
     * @param   DirToZip        The DirToZip.
     * @param   Name    The Name.
     * @throws  IOException
     */
    public static void Zip(String DirToZip, String Name) throws IOException {

        // create a ZipOutputStream to zip the data to
        ZipOutputStream zos  = new ZipOutputStream(new FileOutputStream(Name));
        String          path = "";

        Zip(DirToZip, zos, path);

        // close the stream
        zos.close();
    }

    /**
     *  Zips DirToZip to Name
     *
     * @param   DirToZip        The DirToZip.
     * @param zos The Zip Output Stream
     * @param path The Path to start the zip itaration
     * @throws  IOException
     */
    public static void Zip(String DirToZip, ZipOutputStream zos, String path) throws IOException {
        File zipDir = new File(DirToZip);

        // get a listing of the directory content
        String[] dirList    = zipDir.list();
        byte[]   readBuffer = new byte[2156];
        int      bytesIn    = 0;

        // loop through dirList, and zip the files
        for (int i = 0; i < dirList.length; i++) {
            File f = new File(zipDir, dirList[i]);

            if (f.isDirectory()) {
                String filePath = f.getPath();

                Zip(filePath, zos, path + f.getName() + "/");

                continue;
            }

            FileInputStream fis = new FileInputStream(f);

            try {
                ZipEntry anEntry = new ZipEntry(path + f.getName());

                zos.putNextEntry(anEntry);
                bytesIn = fis.read(readBuffer);

                while (bytesIn != -1) {
                    zos.write(readBuffer, 0, bytesIn);
                    bytesIn = fis.read(readBuffer);
                }
            } finally {
                fis.close();
            }
        }
    }

    /**
     *
     *
     * @param       zf      The zf.
     * @param       DirToUnzipTo    The DirToUnzipTo.
     * @throws      IOException
     */
    public static void Unzip(ZipFile zf, String DirToUnzipTo) throws IOException {
        Enumeration e = zf.entries();

        while (e.hasMoreElements()) {
            ZipEntry ze = (ZipEntry) e.nextElement();

            System.out.println("Unzipping " + ze.getName());

            FileOutputStream fout = new FileOutputStream(DirToUnzipTo + "//" + ze.getName());
            InputStream      in   = zf.getInputStream(ze);

            for (int c = in.read(); c != -1; c = in.read()) {
                fout.write(c);
            }

            in.close();
            fout.close();
        }
    }
}
