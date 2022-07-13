import endofgame.Standard;
import game.Game;
import player.Ape;
import player.GameExecutor;

public class Main {

  public static void main(String[] args) {
    Game game = new Game(3, 3, 0);
    GameExecutor ape = new Ape(game);
    ape.playGame(new Standard(game, 0, 2));
    System.out.println(game.getCount());
  }
}
