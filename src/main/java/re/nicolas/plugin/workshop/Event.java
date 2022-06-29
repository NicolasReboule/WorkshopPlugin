package re.nicolas.plugin.workshop;


import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.ChatColor;
import org.bukkit.event.player.PlayerQuitEvent;

public class Event implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage("Welcome, " + ChatColor.GREEN + event.getPlayer().getName() + ChatColor.GRAY  + "!");
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        event.setQuitMessage("Vas-t'en " + ChatColor.RED + event.getPlayer().getName()  + ChatColor.GRAY + "!");
    }
}
