import attack.*;
import defense.*;
import fly.*;
import sound.*;

public class Main {
  public static void main(String[] args) {
    Duck superDuck = new Duck(new RocketFly(), new ToaSound(), new ArrowAttack(), new ShieldDefense());
    System.out.println("Super Duck Behaviour : ");
    superDuck.fly();
    superDuck.sound();
    superDuck.attack();
    superDuck.defense();

    System.out.println("");
    System.out.println("Noob Duck Behaviour : ");
    Duck noobDuck = new Duck(new WingsFly(), new NormalSound(), new SwordAttack(), new ArmorDefense());
    noobDuck.fly();
    noobDuck.sound();
    noobDuck.attack();
    noobDuck.defense();

    System.out.println("");
    System.out.println("Super Duck change Fly Behaviour : ");
    superDuck.setFlyBehaviour(new PlaneFly());
    superDuck.fly();
    superDuck.sound();
    superDuck.attack();
    superDuck.defense();
  }
}
