import org.junit.Assert;
import org.junit.Test;

import ca.ryerson.secondaryStructure.features.FeatureCalculator;

public class FeatureCalculatorTest {

	@Test
	public void featureCalculatorTest() {
		FeatureCalculator fCalculator = new FeatureCalculator();
		
		int lgCount = fCalculator.calculateLxxG("ABLCDGLLTEGF");
		Assert.assertTrue(lgCount == 2);
		
	}
}
