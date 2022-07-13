package player;

import endofgame.EndOfGameDecision;
import game.Game;
import strategy.GameSolvingStrategy;

public class GameExecutor {
  private final Game game;
  private final GameSolvingStrategy gameSolvingStrategy;

  public GameExecutor(Game game, GameSolvingStrategy gameSolvingStrategy) {
    this.game = game;
    this.gameSolvingStrategy = gameSolvingStrategy;
  }

  public void playGame(EndOfGameDecision endOfGameDecision) {
    gameSolvingStrategy.solveGame(game, endOfGameDecision);
  }
}
