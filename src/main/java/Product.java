public abstract class Product {
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    protected String ID;
    protected int value;
    protected String exchange;
    protected String ticker;
    protected String contractCode;
    protected int month;
    protected int year;

    public static void main(String[] args) {

    }
}
