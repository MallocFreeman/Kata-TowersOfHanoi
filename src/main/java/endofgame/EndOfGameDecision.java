package endofgame;

import game.Game;

public abstract class EndOfGameDecision {
  final Game game;
  final int start;
  final int end;

  public EndOfGameDecision(Game game, int start, int end) {
    this.game = game;
    this.start = start;
    this.end = end;
  }

  public abstract boolean isEndOfGame();

  public int getStart() {
    return start;
  }

  public int getEnd() {
    return end;
  }
}
