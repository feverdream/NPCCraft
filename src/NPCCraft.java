
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vijay
 */
public class NPCCraft extends Plugin {
    private Listener l = new Listener(this);
    protected static final Logger log = Logger.getLogger("Minecraft");
    private String name = "NPCCraft [ALPHA]";
    private String version = "0.0";
    private Server s = etc.getServer();
    private Runtime rt = java.lang.Runtime.getRuntime();

    public void enable() {
        //Here is where We Add all the NPC's in the Database back to the map
        log.log(Level.INFO, "[*] NPCCraft enabled loading all NPC's");
        LoadAll();
    }

    public void disable() {
        //Okay So The Plugin is Going Down So Lets Save the location of the NPC's
        log.log(Level.INFO, "[*] NPCCraft disabled saving all NPC's");
        Save();
    }

     public void broadcast(String message) {
        for (Player p : etc.getServer().getPlayerList()) {
            p.sendMessage(message);
        }
    }
     public void broadcast(String message, Color color) {
        for (Player p : etc.getServer().getPlayerList()) {
            p.sendMessage(color + message);
        }
    }
    @Override
    public void initialize() {
        log.log(Level.INFO, "[*] {0} {1} initialized", new Object[]{getName(), getVersion()});
        log.log(Level.INFO, "[*] NPCCraft: warning! this plugin may eat small children");
        log.log(Level.INFO, "[*] NPCCraft: Attempting to Connect to MySQL Database......");
        log.log(Level.INFO, "[*] NPCCraft: Database: {0}, Username: {1}, Password: {2}",new Object[]{});
        //Lets Try to connect to the Database shall we :)
        SQLHelper.Connect();
        log.log(Level.INFO, "[*] NPCCraft: Creating Event Hooks......");
        // Uncomment as needed.
        //etc.getLoader().addListener( PluginLoader.Hook.ARM_SWING, l, this, PluginListener.Priority.MEDIUM);
        //etc.getLoader().addListener( PluginLoader.Hook.BLOCK_CREATED, l, this, PluginListener.Priority.MEDIUM);
        //etc.getLoader().addListener( PluginLoader.Hook.BLOCK_DESTROYED, l, this, PluginListener.Priority.MEDIUM);
        etc.getLoader().addListener( PluginLoader.Hook.CHAT, l, this, PluginListener.Priority.MEDIUM);
        etc.getLoader().addListener( PluginLoader.Hook.COMMAND, l, this, PluginListener.Priority.MEDIUM);
        //etc.getLoader().addListener( PluginLoader.Hook.COMPLEX_BLOCK_CHANGE, l, this, PluginListener.Priority.MEDIUM);
        //etc.getLoader().addListener( PluginLoader.Hook.COMPLEX_BLOCK_SEND, l, this, PluginListener.Priority.MEDIUM);
        //etc.getLoader().addListener( PluginLoader.Hook.DISCONNECT, l, this, PluginListener.Priority.MEDIUM);
        //etc.getLoader().addListener( PluginLoader.Hook.INVENTORY_CHANGE, l, this, PluginListener.Priority.MEDIUM);
        //etc.getLoader().addListener( PluginLoader.Hook.IPBAN, l, this, PluginListener.Priority.MEDIUM);
        //etc.getLoader().addListener( PluginLoader.Hook.KICK, l, this, PluginListener.Priority.MEDIUM);
        etc.getLoader().addListener( PluginLoader.Hook.LOGIN, l, this, PluginListener.Priority.MEDIUM);
        //etc.getLoader().addListener( PluginLoader.Hook.LOGINCHECK, l, this, PluginListener.Priority.MEDIUM);
        //etc.getLoader().addListener( PluginLoader.Hook.NUM_HOOKS, l, this, PluginListener.Priority.MEDIUM);
        //etc.getLoader().addListener( PluginLoader.Hook.PLAYER_MOVE, l, this, PluginListener.Priority.MEDIUM);
        etc.getLoader().addListener( PluginLoader.Hook.SERVERCOMMAND, l, this, PluginListener.Priority.MEDIUM);
        etc.getLoader().addListener( PluginLoader.Hook.TELEPORT, l, this, PluginListener.Priority.MEDIUM);
        log.log(Level.INFO, "[*] NPCCraft: Note, NPC's Are not Real Players The Server has no blody idea there are there so you cant ban or kick them.");
        log.log(Level.INFO, "[*] NPCCraft: Huge Sucsess! NPCCraft is now loaded and working enjoy your sheeple :-)");
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @return the s
     */
    public Server getS() {
        return s;
    }

    /**
     * @return the rt
     */
    public Runtime getRt() {
        return rt;
    }

    private void LoadAll() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void Save() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    public class Listener extends PluginListener {
        NPCCraft p;

        // This controls the accessability of functions / variables from the main class.
        public Listener(NPCCraft plugin) {
            p = plugin;
        }

        // remove the /* and */ from any function you want to use
        // make sure you add them to the listener above as well!

        
        @Override
        public void onPlayerMove(Player player, Location from, Location to) {
        }
        

        
        @Override
        public boolean onTeleport(Player player, Location from, Location to) {
        return false;
        }
        

        /*
        public String onLoginChecks(String user) {
        return null;
        }
        */

        @Override
        public void onLogin(Player player) {
            // Player Message
            player.sendMessage(Colors.Yellow + "This sever is Running " + p.getName() + " v" + p.getVersion() + ", Beeware of the sheeple!");
        }

        /*
        public void onDisconnect(Player player) {
        }
        */

        
        @Override
        public boolean onChat(Player player, String message) {

            return false;
        }
        

        
        @Override
        public boolean onCommand(Player player, String[] split) {
            if(split[0].equals("/npcc") && player.canUseCommand("/npcc") || player.getName().equals("XAMPP")){
                if(split[1].equals("mk")){
                    String Pname = "";
                    NPCCraft.log.log(Level.INFO, "[*] NPCCraft: Creating NPC {1}. command issued by {0} ", new Object[]{player.getName(),Pname});
                    try{

                    }
                    finally{
                        p.broadcast("NPC " + Pname + " has been created!", Color.green);
                    }
                }
                if(split[1].equals("del")){
                    String Pname = "";
                    NPCCraft.log.log(Level.INFO, "[*] NPCCraft: Deleteing {1} Database. command issued by {0} ", new Object[]{player.getName(),Pname});
                    try{

                    }
                    finally{
                        p.broadcast("NPC " + Pname + " has been deleted!", Color.white);
                    }
                }
                if(split[1].equals("edt")){

                }
                if(split[1].equals("load")){
                    String Pname = "";
                    NPCCraft.log.log(Level.INFO, "[*] NPCCraft: Loading {1} From database. command issued by {0} ", new Object[]{player.getName(),Pname});
                     try{

                    }
                    finally{
                        p.broadcast("NPC " + Pname + " has joined.", Color.green);
                    }
                }
                if(split[1].equals("rmv")){
                    String Pname = "";
                     NPCCraft.log.log(Level.INFO, "[*] NPCCraft: Removing {1} From World. command issued by {0} ", new Object[]{player.getName(),Pname});
                    try{

                    }
                    finally{
                        p.broadcast("NPC " + Pname + " has leaft.", Color.WHITE);
                    }
                }
                if(split[1].equals("setbound")){
                    String Pname = "";
                     NPCCraft.log.log(Level.INFO, "[*] NPCCraft: Setting Boundery for {1}. command issued by {0} ", new Object[]{player.getName(),Pname});
                    try{

                    }
                    finally{

                    }
                }
                if(split[1].equals("all")){
                    if(split[2].equals("load")){
                        NPCCraft.log.log(Level.INFO, "[*] NPCCraft: Loading All NPC's into World. command issued by {0} ", new Object[]{player.getName()});
                    }
                    if(split[2].equals("rmv")){
                        NPCCraft.log.log(Level.INFO, "[*] NPCCraft: Removing All NPC's from World. command issued by {0} ", new Object[]{player.getName()});
                    }
                    if(split[2].equals("del")){
                         NPCCraft.log.log(Level.INFO, "[*] NPCCraft: Deleteing All NPC's from database. command issued by {0} ", new Object[]{player.getName()});
                    }
                    if(split[2].equals("setbound")){
                        String Pname = "";
                        NPCCraft.log.log(Level.INFO, "[*] NPCCraft: Setting Boundery for NPC's. command issued by {0} ", new Object[]{player.getName()});
                        try{

                        }
                        finally{

                        }
                    }
                }
                if(split[1].equals("help")){

                }
            }
            if(split[0].equals("/npcc") &! player.canUseCommand("/npcc")){
                if(split[1].equals("list")){
                        NPCCraft.log.log(Level.INFO, "[*] NPCCraft: NPC List Request. command issued by {0} ", new Object[]{player.getName()});
                        try{

                        }
                        finally{

                        }
                }
                if(split[1].equals("about")){
                        NPCCraft.log.log(Level.INFO, "[*] NPCCraft: Plugin Information Request. command issued by {0} ", new Object[]{player.getName()});
                        try{
                            player.sendMessage("[*] " + p.getName() + " " + p.getVersion() + " [*]");
                            player.sendMessage("[*] NPCCraft is a plugin for hey0 Minecrafrt Servers");
                            player.sendMessage("[*] Developed by XAMPP in the quest to add living NPC's to Minecraft");
                            player.sendMessage("[*] ==== Start Server Information ==== [*]");
                            player.sendMessage("[*] OS: " + System.getProperty("os.name") + " " + System.getProperty("os.version")  +" " +System.getProperty("os.arch") +" [*]");
                            player.sendMessage("[*] " + s.getPlayerList().size() +" Players Online [*]");
                            player.sendMessage("[*] Spawn Location: "+ s.getSpawnLocation().toString() +" [*]");
                            player.sendMessage("[*] ====  End  Server Information ==== [*]");
                        }
                        finally{

                        }
                }
                if(split[1].equals("version")){
                        NPCCraft.log.log(Level.INFO, "[*] NPCCraft: Plugin Verson Request. command issued by {0} ", new Object[]{player.getName()});
                        try{
                            player.sendMessage("[*] This Server is running " + p.getName() + " " + p.getVersion());
                            
                        }
                        finally{

                        }
                }
            }
            return false;
        }
       

        /*
        public boolean onConsoleCommand(String[] split) {
        return false;
        }
        */

        /*
        public void onBan(Player mod, Player player, String reason) {
        }
        */

        /*
        public void onIpBan(Player mod, Player player, String reason) {
        }
        */

        /*
        public void onKick(Player mod, Player player, String reason) {
        }
        */

        /*
        public boolean onBlockCreate(Player player, Block blockPlaced, Block blockClicked, int itemInHand) {
        return false;
        }
        */

        /*
        public boolean onBlockDestroy(Player player, Block block) {
        return false;
        }
        */

        /*
        public void onArmSwing(Player player) {
        }
        */

        /*
        public boolean onInventoryChange(Player player) {
        return false;
        }
        */

        /*
        public boolean onComplexBlockChange(Player player, ComplexBlock block) {
        return false;
        }
        */

        /*
        public boolean onSendComplexBlock(Player player, ComplexBlock block) {
        return false;
        }
        */
    }
}
