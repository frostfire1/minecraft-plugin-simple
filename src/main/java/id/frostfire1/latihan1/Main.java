package id.frostfire1.latihan1;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage(Color.AQUA + "Hai Server Plugin Telah Menyala");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
