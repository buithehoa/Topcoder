package com.topcoder.practice;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShootingGameTest {
    private static final double DOUBLE_DELTA = Math.pow(10, -6);
    
    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void findProbability_ShouldReturnBobProbability_WhenWithGoodP() {
        ShootingGame game = getGame();
        double pBob = game.findProbability(400000);
        assertEquals(0.6666666666666667, pBob, DOUBLE_DELTA);
    }
    
    @Test
    void findProbability_ShouldReturnBobProbability_WhenWithNeutralP() {
        ShootingGame game = getGame();
        double pBob = game.findProbability(500000);
        assertEquals(-1.0, pBob, DOUBLE_DELTA);
    }
    
    @Test
    void findProbability_ShouldReturnError() {
        ShootingGame game = getGame();
        double pBob = game.findProbability(999997);
        assertEquals(-1.0, pBob, DOUBLE_DELTA);
    }

    public ShootingGame getGame() {
        return new ShootingGame();
    }

}
