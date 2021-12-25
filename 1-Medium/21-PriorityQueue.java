// Implement a Priority Queue with push and pop methods. 

public class PriorityQueue {
  int[] heap;
  int size;
  
  public PriorityQueue(int maxSize) {
    heap = new int[maxSize];
    size = 0;
  }

  public void push(int value) {
    if (size == heap.length) throw new IllegalStateException();
  }
}