package game;

import game.disc.Disc;
import java.util.List;

public class GameSet {

  private final List<Disc> discs;

  public GameSet(List<Disc> discs) {
    this.discs = discs;
  }

  public List<Disc> getDiscs() {
    return discs;
  }
}
