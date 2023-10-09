public class Pickles extends BurgerDecorator{
    public Pickles(Burger burger){
        this.burger = burger;
    }

    public String getDescription(){
        return burger.getDescription() + ", Pickles";
    }

    public double getCost(){
        return .5 + burger.getCost();
    }
}
