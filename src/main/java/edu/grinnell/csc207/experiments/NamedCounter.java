package edu.grinnell.csc207.experiments;

/**
 * Counters that have names.
 */
public class NamedCounter extends DecrementableCounter {
  /**
   * The name associated with the counter.
   */
  String name;

  /**
   * Create a new named counter.
   *
   * @param counterName
   *   The name of the counter.
   * @param start
   *   The starting value (also used for reset).
   */
  public NamedCounter(String name, int start) {
    super(start);
    System.err.printf("NamedCounter(%s, %d)\n", name, start); 
  } // NamedCounter(String, int)
} // class NamedCounter 