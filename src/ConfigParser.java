
/**
 *
 * @author vijay
 */
public class ConfigParser {
    private String         propfile = "NPCCraft.properties";
    private PropertiesFile pf;

    public ConfigParser() {
        pf = new PropertiesFile(propfile);
    }

    public void ParseConfig() {}

    public String getStringValue(String str) {
        return pf.getString(str);
    }

    public Boolean getBoolValue(String str) {
        return pf.getBoolean(str);
    }

    public Double getDoubleValue(String str) {
        return pf.getDouble(str);
    }

    public Long getLongValue(String str) {
        return pf.getLong(str);
    }

    public  int getIntValue(String str){
        return pf.getInt(str);
    }

    public String getPropertyValue(String str) {
        return pf.getProperty(str);
    }

    public void setStringValue(String str, String val) {
        pf.setString(str, val);
        pf.save();
    }

    public void setBoolValue(String str, Boolean val) {
        pf.setBoolean(str, val);
        pf.save();
    }

    public void setDoubleValue(String str, Double val ) {
      pf.setDouble(str, val);
      pf.save();
    }

    public void setLongValue(String str, Long val) {
       pf.setLong(str, val);
       pf.save();
    }

    public  void  setIntValue(String str, int val){
        pf.setInt(str, val);
        pf.save();
    }
}