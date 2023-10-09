public class Hamburger extends Burger{
    public Hamburger(){
        description = "Hamburger";
    }

    @Override
    public double getCost() {
        return 2;
    }
}
