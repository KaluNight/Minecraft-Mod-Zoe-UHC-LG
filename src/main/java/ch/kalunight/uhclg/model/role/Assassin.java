package ch.kalunight.uhclg.model.role;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import ch.kalunight.uhclg.model.PlayerData;
import ch.kalunight.uhclg.model.Role;
import ch.kalunight.uhclg.model.TimeStatus;
import ch.kalunight.uhclg.util.PotionUtil;

public class Assassin implements RoleImpl {

  @Override
  public String getName() {
    return "Assassin";
  }

  @Override
  public String getDescription() {
    return "Assassin : Dispose de l’effet force 1 le jour et doit gagner seul. Il reçoit à l’annonces des rôles un livre power 3, un tranchant 3, un protection 3.";
  }

  @Override
  public void giveItem(PlayerData player) {
    ItemStack book = new ItemStack(Material.ENCHANTED_BOOK, 1);
    ItemMeta bookMeta = book.getItemMeta();
    bookMeta.addEnchant(Enchantment.DAMAGE_ALL, 3, true);
    book.setItemMeta(bookMeta);
    player.getAccount().getPlayer().getInventory().addItem(book);
    book = new ItemStack(Material.ENCHANTED_BOOK, 1);
    bookMeta = book.getItemMeta();
    bookMeta.addEnchant(Enchantment.ARROW_DAMAGE, 3, true);
    book.setItemMeta(bookMeta);
    player.getAccount().getPlayer().getInventory().addItem(book);
    book = new ItemStack(Material.ENCHANTED_BOOK, 1);
    bookMeta = book.getItemMeta();
    bookMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
    book.setItemMeta(bookMeta);
    player.getAccount().getPlayer().getInventory().addItem(book);
  }

  @Override
  public void givePotionEffect(PlayerData player, TimeStatus time) {
    if(time.equals(TimeStatus.DAY)) {
      PotionUtil.giveIncreaseDamage(player);
    }else {
      PotionUtil.clearIncreaseDamage(player);
    }
  }

  @Override
  public String getVoiceFile() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Role getRole() {
    // TODO Auto-generated method stub
    return null;
  }

}
