package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {

	City A = new City(0,0);
	City B = new City (0,1);
	City C = new City (1,0);

	@Test
	public void distanceTo_AFromA_0() {
		double expected = 0;
		double actual = A.distanceTo(A);
		assertEquals(expected, actual, 0.0);
	}

	@Test
	public void distanceTo_BFromA_1(){
		double expected = 1;
		double actual = A.distanceTo(B);
		assertEquals(expected, actual, 0.0);
	}

	@Test
	public void distanceTo_AFromB_1(){
		double expected = 1;
		double actual = B.distanceTo(A);
		assertEquals(expected, actual, 0.0);
	}

	@Test
	public void distanceTo_AFromC_1(){
		double expected = 1;
		double actual = C.distanceTo(A);
		assertEquals(expected, actual, 0.0);
	}

	@Test
	public void distanceTo_CFromA_1(){
		double expected = 1;
		double actual = A.distanceTo(C);
		assertEquals(expected, actual, 0.0);
	}

	@Test
	public void distanceTo_DFromE_2() {
		City D = new City(3,4);
		City E = new City(4, 4);
		double expected = 2;
		double actual = D.distanceTo(E);
		assertEquals(expected, actual, 0.0);
	}

	@Test(expected=NullPointerException.class)
	public void distanceTo_Null_NullPointerException() {
		double actual = A.distanceTo(null);
	}

	@Test
	public void distanceTo_NegativeBfromA_1(){
		City negativeB = new City(0,-1);
		double expected = 1;
		double actual = A.distanceTo(negativeB);
		assertEquals(expected, actual, 0.0);
	}
}