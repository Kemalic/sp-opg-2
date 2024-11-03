import java.util.ArrayList;
import java.util.List;

class Author {
    private String name;
    private List<Title> titles;

    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public double calculateTotalPay() {
        return titles.stream().mapToDouble(Title::calculateRoyalties).sum();
    }

    public String getName() {
        return name;
    }
}
