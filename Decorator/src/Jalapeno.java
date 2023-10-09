public class Jalapeno extends BurgerDecorator{
    public Jalapeno(Burger burger){
        this.burger = burger;
    }

    public String getDescription(){
        return burger.getDescription() + ", Jalapeno";
    }

    public double getCost(){
        return .5 + burger.getCost();
    }
}
