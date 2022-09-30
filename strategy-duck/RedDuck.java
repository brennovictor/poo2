

public class RedDuck extends Duck
{
    public void display(){
        System.out.println("Red duck");
    }
    
    public RedDuck(){
        super (new NormalFly(), new NaturalQuack());
    }

}
