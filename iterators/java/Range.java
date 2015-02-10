import java.util.Iterator;

public class Range implements Iterable<Integer> {
  
  private int start;
  private int stop;
  private int step;

  public Range(int stop) {
    this(0, stop, 1);
  }

  public Range(int start, int stop) {
    this(start, stop, 1);
  }

  public Range(int start, int stop, int step) {
    this.start = start;
    this.stop = stop;
    this.step = step;
  }

  public Iterator<Integer> iterator() {

    Iterator<Integer> it = new Iterator<Integer>() {
      private int current = start;

      @Override
      public boolean hasNext() {
        return current < stop;
      }

      @Override
      public Integer next() {
        Integer n = current;
        current += step;
        return n;
      }

      public void remove() {
        throw new UnsupportedOperationException();
      }
    };
    
    return it;
  }
}
