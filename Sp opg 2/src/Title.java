abstract class Title {
    protected String literatureType;
    protected int copies;
    public static final double RATE = 0.067574;

    public Title(String literatureType, int copies) {
        this.literatureType = literatureType;
        this.copies = copies;
    }

    public abstract double calculatePoints();

    public double calculateRoyalties() {
        return calculatePoints() * RATE;
    }
}
