package io.github.TheRoboDC;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.Location;

public class EffectsListener implements Listener {
	
	public EffectsListener(KitPVPEffects plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onThrow(PlayerDropItemEvent event) {
		Player player = event.getPlayer();
		World world = player.getWorld();
		Item drop = event.getItemDrop();
		Location loc = player.getLocation();
		if(drop.getItemStack().getTypeId() == 46) {
			player.sendMessage(ChatColor.GREEN + "You threw a grenade!");
			world.createExplosion(loc, 0.0F);
		}
	}
	
	@EventHandler	
	public void onFishCast(PlayerFishEvent event) {
		Player player = event.getPlayer(); //Gets the player who casted the fishing rod.
		Entity target = event.getCaught();
		if (target instanceof Player) {
			player.teleport(target);
			player.sendMessage(ChatColor.GREEN + "You have successfully teleported to your target!");
		}
		
	}
}
