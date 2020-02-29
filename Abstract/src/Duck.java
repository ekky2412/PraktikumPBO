import fly.*;
import sound.*;
import attack.*;
import defense.*;

public class Duck {
    private Fly flyBehaviour;
    private Sound soundBehaviour;
    private Attack attackBehaviour;
    private Defense defenseBehaviour;
    
    public Duck(Fly flyBehaviour,Sound soundBehaviour,
                Attack attackBehaviour,Defense defenseBehaviour){
        this.flyBehaviour = flyBehaviour;
        this.soundBehaviour = soundBehaviour;
        this.attackBehaviour = attackBehaviour;
        this.defenseBehaviour = defenseBehaviour;
    }

    public void setFlyBehaviour(Fly flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setSoundBehaviour(Sound soundBehaviour) {
        this.soundBehaviour = soundBehaviour;
    }

    public void setAttackBehaviour(Attack attackBehaviour) {
        this.attackBehaviour = attackBehaviour;
    }

    public void setDefenseBehaviour(Defense defenseBehaviour) {
        this.defenseBehaviour = defenseBehaviour;
    }
    
    public void fly(){
        flyBehaviour.fly();
    }
    
    public void sound(){
        soundBehaviour.sound();
    }
    
    public void attack(){
        attackBehaviour.attack();
    }
    
    public void defense(){
        defenseBehaviour.defense();
    }
}
