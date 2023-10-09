public class Cutlet extends BurgerDecorator{
    public Cutlet(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Cutlet";
    }

    @Override
    public double getCost() {
        return 1 + burger.getCost();
    }
}
