package endofgame;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import game.Game;

public class Standard extends EndOfGameDecision {

  public Standard(Game game, int start, int end) {
    super(game, start, end);
  }

  @Override
  public boolean isEndOfGame() {
    List<Integer> nonEmptyPoles =
        IntStream.range(0, game.getCountOfPoles())
            .boxed()
            .filter(Predicate.not(game::isPoleEmpty))
            .collect(Collectors.toList());

    return nonEmptyPoles.size() == 1 && nonEmptyPoles.get(0) == end;
  }
}
