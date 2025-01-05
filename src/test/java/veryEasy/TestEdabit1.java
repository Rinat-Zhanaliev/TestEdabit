package veryEasy;

import edabitVeryEasy.Edabit1;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEdabit1 {
    @Test
    void testEB1 (){
        Edabit1 edabit1 = new Edabit1();
        Assert.assertEquals(Edabit1.sumOfTwoNum(4,5),9);
    }
}
