package tsp.lee.jacobson;

import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test;


public class GATest {

	@Test
	public void testEvolvePopulation_1SeuleTourneeConnue_AucunChangement() {
		System.out.println("Evolution de la Population");

		ArrayList<City> listeVille = new ArrayList();
		listeVille.add(new City(2, 3));
		listeVille.add(new City(4, 5));
		Tour tour = new Tour(listeVille);

		Population population = new Population(1, false);
		population.saveTour(0, tour);
		Population result = GA.evolvePopulation(population);

		assertEquals(result.getTour(0).getCity(0), listeVille.get(0));
		assertEquals(result.getTour(0).getCity(1), listeVille.get(1));
	}

	@Test
	public void testEvolvePopulation_1SeuleTourneeInconnue_AucunChangement() {
		System.out.println("Evolution de la Population");

		City ville1 = new City(2, 3);
		City ville2 = new City(4, 5);
		TourManager.addCity(ville1);
		TourManager.addCity(ville2);

		Population population = new Population(1, true);
		Population result = GA.evolvePopulation(population);

		assertEquals(result.getTour(0).getCity(0), population.getTour(0).getCity(0));
		assertEquals(result.getTour(0).getCity(1), population.getTour(0).getCity(1));
	}
}