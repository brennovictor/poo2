
/**
 * Classe abstrata Duck - escreva a descrição da classe aqui
 * 
 * @author (seu nome aqui)
 * @version (versão ou data)
 */
public abstract class Duck
{
    protected QuackBehavior quackBehavior;
    
    protected FlyBehavior flyBehavior;
    
    public abstract void display();
    
    public Duck(FlyBehavior f, QuackBehavior q)
    {
       quackBehavior = q;
       flyBehavior = f;
    }
    
    public void performQuack(){
        quackBehavior.quack();
    }
    
    public void performFly(){
        flyBehavior.fly();
    }
    
    public void setQuackBehavior(QuackBehavior q){
        quackBehavior = q;
    }
    
    public void setFlyBehavior(FlyBehavior f){
        flyBehavior = f;
    }
    
    
    
    
}
