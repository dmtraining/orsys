package fr.orsys.grapheur.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)

	@SuiteClasses(value=
		{StringUtilitaireTest.class, MathematiquesUtilitaireTest.class,
		 ListeUtilitaireTest.class}
	)
public class AllTests {
}