package com.BridgeLabs.day13;
import org.junit.Test;
import junit.framework.Assert;

public class MaxofThreeNoFloatTest {
	@Test
	public void mentionedMaxNumberAtFirstPositionOrNot(){
		MaxOfThreeNoFloat maxNumber = new MaxOfThreeNoFloat();
		double result = maxNumber.maximumThreeNumbers(90.0,100.0,50.5);
		Assert.assertEquals(90.0,result);
	}

	@Test
	public void mentionedMaxNumberAtSecondPositionOrNot() {
		MaxOfThreeNoFloat maxNumber = new MaxOfThreeNoFloat();
		double result = maxNumber.maximumThreeNumbers(30.5,50.6,34.7);
		Assert.assertEquals(50.6,result);
	}

	@Test
	public void mentionedMaxNumberAtThirdPositionOrNot() {
		MaxOfThreeNoFloat maxNumber = new MaxOfThreeNoFloat();
		double result = maxNumber.maximumThreeNumbers(100.0,20.8,90.4);
		Assert.assertEquals(90.4,result);
	}
}






