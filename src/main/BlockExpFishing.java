import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Simple Plugin for JerryFord to block exp from fishing
 *
 * @author Diemex
 */
public class BlockExpFishing extends JavaPlugin implements Listener
{
    @Override
    public void onEnable()
    {
        super.onEnable();
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerFish (PlayerFishEvent event)
    {
        event.setExpToDrop(0);
    }
}
