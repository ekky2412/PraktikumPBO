/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractInterface;

public class Cat extends Animal implements Pet{
    String name;
    public Cat(){
        this("");
    }
    
    public Cat(String name){
        super(4);
        this.name=name;
    }
    @Override
    void eat(){
        System.out.println("Kucing sedang "+"memakan ikan");
    }
    
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void play(){
        System.out.println("Kucing sedang bermain");
    }
}
