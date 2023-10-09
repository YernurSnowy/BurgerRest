public class Cheese extends BurgerDecorator{
    public Cheese(Burger burger){
        this.burger = burger;
    }

    public String getDescription(){
        return burger.getDescription() + ", Cheese";
    }

    public double getCost(){
        return 1 + burger.getCost();
    }
}
