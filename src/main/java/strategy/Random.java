package strategy;

import endofgame.EndOfGameDecision;
import game.Game;
import java.util.concurrent.ThreadLocalRandom;

public class Random implements GameSolvingStrategy {

  @Override
  public void solveGame(Game game, EndOfGameDecision endOfGameDecision) {
    int countOfPoles = game.getCountOfPoles();

    while (!endOfGameDecision.isEndOfGame()) {
      Pair<Integer> polePair = choosePoles(countOfPoles);
      game.makeMove(polePair.from(), polePair.to());
    }
  }

  private Pair<Integer> choosePoles(int countOfPoles) {
    return new Pair<>(
        ThreadLocalRandom.current().nextInt(countOfPoles),
        ThreadLocalRandom.current().nextInt(countOfPoles));
  }

  private record Pair<T>(T from, T to) {}
}
