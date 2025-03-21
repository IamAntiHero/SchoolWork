
import java.util.ArrayList;
public class Country 
{
    String name;
    double population;  
    public ArrayList<City> cities;
    
    public Country(String name)
    {
        this.name = name;
        cities = new ArrayList<>();
    }

    public void add_City(City city)
    {
        cities.add(city);
    }

    public void calc_pop()
    {
        for(int i=0; i<cities.size(); i++)
        {
            this.population += cities.get(i).population;
        }
    }

    public String toString()
    {   System.out.println("Country :"+name+"\n"+name+" Poulation: "+population);
        for(int i=0; i<cities.size(); i++)
        {
            System.out.println(cities.get(i));
        }
        return "";
    }
}
