package daggerdemo.modules.bob;

public class Wheels {
    /**
     * This class is maintained by  Bob
     * and Bob wont allow @Inject to be used in his class
     */

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {

        this.rims = rims;
        this.tires = tires;
    }
}
