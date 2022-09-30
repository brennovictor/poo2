public class SertanejoDuck extends Duck
{
    public void display(){
        System.out.println("Sertanejo duck");
    }
    
    public SertanejoDuck(){
        super (new FlyWithNoWings(), new SertanejoQuack());
    }

}