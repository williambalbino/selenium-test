package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	ComprasTest.class,
	CadastroTestPositivo.class,
	CadastroTestNegativo.class
	})
public class SuiteDeTestes {

}
