package tsp.lee.jacobson;
import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

	@Test
	public void testGetDistance_0_0() {
		Tour tour = new Tour();
		int expected = 0 ;
		int actual = tour.getDistance();
		assertEquals(expected,actual, 0.0);
	}

	@Test
	public void testGetDistance_liste2Villes_2() {
		ArrayList<City> listeVille = new ArrayList<>();
		listeVille.add(new City(0,0));
		listeVille.add(new City(0,1));
		Tour tour = new Tour(listeVille);
		int expected = 2; // On s'attend à obtenir 2 car on fait un allez-retour
		int actual = tour.getDistance();
		assertEquals(expected, actual, 0.0);
	}

	@Test
	public void testGetDistance_liste3Villes_8() {
		ArrayList<City> listeVille = new ArrayList<>();
		listeVille.add(new City(0,0));
		listeVille.add(new City(0,1));
		listeVille.add(new City(2,2));
		Tour tour = new Tour(listeVille);
		int expected = 8; // On retourne à la ville de départ
		int actual = tour.getDistance();
		assertEquals(expected,actual, 0.0);
	}
}