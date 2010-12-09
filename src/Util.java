
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
}

