package game.pole;

import game.disc.Disc;
import game.disc.DiscComparator;

public class HanoiPole extends Pole<Disc> {
  private final DiscComparator discComparator;

  public HanoiPole() {
    super();
    discComparator = new DiscComparator();
  }

  public boolean addDisc(Disc disc) {
    boolean canAdd = canAdd(disc);

    if (canAdd) {
      add(disc);
    }

    return canAdd;
  }

  private boolean canAdd(Disc disc) {
    return showTop()
        .map(discFromPole -> discComparator.compare((discFromPole), disc) > 0)
        .orElse(true);
  }
}
