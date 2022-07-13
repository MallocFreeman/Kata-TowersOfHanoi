package game.pole;

import java.util.EmptyStackException;
import java.util.Optional;
import java.util.Stack;
import java.util.function.Supplier;

public class Pole<T> {

  private final Stack<T> discs;

  Pole() {
    discs = new Stack<>();
  }

  void add(T disc) {
    discs.push(disc);
  }

  public Optional<T> showTop() {
    return executeStackOperation(discs::peek);
  }

  public Optional<T> remove() {
    return executeStackOperation(discs::pop);
  }

  public boolean isEmpty() {
    return discs.isEmpty();
  }

  private Optional<T> executeStackOperation(Supplier<T> stackOperation) {
    try {
      return Optional.of(stackOperation.get());
    } catch (EmptyStackException exception) {
      return Optional.empty();
    }
  }
}
