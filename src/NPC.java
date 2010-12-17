//~--- non-JDK imports --------------------------------------------------------

import net.minecraft.server.MinecraftServer;

//~--- JDK imports ------------------------------------------------------------

import java.sql.SQLException;

import java.util.List;

/**
 *
 * @author vijay
 */
public abstract class NPC {
    public static List players;
    private int        _itm;
    private Location   _loc;
    private String     _name;
    private float      _pitch;
    private float      _rot;
    private gu         handler;
    private er         user;
   

    /*
     * public NPC(String name, double x,double y, double z, float rot, float pitch){
     *
     * }
     * public NPC(String name, float x,float y, float z, float rot, float pitch, int itm){
     *
     * }
     * public void Hide(){
     *
     * }
     * public void Delete(){
     *   for (Object player : players) {
     *           ((er)player).a.b(new dg(handler.a.g));
     *       }
     * }
     * public void Untrack(Player pyl){
     *   if (handler.p.contains(pyl.getUser())) {
     *           handler.p.remove(pyl.getUser()); // o is the list of users the entity is sending position data to
     *       }
     * }
     * public void BrodcastPos(){
     *   handler.b(players);
     * }
     * public void BrodcastMov(){
     *   handler.a(players);
     * }
     * public void BrodcastItmInHand(){
     *   for (Object player : players) {
     *           ((er)player).a.b(new gr(user.g, getItemInHand()));
     *       }
     * }
     * public String GetName(){
     *   return _name;
     * }
     * public void SetName(String name){
     *   _name = name;
     *   user.m = name;
     * }
     * public Location GetLocation(){
     *    return _loc;
     * }
     * public void SetLocation(Location loc){
     *   _loc = loc;
     * }
     * public float GetRot(){
     *   return _rot;
     * }
     * public void SetRot(float rot){
     *   _rot = rot;
     * }
     * public float GetPitch(){
     *   return _pitch;
     * }
     * public void SetPitch(float pitch){
     *   _pitch = pitch;
     * }
     * public void SetPitchAndRot(float rot,float pitch){
     *   _rot = rot;
     *   _pitch = pitch;
     * }
     * public int GetItmInHand(){
     *   return _itm;
     * }
     * public void SetItmInHand(int itm){
     *   _itm = itm;
     * }
     * public void TpTo(double x ,double y,double z,float rot,float pitch){
     *   Location loc = new Location();
     *   loc.x = x;
     *   loc.y = y;
     *   loc.z = z;
     *   SetLocation(loc);
     *   SetPitchAndRot(rot,pitch);
     * }
     */
    public void LoadFromDatabase(String npcName) throws SQLException {
        SQLHelper.execQuery("");
    }
}
