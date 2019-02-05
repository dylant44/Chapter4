public class TestBilling
{
    public static void main(String[] args)
    {
        Billing first = new Billing(15);
        Billing second = new Billing(15, 4);
        Billing third = new Billing(15, 8, 20);

        first.display();
        second.display();
        third.display();
    }
}
