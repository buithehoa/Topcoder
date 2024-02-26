package com.topcoder.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RangeEncodingTest {

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
    void minRanges_OneRange() {
        RangeEncoding encoder = new RangeEncoding();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int rangeCount = encoder.minRanges(arr);
        
        assertEquals(1, rangeCount);
    }
    
    @Test
    void minRanges_OneElementRange() {
        RangeEncoding encoder = new RangeEncoding();
        int[] arr = {33};
        int rangeCount = encoder.minRanges(arr);
        
        assertEquals(1, rangeCount);
    }

    @Test
    void minRanges_RangesWithSingleEqualElements() {
        RangeEncoding encoder = new RangeEncoding();
        int[] arr = {3, 3};
        int rangeCount = encoder.minRanges(arr);
        
        assertEquals(2, rangeCount);
    }

    @Test
    void minRanges_RangesWithSingleElements() {
        RangeEncoding encoder = new RangeEncoding();
        int[] arr = {1, 6, 10, 20, 32, 49};
        int rangeCount = encoder.minRanges(arr);
        
        assertEquals(6, rangeCount);
    }
    
    @Test
    void minRanges_RangesWithMultipleElements_1() {
        RangeEncoding encoder = new RangeEncoding();
        
        int[] arr = {2, 4, 5, 6, 8, 9, 10, 11, 12, 15};
        int rangeCount = encoder.minRanges(arr);
        assertEquals(4, rangeCount);
    }
    
    @Test
    void minRanges_RangesWithMultipleElements_2() {
        RangeEncoding encoder = new RangeEncoding();
        
        int[] arr = {10, 11, 12, 13, 14, 15, 20, 21, 22, 23, 25, 27, 28, 29, 30, 31, 32, 33};
        int rangeCount = encoder.minRanges(arr);
        assertEquals(4, rangeCount);
    }

}
