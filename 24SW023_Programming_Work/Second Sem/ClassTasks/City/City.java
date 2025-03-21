public class City
{
    String name;
    double population;

    public City(String name, double population)
    {
        this.name=name;
        this.population=population;
    }

    public String toString()
    {
        return "\nCity: "+name+"\tPopulation: "+population+"\n";
    }
}
