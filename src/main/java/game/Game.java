package game;

import factory.GameSetFactory;
import factory.HanoiPoleFactory;

public class Game {
  private int count;
  private final Bracket bracket;

  public Game(int countDiscs, int countPoles, int startPole) {
    bracket = new Bracket(new HanoiPoleFactory().create(countPoles));
    initializeStartPole(countDiscs, startPole);
  }

  public void makeMove(int fromPole, int toPole) {
    boolean validMove = bracket.moveDisc(fromPole, toPole);
    if (fromPole != toPole && validMove) {
      count++;
      System.out.printf("Von %d nach %d\n", fromPole, toPole);
    }
  }

  public int getCount() {
    return count;
  }

  private void initializeStartPole(int countDiscs, int poleNumber) {
    GameSet gameSet = new GameSetFactory().create(countDiscs);
    gameSet.getDiscs().forEach(disc -> bracket.addDisc(poleNumber, disc));
  }

  public boolean isPoleEmpty(int poleNumber) {
    return bracket.isPoleEmpty(poleNumber);
  }

  public int getCountOfPoles() {
    return bracket.getCountOfPoles();
  }
}
