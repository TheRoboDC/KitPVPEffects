package io.github.TheRoboDC;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.Location;

public class EffectsListener implements Listener {
	
	public EffectsListener(KitPVPEffects plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onThrow(PlayerDropItemEvent event) {
		World world = ((Player) event).getWorld();
		Player player = event.getPlayer();
		Item drop = event.getItemDrop();
		Location loc = ((Player) event).getLocation();
		if(drop.getItemStack().getTypeId() == 46) {
			player.sendMessage(ChatColor.GREEN + "You threw a grenade!");
			world.createExplosion(loc, 0.0F);
		}
		
	}
}
