package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	CadastroTestNegativo.class, 
	CadastroTestPositivo.class,
	ComprasTest.class})
public class SuiteDeTestes {

}
