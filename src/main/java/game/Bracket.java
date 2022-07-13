package game;

import game.disc.Disc;
import game.pole.HanoiPole;
import java.util.List;
import java.util.Optional;

public class Bracket {

  private final List<HanoiPole> poles;

  public Bracket(List<HanoiPole> poles) {
    this.poles = poles;
  }

  /**
   * Adds a disc on specified pole
   *
   * @param poleNumber counting from clockwise
   */
  public boolean addDisc(int poleNumber, Disc disc) {
    return poles.get(poleNumber).addDisc(disc);
  }

  public boolean moveDisc(int fromPole, int toPole) {
    Boolean validMove = peekDisc(fromPole).map(disc -> addDisc(toPole, disc)).orElse(false);

    if (validMove) {
      removeDisc(fromPole);
    }

    return validMove;
  }

  public boolean isPoleEmpty(int poleNumber) {
    return poles.get(poleNumber).isEmpty();
  }

  public int getCountOfPoles() {
    return poles.size();
  }

  private void removeDisc(int fromPole) {
    poles.get(fromPole).remove();
  }

  private Optional<Disc> peekDisc(int fromPole) {
    return poles.get(fromPole).showTop();
  }
}
