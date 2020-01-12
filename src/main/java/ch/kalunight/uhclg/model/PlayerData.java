package ch.kalunight.uhclg.model;

import org.bukkit.scoreboard.Scoreboard;

public class PlayerData {
  
  private LinkedDiscordAccount account;
  
  private Role role;
  
  private Scoreboard scoreboard;
  
  public PlayerData(LinkedDiscordAccount account) {
    this.account = account;
  }

  public LinkedDiscordAccount getAccount() {
    return account;
  }

  public void setAccount(LinkedDiscordAccount account) {
    this.account = account;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public Scoreboard getScoreboard() {
    return scoreboard;
  }

  public void setScoreboard(Scoreboard scoreboard) {
    this.scoreboard = scoreboard;
  }
  
  
}