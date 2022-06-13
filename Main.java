public class Main {
  public static void main(String[] args) {
    System.out.println("SEMonster!");
    Monster monster = new Monster();
    System.out.println(monster.toString());
    Player player = new Player();
    
    player.drawMonsters();
    player.showDeck();
  }
}

