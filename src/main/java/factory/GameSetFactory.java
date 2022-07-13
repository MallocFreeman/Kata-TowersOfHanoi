package factory;

import game.GameSet;
import game.disc.Disc;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GameSetFactory {

  public GameSet create(int countDiscs) {
    return new GameSet(createDiscsForGameSet(countDiscs));
  }

  private List<Disc> createDiscsForGameSet(int countDiscs) {
    return IntStream.range(0, countDiscs)
        .mapToObj(number -> new Disc(countDiscs - number))
        .collect(Collectors.toList());
  }
}
