package strategy;

import endofgame.EndOfGameDecision;
import game.Game;

public interface GameSolvingStrategy {
  void solveGame(Game game, EndOfGameDecision endOfGameDecision);
}
