package fr.orsys.grapheur.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.orsys.grapheur.utilitaire.ListeUtilitaire;


/*
  TRAVAIL A FAIRE : FAIRE UN TEST QUI TEST LA TRONCATURE D'UNE LISTE
  AVEC LA FONCTION Tronquer de la classe ListeUtilitaire
*/

public class ListeUtilitaireTest {

		
	static long debutChrono;
	static long finChrono;
	
	static List uneListe = new ArrayList();
	
	@BeforeClass
	public static void beforeClass()
   {
    System.out.println("Test de la classe stringUtilitaire");
    debutChrono = System.currentTimeMillis();
	// ARRANGE
	uneListe.add("un");
	uneListe.add("deux");
	uneListe.add("trois");
	
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
	public void testTronqueListe() 
	{
	   System.out.println("Test liste tronquee");
	   // ACT
	   List listeTronquee = ListeUtilitaire.tronquer( uneListe , 2 );
	   // ASSERT
	   assertEquals( listeTronquee.size() , 2 );
	}

}