package factory;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import game.pole.HanoiPole;

public class HanoiPoleFactory {

  public List<HanoiPole> create(int countPoles) {
    return IntStream.range(0, countPoles)
        .mapToObj(number -> new HanoiPole())
        .collect(Collectors.toList());
  }
}
