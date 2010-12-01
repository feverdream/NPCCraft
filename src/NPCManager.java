/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
/**
 *
 * @author vijay
 */
public class NPCManager {
    public List<NPC> npcs;
    /*
     * Initalize a New NPC manager
     * Witch will handel NPC adding and Removing as well
     * as LoadBalancing of NPC Threads to keep CPU usage even
     */
    public NPCManager(){
    
    }
    /*
     * Add a NPC to Manage now this can be a new npc or an exsisting npc
     */
    public void AddNPCToManage(NPC npcToManage){
        LoadBalance(npcToManage);
    }
    public void  LoadBalance(NPC npcToBalance){

    }
    public void KillThread(NPC npcThreadToKill){

    }
    public void RemoveNPCFromManagment(NPC npcToRemoveFromManagment){

    }
    public void ShiftNPCToCore(NPC npcToShift, int Core){

    }
}
