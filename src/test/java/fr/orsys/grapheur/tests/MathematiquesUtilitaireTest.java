package fr.orsys.grapheur.tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.orsys.grapheur.utilitaire.mathematiques.MathematiquesUtilitaire;

public class MathematiquesUtilitaireTest {

		long pgcd;
		//long result=8;
		static long debutChrono;
		static long finChrono;

	@BeforeClass
	public static void beforeClass()
   {
    System.out.println("Test de la classe MathematiquesUtilitaire");
    debutChrono = System.currentTimeMillis();
   }
   
   @AfterClass
   public static void afterClass()
   {
    finChrono = System.currentTimeMillis();
	long duree = finChrono - debutChrono;
	System.out.println("Duree classe : " + duree + " ms");
	System.out.println();
   }
   
   @Before
   public void beforeTest()
   {
   
   }
   
   @After
   public void afterTest()
   {

   }		
		
	@Test public void pgcd2416()
	{
		pgcd=MathematiquesUtilitaire.pgcd(24,16);
		System.out.println("** Test pgcd de 24 et 16 attendu 8 obtenu : " + pgcd ); 
		assertEquals(pgcd,8);

		pgcd=MathematiquesUtilitaire.pgcd(16,24);
		System.out.println("** Test pgcd de 16 et 24 attendu 8 obtenu : " + pgcd ); 
		assertEquals(pgcd,8);
	}

	
	@Test public void pgcd3317()
	{
		pgcd=MathematiquesUtilitaire.pgcd(33,17);
		System.out.println("** Test pgcd de 33 et 17 attendu 1 obtenu : " + pgcd ); 
		assertEquals(pgcd,1);

		pgcd=MathematiquesUtilitaire.pgcd(17,33);
		System.out.println("** Test pgcd de 17 et 33 attendu 1 obtenu : " + pgcd ); 
		assertEquals(pgcd,1);
	}

	@Test public void pgcd04()
	{
		pgcd=MathematiquesUtilitaire.pgcd(0,4);
		System.out.println("** Test pgcd de 0 et 4 attendu 4 obtenu : " + pgcd ); 
		assertEquals(pgcd,4);
	}
	
	@Test(expected=ArithmeticException.class)
		public void pgcd40()
		{
		System.out.println("** Test pgcd de 4 et 0 attendu : exception" ); 
		pgcd=MathematiquesUtilitaire.pgcd(4,0);
		}
		
		
    @Test
	public void testBasique()
	{
		System.out.println("Test basique");
		int calcul = 5*4;
		assertEquals( calcul,20 );
	}
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
