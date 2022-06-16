public class Main {
  public static void main(String[] args) {
    System.out.println("SEMONSTER!");
    Monster monster = new Monster();
    System.out.println(monster.toString());
    Player player = new Player();
    
    player.drawMonsters();
    player.showDeck();
    System.out.println("Main 修正2");
  }
}

