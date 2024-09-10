public class Carro{
    private String barulho = "";
    
    public Carro(String barulho){
        this.barulho = barulho;
    }

    public void acelerar(){
        System.out.println(barulho);
        System.out.println("Vroom vroom!");
    }
}