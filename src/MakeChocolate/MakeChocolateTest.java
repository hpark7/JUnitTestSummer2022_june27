package MakeChocolate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeChocolateTest {
    private static MakeChocolate mc;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        mc = new MakeChocolate();
    }

    @Test
    public void testOne() throws Exception
    {
        mc.setSmall(4);
        mc.setBig(1);
        mc.setGoal(10);
        mc.small = mc.getSmall();
        mc.big = mc.getBig();
        mc.goal = mc.getGoal();
        assertEquals(-1,mc.makeChocolate(mc.small, mc.big, mc.goal));
    }

    @Test
    public void testTwo() throws Exception
    {
        assertEquals(4,mc.makeChocolate(4,1,9));
    }

    @Test
    public void testThree() throws Exception
    {
        assertEquals(2,mc.makeChocolate(4,1,7));
    }
}