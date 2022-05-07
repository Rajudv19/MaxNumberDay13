package com.BridgeLabs.day13;

import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;

public class MaxOfThreeStringTest {
	@Test
	public void mentionedMaxNumberAtFirstPositionOrNot(){
		MaxOfThreeString maxName = new MaxOfThreeString();
		String result = maxName.maximumThreeNumbers("Raju","Pavan","Ganesh");
		Assert.assertEquals("Raju",result);
	}

	@Test
	public void mentionedMaxNumberAtSecondPositionOrNot() {
		MaxOfThreeString maxName = new MaxOfThreeString();
		String result = maxName.maximumThreeNumbers("Raju","Srinivas","Goutham");
		Assert.assertEquals("Goutham",result);
	}

	@Test
	public void mentionedMaxNumberAtThirdPositionOrNot() {
		MaxOfThreeString maxName = new MaxOfThreeString();
		String result = maxName.maximumThreeNumbers("Raju","Ravi","Sharath");
		Assert.assertEquals("Sharath",result);
	}
}
