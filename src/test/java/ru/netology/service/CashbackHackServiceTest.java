package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {

    @Test
    public void remain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = cashbackHackService.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void equality() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        Assert.assertEquals(expected, actual);
    }
}