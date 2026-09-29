import java.util.*;
class Shared {
 String message;
 synchronized void receive() throws Exception {
  System.out.println("Waiting for message...");
  while (message == null) wait();
  System.out.println("Message received: " + message);
 }
 synchronized void send(String m) { message=m; notify(); }
}
class Main {
 public static void main(String[] args) throws Exception {
  Shared s=new Shared();
  Thread t1=new Thread(() -> { try { s.receive(); } catch(Exception e) {} });
  Thread t2=new Thread(() -> s.send("Hello Student"));
  t1.start(); t2.start(); t1.join(); t2.join();
 }
}