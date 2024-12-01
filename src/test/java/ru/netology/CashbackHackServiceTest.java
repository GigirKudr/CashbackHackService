package ru.netology;

import org.junit.Assert;
import org.junit.Test;



public class CashbackHackServiceTest {
    @Test
    public void bonusMore() {
        CashbackHackService bonus = new CashbackHackService();
        int amount = 2000;

        int actual = bonus.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void bonusLess() {
        CashbackHackService bonus = new CashbackHackService();
        int amount = 800;

        int actual = bonus.remain(amount);
        int expected = 200;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void bonusEqualle() {
        CashbackHackService bonus = new CashbackHackService();
        int amount = 1000;

        int actual = bonus.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
}
