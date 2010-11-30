/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vijay
 */
public class NPC {
    public fx usr; // fx == user object
    public NPC(String name, float x,float y, float z, float rot, float pitch){

    }
     public NPC(String name, float x,float y, float z, float rot, float pitch, int itm){

    }
     public void Hide(){

     }
     public void Delete(){

     }
     public void Track(){

     }
     public void Untrack(){

     }
     public void BrodcastPos(){

     }
     public void BrodcastMov(){

     }
     public String GetName(){

     }
     public String SetName(){

     }
     public Location GetLocation(){


     }
     public void SetLocation(Location loc){

     }
     public float GetRot(){

     }
     public void SetRot(float rot){

     }
     public float GetPitch(){

     }
     public void SetPitch(float pitch){

     }
     public void SetPitchAndRot(float rot,float pitch){

     }
     public int GetItmInHand(){

     }
     public void SetItmInHand(int itm){

    }
     public void TpTo(double x ,double y,double z,float rot,float pitch){
        Location loc = new Location();
        loc.x = x;
        loc.y = y;
        loc.z = z;
        SetLocation(loc);
        SetPitchAndRot(rot,pitch);
     }
}
