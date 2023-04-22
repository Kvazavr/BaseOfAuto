package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceTest {
    @Test
    public void shouldCalculateRestWhenAmountLess1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(600);
        int expected = 400;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void amount1001() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1001);
        int expected = 999;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void amount999() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldNotMessageWhenAmountMoreThan2000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2500);
        int expected = 500;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldNotMessageWhenAmountMoreThan1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1500);
        int expected = 500;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnZeroWhenAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void amountIsNegative() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertThrows(IllegalArgumentException.class,
                () -> service.remain(-1500)
        );
    }

    @Test
    public void amountIsZero() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;
        Assert.assertEquals(actual, expected);
    }
}
