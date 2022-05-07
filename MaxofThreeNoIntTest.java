package com.BridgeLabs.day13;
import org.junit.Assert;
import org.junit.Test;

public class MaxofThreeNoIntTest {
	@Test
	public void mentionedMaxNumberAtFirstPositionOrNot(){
		MaxOfThreeNoInt maxNumber = new MaxOfThreeNoInt();
		int result = maxNumber.maximumThreeNumbers(35,20,34);
		Assert.assertEquals(35,result);
	}

	@Test
	public void mentionedMaxNumberAtSecondPositionOrNot() {
		MaxOfThreeNoInt maxNumber = new MaxOfThreeNoInt();
		int result = maxNumber.maximumThreeNumbers(30,50,34);
		Assert.assertEquals(50, result);
	}

	@Test
	public void mentionedMaxNumberAtThirdPositionOrNot() {
		MaxOfThreeNoInt maxNumber = new MaxOfThreeNoInt();
		int result = maxNumber.maximumThreeNumbers(30,20,90);
		Assert.assertEquals(90, result);
	}
}
