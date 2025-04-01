public class SpecialtyCoffee extends Coffee
{
    private String flavor;
    
    public SpecialtyCoffee() 
    {
        super();
        flavor = "vanilla";
    }

    public SpecialtyCoffee(String size, String type, String flavor)
    {
        super();
        this.flavor = flavor;
    }

    public SpecialtyCoffee(String size, boolean isSkinny, int shots, String type, String flavor)
    {
        super(size, isSkinny, shots, type);
        this.flavor = flavor;
    }

    public double getPrice() 
    {
        return super.getPrice()*(1.5)
    }
    
    public String toString()
    {
        return super.toString() + " with " + flavor;
    }

    public void printPriceComparison()
    {
        System.out.println("A regular cofffee costs " + super.getPrice());
        System.out.println("This coffee costs " + this.getPrice());
        System.out.println("This coffee costs " + getPrice());
    }
}
