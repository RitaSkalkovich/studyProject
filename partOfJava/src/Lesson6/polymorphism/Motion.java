package Lesson6.polymorphism;

public class Motion {
    protected String moving;

    public Motion(String moving) {
        this.moving = moving;
    }


    public void go(){
        System.out.println("default need to change");
    }

}
