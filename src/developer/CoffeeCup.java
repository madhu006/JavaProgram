package developer;


//In Source Packet in file clone/ex3/CoffeeCup.java
class CoffeeCup implements Cloneable {

 private Coffee innerCoffee = new Coffee(0);

 public Object clone() {
     CoffeeCup copyCup = null;
     try {
         copyCup = (CoffeeCup) super.clone();
     }
     catch (CloneNotSupportedException e) {
         // this should never happen
         throw new InternalError(e.toString());
     }
     copyCup.innerCoffee = (Coffee) innerCoffee.clone();
     return copyCup;
 }

 public void add(int amount) {
     innerCoffee.add(amount);
 }

 public int releaseOneSip(int sipSize) {
     return innerCoffee.remove(sipSize);
 }

 public int spillEntireContents() {
     return innerCoffee.removeAll();
 }
}