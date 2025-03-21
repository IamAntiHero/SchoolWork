
public class Test 
{
   public static void main(String[] args)
    {
        Continent Asia = new Continent("ASIA");

        Asia.add_Country(new Country("Pakistan"));
        Asia.add_Country(new Country("India"));
        Asia.add_Country(new Country("China"));
        Asia.add_Country(new Country("Afghanistan"));
        Asia.add_Country(new Country("Bangladesh"));

        Asia.countries.get(0).add_City(new City("Hyderabad", 200000.00));
        Asia.countries.get(0).add_City(new City("Karachi", 50000.00));
        Asia.countries.get(0).add_City(new City("Dadu", 100000.00));
        Asia.countries.get(0).add_City(new City("Lahore", 50000.00));
        Asia.countries.get(0).add_City(new City("Islamabad", 50000.00));

        Asia.countries.get(1).add_City(new City("Delhi", 200000.00));
        Asia.countries.get(1).add_City(new City("Agra", 300000.00));
        Asia.countries.get(1).add_City(new City("Mumbai", 400000.00));
        Asia.countries.get(1).add_City(new City("Bangalore", 200000.00));
        Asia.countries.get(1).add_City(new City("Chennai", 200000.00));

        Asia.countries.get(2).add_City(new City("Beijing", 200000.00));
        Asia.countries.get(2).add_City(new City("Wuhan", 300000.00));
        Asia.countries.get(2).add_City(new City("Shanghai", 700000.00));
        Asia.countries.get(2).add_City(new City("Shenzen", 200000.00));
        Asia.countries.get(2).add_City(new City("Harben", 200000.00));

        Asia.countries.get(3).add_City(new City("Kabul", 200000.00));
        Asia.countries.get(3).add_City(new City("Kandahar", 300000.00));
        Asia.countries.get(3).add_City(new City("Jilalabad", 700000.00));
        Asia.countries.get(3).add_City(new City("Herat", 200000.00));
        Asia.countries.get(3).add_City(new City("Ghazni", 30000.00));

        Asia.countries.get(4).add_City(new City("Dhaka", 200000.00));
        Asia.countries.get(4).add_City(new City("Rangpur", 300000.00));
        Asia.countries.get(4).add_City(new City("RajShahi", 700000.00));
        Asia.countries.get(4).add_City(new City("Komila", 200000.00));
        Asia.countries.get(4).add_City(new City("Bogra", 3000.00));

        Asia.calc_pop();

        System.out.println(Asia);
    }
}