package game.disc;

import java.util.Comparator;

public class DiscComparator implements Comparator<Disc> {

  @Override
  public int compare(Disc disc, Disc otherDisc) {
    return Integer.compare(disc.size(), otherDisc.size());
  }
}
