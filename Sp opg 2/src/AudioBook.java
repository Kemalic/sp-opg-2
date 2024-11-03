class AudioBook extends Title {
    private int durationInMinutes;

    public AudioBook(String literatureType, int copies, int durationInMinutes) {
        super(literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    public double calculatePoints() {
        double literaturePoints = calculateLiteraturePoints();
        return (durationInMinutes * 0.5) * literaturePoints * copies;
    }

    private double calculateLiteraturePoints() {
        return switch (literatureType) {
            case "BI", "TE" -> 1.5;
            case "LYRIK" -> 3.0;
            case "SKØN" -> 0.85;
            case "FAG" -> 0.5;
            default -> 1.0;
        };
    }
}
