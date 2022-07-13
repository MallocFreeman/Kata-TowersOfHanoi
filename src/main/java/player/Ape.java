package player;

import game.Game;
import strategy.Random;

public class Ape extends GameExecutor {

  public Ape(Game game) {
    super(game, new Random());
  }
}
