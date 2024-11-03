class PrintedBook extends Title {
    private int pages;

    public PrintedBook(String literatureType, int copies, int pages) {
        super(literatureType, copies);
        this.pages = pages;
    }

    @Override
    public double calculatePoints() {
        double literaturePoints = calculateLiteraturePoints();
        return pages * literaturePoints * copies;
    }

    private double calculateLiteraturePoints() {
        return switch (literatureType) {
            case "BI", "TE" -> 3.0;
            case "LYRIK" -> 6.0;
            case "SKØN" -> 1.7;
            case "FAG" -> 1.0;
            default -> 1.0;
        };
    }
}
