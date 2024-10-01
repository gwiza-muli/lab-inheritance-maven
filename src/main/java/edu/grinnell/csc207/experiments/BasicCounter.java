package edu.grinnell.csc207.experiments;

import edu.grinnell.csc207.util.Counter;

//Sheilla Muligande and Grant Sackmann


public class BasicCounter implements Counter {
  //field
  protected int count;
  protected int start;

  //contructors 

  public BasicCounter(int starter){
    this.count = starter;
    this.start = starter;
  }

    /**
   * Count something.
   *
   * @throws Exception
   *   When the count gets too large.
   */
  public void increment() throws Exception{
    if (this.count + 1 == Integer.MAX_VALUE){
      throw new Exception("Your integer is too large.");
    }
    this.count++;
  }

  /**
   * Reset the counter.
   */
  public void reset(){
    this.count = this.start;
  }

  public String toString(){
    return "[" + this.count + "]";
  }

  /**
   * Get the value of the counter.
   *
   * @return the current value of the counter
   */
  public int get(){
    return this.count;
  }

}
