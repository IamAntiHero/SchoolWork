
import java.util.ArrayList;
public class Continent 
{
    String name;
    double population;  
    public ArrayList<Country> countries;
    
    public Continent(String name)
    {
        this.name = name;
        countries = new ArrayList<>();
    }

    public void add_Country(Country country)
    {
        countries.add(country);
    }

    public void calc_pop()
    {   
        for(int i=0; i<countries.size(); i++)
        {   countries.get(i).calc_pop();
            this.population += countries.get(i).population;
        }
    }

    public String toString()
    {   System.out.println("Continent :"+name+"\n"+name+" Poulation: "+population);
        for(int i=0; i<countries.size(); i++)
        {
            System.out.println(countries.get(i));
        }
        return "";
    }
}
