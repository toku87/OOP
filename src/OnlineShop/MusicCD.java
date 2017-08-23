package OnlineShop;


public abstract class MusicCD implements IProduct {

    protected int price;
    protected String name;
    protected String title;
    protected String performer;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void setProductName(String name) {
        this.name = name;
    }

    @Override
    public String getProductName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public String getPerformer () {
        return performer;
    }
}
