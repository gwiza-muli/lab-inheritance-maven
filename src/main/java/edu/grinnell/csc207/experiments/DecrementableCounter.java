package edu.grinnell.csc207.experiments;

/**
 * Counters that you can decrement.
 */
public class DecrementableCounter extends BasicCounter {
  /**
   * Create a new decrementable counter.
   *
   * @param start
   *   The initial value of the counter.
   */
  public DecrementableCounter(int start) {
    super(start);
  } // DecrementableCounter(int)
  
  
   //methods
   public void decrement(){
     this.count--;
   }

} // class DecrementableCounter