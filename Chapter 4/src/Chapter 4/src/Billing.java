public class Billing
{
    private double bookPrice;
    private int quantitiyOrdered;
    private int couponValue;
    private double total;
    private double tax;

    public Billing(double price, int quantity, int coupon)
    {
        bookPrice = price;
        quantitiyOrdered = quantity;
        couponValue = coupon;
        tax = (price * quantity) - ((price * quantity) * .8);
        total = ((price * quantity) + tax) - coupon;
    }

    public Billing(double price, int quantity)
    {
        this(price, quantity, 0);
        tax = (price * quantity) - ((price * quantity) * .8);
        total = (price * quantity) + tax;
    }

    public Billing(double price)
    {
        this(price, 1, 0);
        tax = price - (price * .8);
        total = tax + price;
    }

    public void display()
    {
        System.out.println("Price per book: " + bookPrice + " Number of books ordered: " + quantitiyOrdered + " Coupon value applied: " + couponValue + " Tax: " + tax + " Total cost: " + total);
    }
}
