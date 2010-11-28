/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.util.logging.Level;

/**
 *
 * @author vijay
 */
public class SQLHelper {
    private static Connection conn = null;
    public SQLHelper(){

    }
    public static void Connect(){
        try{
            String uname = ConfigParser.getValue("username");
            String pword = ConfigParser.getValue("password");
            String port = ConfigParser.getValue("port");
            String db = ConfigParser.getValue("database");
            String serv = ConfigParser.getValue("server");
            String url = "jdbc:mysql://" + serv + ":" + port + "/" + db;
            Class.forName("com.mysql.jbdc.Driver").newInstance();
            conn = DriverManager.getConnection(url,uname,pword);
        }
        catch(Exception ex){
            NPCCraft.log.log(Level.WARNING, "[*] NPCCraft: {0}", ex.toString());
        }
        finally{
            if(conn != null){
                 NPCCraft.log.log(Level.INFO,  "[*] NPCCraft: Connected to Database Sucsessfuly!");
            }
        }
    }
    public static void Disconnect(){
        try{
            conn.close();
        }
        catch(Exception ex){
            NPCCraft.log.log(Level.WARNING, "[*] NPCCraft: {0}", ex.toString());

        }
        finally{
             if(conn != null){
                 NPCCraft.log.log(Level.INFO,  "[*] NPCCraft: Failed to Disconnect From Database!");
            }
        }
    }
    public static String execQuery(String query) throws SQLException{
        String Res = null;
        Statement st = conn.createStatement();
        st.execute(query);
        ResultSet rst = st.getResultSet();
        Res = rst.toString();
        return Res;
    }
    public String sanitizeInput( final String value ) {
         if ( value == null )
             return null;

         if ( value != null && value.trim().length() == 0 )
             return "";

        // naive xss + sql injection sanitation, use regex.pattern instead
         return value.
         replaceAll("&"       , "&amp;").
         replaceAll("&#x73;"  , "&amp;").
         replaceAll("<"       , "&lt;").
         replaceAll(">"       , "&gt;").
         replaceAll("\\("     , "&#40;").
         replaceAll("\\)"     , "&#41;").
         replaceAll("'"       , "&#x27").
         replaceAll("\""      , "&quot;").
         replaceAll("/"       , "&#x2F;").
         replaceAll("%"       , "&#37;").
         replaceAll("(?i)eval\\((.*)\\)", "[xss-eval]").
         replaceAll("(?i)script"        , "[xss-script]").
         replaceAll("(?i)[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']","\"\"").
         replaceAll("(?i)<img|><script|script|%3cscript%3cimg|<script|<img|<script|<img|<script|<img|%0d","").
         replaceAll("(?i)(select|grant|delete|insert|drop|alter|replace|truncate|update|create|rename|describe|union)","[xsql]");
        // replace with-> return ESAPI.encoder().encodeForURL(ESAPI.encoder().encodeForHTML(ESAPI.encoder().encodeForJavaScript(value)));
        // canonical = sun.text.Normalizer.normalize( input, Normalizer.DECOMP, 0 ); 
    }
    /**
     * @return the conn
     */
    public Connection getConn() {
        return conn;
    }

    /**
     * @param conn the conn to set
     */
    public void setConn(Connection conn) {
        this.conn = conn;
    }
}
