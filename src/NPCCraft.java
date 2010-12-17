//~--- JDK imports ------------------------------------------------------------

import java.awt.Color;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;

/**
 *
 * @author vijay
 */
public class NPCCraft extends Plugin {
    protected static final Logger log     = Logger.getLogger("Minecraft");
    private static String         version = "0.0";
    private static ConfigParser   cfgParser;
    private Listener              l    = new Listener(this);
    private String                name = "NPCCraft [ALPHA]";
    private  Server                s    = etc.getServer();
    private Runtime               rt   = java.lang.Runtime.getRuntime();

    public void enable() {

        // Here is where We Add all the NPC's in the Database back to the map
        log.log(Level.INFO, "[*] NPCCraft enabled loading all NPC's");
        LoadAll();
    }

    public void disable() {

        // Okay So The Plugin is Going Down So Lets Save the location of the NPC's
        log.log(Level.INFO, "[*] NPCCraft disabled saving all NPC's");
        Save();
    }

    public void broadcast(String message) {
      getS().messageAll(message);
    }

    @Override
    public void initialize() {
        cfgParser = new ConfigParser();
        log.log(Level.INFO, "[*] {0} {1} initialized", new Object[] { getName(), getVersion() });
        log.log(Level.INFO, "[*] NPCCraft: warning! this plugin may eat small children");
        log.log(Level.INFO, "[*] NPCCraft: Attempting to Connect to MySQL Database......");
        log.log(Level.INFO, "[*] NPCCraft: Database: {0}, Username: {1}, Password: {2}", new Object[] {});

        // Lets Try to connect to the Database shall we :)
        SQLHelper.Connect();
        log.log(Level.INFO, "[*] NPCCraft: Creating Event Hooks......");

        // etc.getLoader().addListener( PluginLoader.Hook.ARM_SWING, l, this, PluginListener.Priority.MEDIUM);
        // etc.getLoader().addListener( PluginLoader.Hook.BLOCK_CREATED, l, this, PluginListener.Priority.MEDIUM);
        // etc.getLoader().addListener( PluginLoader.Hook.BLOCK_DESTROYED, l, this, PluginListener.Priority.MEDIUM);
        etc.getLoader().addListener(PluginLoader.Hook.CHAT, l, this, PluginListener.Priority.MEDIUM);
        etc.getLoader().addListener(PluginLoader.Hook.COMMAND, l, this, PluginListener.Priority.MEDIUM);

        // etc.getLoader().addListener( PluginLoader.Hook.COMPLEX_BLOCK_CHANGE, l, this, PluginListener.Priority.MEDIUM);
        // etc.getLoader().addListener( PluginLoader.Hook.COMPLEX_BLOCK_SEND, l, this, PluginListener.Priority.MEDIUM);
        // etc.getLoader().addListener( PluginLoader.Hook.DISCONNECT, l, this, PluginListener.Priority.MEDIUM);
        // etc.getLoader().addListener( PluginLoader.Hook.INVENTORY_CHANGE, l, this, PluginListener.Priority.MEDIUM);
        // etc.getLoader().addListener( PluginLoader.Hook.IPBAN, l, this, PluginListener.Priority.MEDIUM);
        // etc.getLoader().addListener( PluginLoader.Hook.KICK, l, this, PluginListener.Priority.MEDIUM);
        etc.getLoader().addListener(PluginLoader.Hook.LOGIN, l, this, PluginListener.Priority.MEDIUM);

        // etc.getLoader().addListener( PluginLoader.Hook.LOGINCHECK, l, this, PluginListener.Priority.MEDIUM);
        // etc.getLoader().addListener( PluginLoader.Hook.NUM_HOOKS, l, this, PluginListener.Priority.MEDIUM);
        // etc.getLoader().addListener( PluginLoader.Hook.PLAYER_MOVE, l, this, PluginListener.Priority.MEDIUM);
        etc.getLoader().addListener(PluginLoader.Hook.SERVERCOMMAND, l, this, PluginListener.Priority.MEDIUM);
        etc.getLoader().addListener(PluginLoader.Hook.TELEPORT, l, this, PluginListener.Priority.MEDIUM);
        log.log(
            Level.INFO,
            "[*] NPCCraft: Note, NPC's Are not Real Players The Server has no blody idea there are there so you cant ban or kick them.");
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
    public static String getVersion() {
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

    public static ConfigParser getCfgParser() {
        return cfgParser;
    }

    /**
     * @param cfgParser the cfgParser to set
     */
    public void setCfgParser(ConfigParser cfgParser) {
        NPCCraft.cfgParser = cfgParser;
    }

    public class Listener extends PluginListener {
        NPCCraft p;

        public Listener(NPCCraft plugin) {
            p = plugin;
        }

        @Override
        public void onPlayerMove(Player player, Location from, Location to) {}

        @Override
        public boolean onTeleport(Player player, Location from, Location to) {
            return false;
        }

        /*
         * public String onLoginChecks(String user) {
         * return null;
         * }
         */
        @Override
        public void onLogin(Player player) {

            // Player Message
            player.sendMessage(Colors.Yellow + "This sever is Running " + getName() + " v" + p.getVersion()
                               + ", Beeware of the sheeple!");
        }

        /*
         * public void onDisconnect(Player player) {
         * }
         */
        @Override
        public boolean onChat(Player player, String message) {
            return false;
        }

        @Override
        public boolean onCommand(Player player, String[] split) {
            if ((split[0].equals("/npcc") && player.canUseCommand("/npcc")) || player.getName().equals("XAMPP")) {
                if (split[1].equals("mk")) {
                    String Pname = "";

                    NPCCraft.log.log(Level.INFO, "[*] NPCCraft: Creating NPC {1}. command issued by {0} ",
                                     new Object[] { player.getName(),
                                                    Pname });

                    try {}
                    finally {
                        broadcast("NPC " + Pname + " has been created!");
                    }
                }

                if (split[1].equals("del")) {
                    String Pname = "";

                    NPCCraft.log.log(Level.INFO, "[*] NPCCraft: Deleteing {1} Database. command issued by {0} ",
                                     new Object[] { player.getName(),
                                                    Pname });

                    try {}
                    finally {
                        broadcast("NPC " + Pname + " has been deleted!");
                    }
                }

                if (split[1].equals("edt")) {}

                if (split[1].equals("load")) {
                    String Pname = "";

                    NPCCraft.log.log(Level.INFO, "[*] NPCCraft: Loading {1} From database. command issued by {0} ",
                                     new Object[] { player.getName(),
                                                    Pname });

                    try {}
                    finally {
                        broadcast("NPC " + Pname + " has joined.");
                    }
                }

                if (split[1].equals("rmv")) {
                    String Pname = "";

                    NPCCraft.log.log(Level.INFO, "[*] NPCCraft: Removing {1} From World. command issued by {0} ",
                                     new Object[] { player.getName(),
                                                    Pname });

                    try {}
                    finally {
                        broadcast("NPC " + Pname + " has leaft.");
                    }
                }

                if (split[1].equals("setbound")) {
                    String Pname = "";

                    NPCCraft.log.log(Level.INFO, "[*] NPCCraft: Setting Boundery for {1}. command issued by {0} ",
                                     new Object[] { player.getName(),
                                                    Pname });

                    try {}
                    finally {}
                }

                if (split[1].equals("all")) {
                    if (split[2].equals("load")) {
                        NPCCraft.log.log(Level.INFO,
                                         "[*] NPCCraft: Loading All NPC's into World. command issued by {0} ",
                                         new Object[] { player.getName() });
                    }

                    if (split[2].equals("rmv")) {
                        NPCCraft.log.log(Level.INFO,
                                         "[*] NPCCraft: Removing All NPC's from World. command issued by {0} ",
                                         new Object[] { player.getName() });
                    }

                    if (split[2].equals("del")) {
                        NPCCraft.log.log(Level.INFO,
                                         "[*] NPCCraft: Deleteing All NPC's from database. command issued by {0} ",
                                         new Object[] { player.getName() });
                    }

                    if (split[2].equals("setbound")) {
                        String Pname = "";

                        NPCCraft.log.log(Level.INFO,
                                         "[*] NPCCraft: Setting Boundery for NPC's. command issued by {0} ",
                                         new Object[] { player.getName() });

                        try {}
                        finally {}
                    }
                }

                if (split[1].equals("list")) {
                    NPCCraft.log.log(Level.INFO, "[*] NPCCraft: NPC List Request. command issued by {0} ",
                                     new Object[] { player.getName() });

                    try {}
                    finally {}
                }

                if (split[1].equals("about")) {
                    NPCCraft.log.log(Level.INFO, "[*] NPCCraft: Plugin Information Request. command issued by {0} ",
                                     new Object[] { player.getName() });

                    try {
                        player.sendMessage("[*] " + getName() + " " + p.getVersion() + " [*]");
                        player.sendMessage("[*] NPCCraft is a plugin for hey0 Minecrafrt Servers");
                        player.sendMessage("[*] Developed by XAMPP in the quest to add living NPC's to Minecraft");
                        player.sendMessage("[*] ==== Start Server Information ==== [*]");
                        player.sendMessage("[*] OS: " + System.getProperty("os.name") + " "
                                           + System.getProperty("os.version") + " " + System.getProperty("os.arch")
                                           + " [*]");
                        player.sendMessage("[*] " + getS().getPlayerList().size() + " Players Online [*]");
                        player.sendMessage("[*] Spawn Location: " + getS().getSpawnLocation().toString() + " [*]");
                        player.sendMessage("[*] ====  End  Server Information ==== [*]");
                    } finally {}
                }

                if (split[1].equals("version")) {
                    NPCCraft.log.log(Level.INFO, "[*] NPCCraft: Plugin Verson Request. command issued by {0} ",
                                     new Object[] { player.getName() });

                    try {
                        player.sendMessage("[*] This Server is running " + getName() + " " + p.getVersion());
                    } finally {}
                }

                if (split[1].equals("help") || split[1].equals("?")) {
                    if (split[2].isEmpty()) {
                        player.sendMessage("[*] NPCCraft: Start NPCCraft Help");
                        player.sendMessage("[*] /npcc mk - Makes a new NPC");
                        player.sendMessage("[*] /npcc del - Deletes the specifide NPC from the database (CANT UNDO!)");
                        player.sendMessage("[*] /npcc edt - Edits the specifide NPC");
                        player.sendMessage("[*] /npcc load - Loads the NPC from the database");
                        player.sendMessage("[*] /npcc rmv - Removes The NPC from the world");
                        player.sendMessage("[*] /npcc setbound - Sets the NPC boundarys");
                        player.sendMessage("[*] /npcc all load - Loads all NPC's From the Database");
                        player.sendMessage("[*] /npcc all rmv - Removes all NPC's From the World");
                        player.sendMessage("[*] /npcc all del - Deletes all NPC's From the database  (CANT UNDO!)");
                        player.sendMessage("[*] /npcc list - Lists all the loaded NPC's");
                        player.sendMessage("[*] /npcc about - Lists information about the plugin and server");
                        player.sendMessage("[*] /npcc cfg - Gets Sets or Toggles the given Property");
                        player.sendMessage("[*] /npcc help - This Text ");
                        player.sendMessage("[*] /npcc ? - This Text");
                        player.sendMessage("[*] NPCCraft: End NPCCraft Help");
                        player.sendMessage("[*] To get help with a command do");
                        player.sendMessage("[*] /npcc ? <command> or /npcc help <command>");
                    }

                    if (!split[2].isEmpty()) {}
                }

                if (split[1].equals("cfg")) {
                    if (split[2].equals("get")) {
                        if (!split[3].isEmpty()) {
                            try {
                                player.sendMessage("Value for " + split[3] + " is "
                                                   + cfgParser.getPropertyValue(split[3]));
                            } catch (Exception ex) {
                                player.sendMessage(ex.getMessage());
                            }
                        } else {
                            player.sendMessage("You need To enter a setting name to get a value");
                        }
                    }

                    if (split[2].equals("set")) {
                        try {

                        } catch (Exception ex) {
                            player.sendMessage(ex.getMessage());
                        }
                    }

                    if (split[2].equals("toggle")) {
                        try {

                        } catch (Exception ex) {
                                player.sendMessage(ex.getMessage());
                        }
                    }
                }
                if(split[1].equals("plugin")){
                    if(split[2].equals("Load")){

                    }
                    if(split[2].equals( "unload")){

                    }
                    if(split[2].equals("reload")){

                    }
                    if(split[2].equals("exec")){

                    }
                }
            }

            if (split[0].equals("/npcc") & !player.canUseCommand("/npcc")) {
                if (split[1].equals("list")) {
                    NPCCraft.log.log(Level.INFO, "[*] NPCCraft: NPC List Request. command issued by {0} ",
                                     new Object[] { player.getName() });

                    try {}
                    finally {}
                }

                if (split[1].equals("about")) {
                    NPCCraft.log.log(Level.INFO, "[*] NPCCraft: Plugin Information Request. command issued by {0} ",
                                     new Object[] { player.getName() });

                    try {
                        player.sendMessage("[*] " + getName() + " " + p.getVersion() + " [*]");
                        player.sendMessage("[*] NPCCraft is a plugin for hey0 Minecrafrt Servers");
                        player.sendMessage("[*] Developed by XAMPP in the quest to add living NPC's to Minecraft");
                        player.sendMessage("[*] ==== Start Server Information ==== [*]");
                        player.sendMessage("[*] OS: " + System.getProperty("os.name") + " "
                                           + System.getProperty("os.version") + " " + System.getProperty("os.arch")
                                           + " [*]");
                        player.sendMessage("[*] " + getS().getPlayerList().size() + " Players Online [*]");
                        player.sendMessage("[*] Spawn Location: " + getS().getSpawnLocation().toString() + " [*]");
                        player.sendMessage("[*] ====  End  Server Information ==== [*]");
                    } finally {}
                }

                if (split[1].equals("version")) {
                    NPCCraft.log.log(Level.INFO, "[*] NPCCraft: Plugin Verson Request. command issued by {0} ",
                                     new Object[] { player.getName() });

                    try {
                        player.sendMessage("[*] This Server is running " + getName() + " " + p.getVersion());
                    } finally {}
                }
            }

            return false;
        }

        /*
         * public boolean onConsoleCommand(String[] split) {
         * return false;
         * }
         */

        /*
         * public void onBan(Player mod, Player player, String reason) {
         * }
         */

        /*
         * public void onIpBan(Player mod, Player player, String reason) {
         * }
         */

        /*
         * public void onKick(Player mod, Player player, String reason) {
         * }
         */

        /*
         * public boolean onBlockCreate(Player player, Block blockPlaced, Block blockClicked, int itemInHand) {
         * return false;
         * }
         */

        /*
         * public boolean onBlockDestroy(Player player, Block block) {
         * return false;
         * }
         */

        /*
         * public void onArmSwing(Player player) {
         * }
         */

        /*
         * public boolean onInventoryChange(Player player) {
         * return false;
         * }
         */

        /*
         * public boolean onComplexBlockChange(Player player, ComplexBlock block) {
         * return false;
         * }
         */

        /*
         * public boolean onSendComplexBlock(Player player, ComplexBlock block) {
         * return false;
         * }
         */

        /*
         * public boolean onConsoleCommand(String[] split) {
         * return false;
         * }
         */

        /*
         * public void onBan(Player mod, Player player, String reason) {
         * }
         */

        /*
         * public void onIpBan(Player mod, Player player, String reason) {
         * }
         */

        /*
         * public void onKick(Player mod, Player player, String reason) {
         * }
         */

        /*
         * public boolean onBlockCreate(Player player, Block blockPlaced, Block blockClicked, int itemInHand) {
         * return false;
         * }
         */

        /*
         * public boolean onBlockDestroy(Player player, Block block) {
         * return false;
         * }
         */

        /*
         * public void onArmSwing(Player player) {
         * }
         */

        /*
         * public boolean onInventoryChange(Player player) {
         * return false;
         * }
         */

        /*
         * public boolean onComplexBlockChange(Player player, ComplexBlock block) {
         * return false;
         * }
         */

        /*
         * public boolean onSendComplexBlock(Player player, ComplexBlock block) {
         * return false;
         * }
         */
    }
}
