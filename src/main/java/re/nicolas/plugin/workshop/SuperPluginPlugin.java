package re.nicolas.plugin.workshop;

import org.bukkit.plugin.java.JavaPlugin;

public class SuperPluginPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Event(), this);
        System.out.println("Super Plugin Enabled");
    }

    @Override
    public void onDisable() {
        System.out.println("Super Plugin Disabled");
    }
}
