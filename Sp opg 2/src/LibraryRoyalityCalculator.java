public class LibraryRoyalityCalculator {
    public static void main(String[] args) {
        // Opret en forfatter
        Author author = new Author("Sussi Bech");

        // Tilføj titler (bøger og lydbøger) til forfatteren
        author.addTitle(new PrintedBook("TE", 140, 72)); // Tegneserie
        author.addTitle(new AudioBook("SKØN", 10, 400)); // Skønlitterær lydbog
        author.addTitle(new PrintedBook("FAG", 50, 300)); // Fagbøger

        // Beregn og udskriv det samlede beløb for forfatteren
        double totalPay = author.calculateTotalPay();
        System.out.printf("%s: %.2f kr%n", author.getName(), totalPay);
    }
}
