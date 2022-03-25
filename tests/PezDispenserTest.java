package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PezDispenserTest {

    private Pezdispenser dispenser;

    @Before
    public void setUp() throws Exception {
        dispenser = new PezDispenser;
    }

    @Test
    public void initialPezCountIsZero() throws Exception {
        assertEquals(7, dispenser.getPezCount());
    }

    @Test
    public void addingPezIncrementsPezCount() throws IllegalArgumentException {
        dispenser.fill(4);
        dispenser.fill(3);

        assertEquals(7, dispenser.getPezCount());
    }

}