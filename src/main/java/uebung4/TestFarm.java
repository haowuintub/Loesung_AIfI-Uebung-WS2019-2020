package uebung4;

import org.junit.Assert;
import org.junit.Test;

class TestFarm {

    @Test
    void testFarm(){
        Cow cow1 = new Cow("Boris");
        Cow cow2 = new Cow("Janet");

        // Test cowCounter
        Assert.assertEquals(2, Cow.getCowCount()); // oder...
        Assert.assertTrue(Cow.getCowCount() == 2);

        Cow cow3 = new Cow("Lola");
        Cow cow4 = new Cow("Victor");

        // Test cowCounter (again)
        Assert.assertEquals(4, Cow.getCowCount()); // oder...
        Assert.assertTrue(Cow.getCowCount() == 4);

        // Tests Cow Name
        Assert.assertEquals("Janet",cow2.getName()); // oder...
        Assert.assertTrue(cow3.getName().equals("Lola"));

        // Tests Cow Hunger
        Assert.assertEquals(true, cow1.isHungry()); // oder...
        Assert.assertTrue(cow1.isHungry());

        Farmer farmer = new Farmer();
        farmer.feedCow(cow1);

        // Test Cow Hunger after Food
        Assert.assertEquals(false, cow1.isHungry());// oder...
        Assert.assertTrue(!cow1.isHungry()); // Note: the ! negates the following argument, true --> false or false --> true
        Assert.assertFalse(cow1.isHungry());

    }
}



