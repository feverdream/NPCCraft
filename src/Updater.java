//~--- JDK imports ------------------------------------------------------------
import java.io.*;

import java.net.*;

/**
 *
 * @author vijay
 */
public class Updater {
    private InputStream     is = null;
    private DataInputStream dis;
    private String          s;
    private URL             u;

    public static Boolean isUpdate() {
        return false;
    }

    public static String GetVersionNumber() {
        return NPCCraft.getVersion();
    }

    public static void execUpdate() {

        /*
         *   okay so we need to
         * 1 Download the Update
         * 2 Exstract the update
         * 3 run the SQL update
         *
         */
        try {}
        catch (Exception ex) {}
        finally {}
    }

    /**
     * @return the u
     */
    public URL getU() {
        return u;
    }

    /**
     * @param u the u to set
     */
    public void setU(URL u) {
        this.u = u;
    }

    /**
     * @return the is
     */
    public InputStream getIs() {
        return is;
    }

    /**
     * @param is the is to set
     */
    public void setIs(InputStream is) {
        this.is = is;
    }

    /**
     * @return the dis
     */
    public DataInputStream getDis() {
        return dis;
    }

    /**
     * @param dis the dis to set
     */
    public void setDis(DataInputStream dis) {
        this.dis = dis;
    }

    /**
     * @return the s
     */
    public String getS() {
        return s;
    }

    /**
     * @param s the s to set
     */
    public void setS(String s) {
        this.s = s;
    }
}

