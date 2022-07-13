package strategy;

import endofgame.EndOfGameDecision;
import game.Game;
import java.util.concurrent.ThreadLocalRandom;

public class Bruteforce implements GameSolvingStrategy {

  @Override
  public void solveGame(Game game, EndOfGameDecision endOfGameDecision) {
    int end = endOfGameDecision.getEnd();

  }

  private record Pair<T>(T from, T to) {}
}
