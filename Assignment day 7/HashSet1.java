import java.util.HashSet;
import java.util.Iterator;

 class Country {
	HashSet<String> H1 = new HashSet<>();
	
	public HashSet<String> saveCountryNames(String CountryName) {
		H1.add(CountryName);
		return H1;
	}
	
	public String getCountry(String CountryName) {
		Iterator<String> it = H1.iterator();
		
		while (it.hasNext()) {
			if (it.next().equals(CountryName))
				return CountryName;
		}
		
		return null;
	}
}
public class HashSet1 {

	public static void main(String[] args) {
		Country countries = new Country();
		countries.saveCountryNames("India");
		countries.saveCountryNames("Iraq");
		countries.saveCountryNames("South Korea");
		countries.saveCountryNames("Bhutan");
		countries.saveCountryNames("USA");

		System.out.println("Bhutan: " + countries.getCountry("Bhutan"));
		System.out.println("USA: " + countries.getCountry("Japan"));		
	}

}