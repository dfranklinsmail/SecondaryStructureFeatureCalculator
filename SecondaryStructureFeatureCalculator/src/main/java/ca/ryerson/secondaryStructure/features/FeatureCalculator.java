package ca.ryerson.secondaryStructure.features;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FeatureCalculator {

	public int calculateLxxG(final String aaSequence) {
		int result = 0;
		
		String lowerAASequence = aaSequence.toLowerCase();
		Pattern pattern = Pattern.compile("l*g");
        Matcher  matcher = pattern.matcher(lowerAASequence);
        while (matcher.find())
            ++result;
        
		return result;
	}
}
