import java.util.*;
class Main {
 public static void main(String[] args) throws Exception {
  Thread low = new Thread(() -> System.out.println("LowPriority = " + Thread.currentThread().getPriority()), "LowPriority");
  Thread high = new Thread(() -> System.out.println("HighPriority = " + Thread.currentThread().getPriority()), "HighPriority");
  low.setPriority(3); high.setPriority(8);
  low.start(); low.join();
  high.start(); high.join();
  System.out.println("Both threads completed.");
 }