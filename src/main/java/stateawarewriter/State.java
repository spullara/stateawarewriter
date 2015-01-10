package stateawarewriter;

/**
 * Tracks the state of a stream
 */
public interface State<T> {
  public void nextState(char[] chars, int off, int len);
  public T getState();
}
