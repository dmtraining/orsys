package fr.orsys.grapheur.tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.orsys.grapheur.utilitaire.StringUtilitaire;

public class StringUtilitaireTest {

		String w1;
		String w2;
		String w3;
		int somme;
		static long debutChrono;
		static long finChrono;

	@BeforeClass
	public static void beforeClass()
   {
    System.out.println("Test de la classe stringUtilitaire");
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
		
	@Test
	/** Transforme en majuscule le premier caract�re d'une cha�ne en minuscules **/
	public void toutMinuscule() 
	{
		w1="orsys";
		w2=StringUtilitaire.premiereLettreMajuscule(w1);
		System.out.println("** Test premiereLettreMajuscule conversion obtenue : " + w2 ); 
		assertEquals("Orsys",w2);

	}

	@Test
	/** Transforme en majuscule le premier caract�re d'une cha�ne en majuscules **/
	public void toutMajuscule() 
	{
		w1="ORSYS";
		w2=StringUtilitaire.premiereLettreMajuscule(w1);
		System.out.println("** Test toutMajuscule conversion obtenue : " + w2 ); 
		assertEquals("ORSYS",w2);
	}

	@Test
	/** Pas de transformation de la cha�ne de caracteres si le premier n'est pas une lettre minuscule ou majuscule **/
	public void premierCaracterePasLettre() 
	{
		w1=" ORSYS";
		w2=StringUtilitaire.premiereLettreMajuscule(w1);
		System.out.println("** Test premierCaracterePasLettre conversion obtenue : " + w2 ); 
		assertEquals(" ORSYS",w2);
		w1="9ORSYS";
		w2=StringUtilitaire.premiereLettreMajuscule(w1);
		System.out.println("** Test premierCaracterePasLettre conversion obtenue : " + w2 ); 
		assertEquals("9ORSYS",w2);
	}


	
}