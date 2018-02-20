package exceptions.task2;

public class Price{
    private String good;
    private String magazine;
    private int price;

    public Price(String good, String magazine, int price) {
        this.good = good;
        this.magazine = magazine;
        this.price = price;
    }

    public String getName() {
        return good;
    }

    public void setName(String good) {
        this.good = good;
    }

    public String getMagazine() {
        return magazine;
    }

    public void setMagazine(String magazine) {
        this.magazine = magazine;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
