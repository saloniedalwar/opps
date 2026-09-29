import java.util.*;
class MyThread extends Thread {
 public void run() {
  System.out.println("Thread is running.");
 }
}
class Main {
 public static void main(String[] args) throws Exception {
  System.out.println("Thread is starting.");
  Thread t = new MyThread();
  t.start();
  t.join();
  System.out.println("Thread has completed.");
 }