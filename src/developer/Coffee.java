package developer;




//In Source Packet in file clone/ex2/Coffee.java
public class Coffee implements Cloneable {

 private int volume; // Volume in milliliters

 Coffee(int volume) {
     this.volume = volume;
 }

 public Object clone() {
     try {
         return super.clone();
     }
     catch (CloneNotSupportedException e) {
         // This should never happen
         throw new InternalError(e.toString());
     }
 }

 public void add(int amount) {
     volume += amount;
 }

 public int remove(int amount) {
     int v = amount;
     if (volume < amount) {
         v = volume;
     }
     volume -= v;
     return v;
 }

 public int removeAll() {
     int all = volume;
     volume = 0;
     return all;
 }
}