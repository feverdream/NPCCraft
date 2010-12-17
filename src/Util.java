
/**
 *
 * @author vijay
 */
public class Util {

    /**
     *
     *
     * @param   obj     The obj.
     * @throws  java.security.NoSuchAlgorithmException
     * @return  A <code>String</code> object.
     */
    public static String MD5(Object obj) throws java.security.NoSuchAlgorithmException {
        String                      buffer = obj.toString();
        java.security.MessageDigest digest = java.security.MessageDigest.getInstance("MD5");

        digest.update(buffer.getBytes());

        byte[] b = digest.digest();

        buffer = "";

        for (int i = 0; i < b.length; i++) {
            buffer += Integer.toString((b[i] & 0xff) + 0x100, 16).substring(1);
        }

        return buffer;
    }
    private  String Black = "§0 ";
    private  String Navy = "§1 ";
    private String Green = "§2 ";
    private  String Blue = "§3 ";
    private String Red = "§4 ";
    private String Purple = "§5 ";
    private  String Gold = "§6 ";
    private String LightGray = "§7 ";
    private String Gray = "§8 ";
    private String DarkPurple = "§9 ";
    private String LightGreen = "§a ";
    private  String LightBlue = "§b ";
    private String Rose = "§c ";
    private String LightPurple = "§d ";
    private String Yellow = "§e ";
    private  String White = "§f ";
    /**
     * @return the Black
     */
    public String getBlack() {
        return Black;
    }

    /**
     * @return the Navy
     */
    public String getNavy() {
        return Navy;
    }

    /**
     * @return the Green
     */
    public String getGreen() {
        return Green;
    }

    /**
     * @return the Blue
     */
    public String getBlue() {
        return Blue;
    }

    /**
     * @return the Red
     */
    public String getRed() {
        return Red;
    }

    /**
     * @return the Purple
     */
    public String getPurple() {
        return Purple;
    }

    /**
     * @return the Gold
     */
    public String getGold() {
        return Gold;
    }

    /**
     * @return the LightGray
     */
    public String getLightGray() {
        return LightGray;
    }

    /**
     * @return the Gray
     */
    public String getGray() {
        return Gray;
    }

    /**
     * @return the DarkPurple
     */
    public String getDarkPurple() {
        return DarkPurple;
    }

    /**
     * @return the LightGreen
     */
    public String getLightGreen() {
        return LightGreen;
    }

    /**
     * @return the LightBlue
     */
    public String getLightBlue() {
        return LightBlue;
    }

    /**
     * @return the Rose
     */
    public String getRose() {
        return Rose;
    }

    /**
     * @return the LightPurple
     */
    public String getLightPurple() {
        return LightPurple;
    }

    /**
     * @return the Yellow
     */
    public String getYellow() {
        return Yellow;
    }

    /**
     * @return the White
     */
    public String getWhite() {
        return White;
    }
}

