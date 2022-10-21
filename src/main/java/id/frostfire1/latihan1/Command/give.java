package id.frostfire1.latihan1.Command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

public class give implements CommandExecutor, Listener {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

        Player target = Bukkit.getPlayer(args[0]);

        if(command.getName().equalsIgnoreCase("give")){
            if(sender instanceof Player){
                Player p = (Player) sender;
            }

        }
        return true;
    }
    @EventHandler
    public void kasih(Player p, Player target, Player){
        ItemStack item = p.getInventory().getItemInMainHand();
        ItemStack iya = new ItemStack(Material.GREEN_WOOL);
        ItemStack tidak = new ItemStack(Material.RED_WOOL);
        ItemMeta meiya = iya.getItemMeta();
        ItemMeta metidak = tidak.getItemMeta();
        Inventory gui = Bukkit.createInventory(p,9, ChatColor.YELLOW + "Apakah Kamu yakin mengirim " + item.getAmount() + " " + item.getItemMeta().getDisplayName());
        Inventory trginv = target.getInventory();

        meiya.setDisplayName("iya");
        metidak.setDisplayName("tidak");
        iya.setItemMeta(meiya);
        tidak.setItemMeta(metidak);
        ItemStack[] menuitm = {iya, tidak};
        gui.setContents(menuitm);

        if(trginv.firstEmpty() != -1){
            trginv.addItem(item);

            if (item.getAmount() > 1){
            p.openInventory(gui);
            switch ()
            }
        }
    }
    
}
