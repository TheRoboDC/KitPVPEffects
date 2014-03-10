package io.github.TheRoboDC;

import org.bukkit.plugin.java.JavaPlugin;

public class KitPVPEffects extends JavaPlugin {
	
	@Override
	public void onEnable() {
		new EffectsListener(this);
		getLogger().info("KitPVPEffects has been enabled!");
	}
	
	@Override
	public void onDisable() {
		getLogger().info("KitPVPEffects has been disabled!");
	}

}
