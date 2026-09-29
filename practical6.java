import java.util.*;
class Task implements Runnable {
 public void run() {
  for (int i = 0; i < 3; i++) System.out.println("Hello Student");
 }
}
class Main {
 public static void main(String[] args) throws Exception {
  Thread t = new Thread(new Task());
  t.start();
  t.join();
  System.out.println("Main thread completed.");
 }