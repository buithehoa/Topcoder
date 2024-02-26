package com.topcoder.practice;

import java.util.ArrayList;
import java.util.List;

public class RangeEncoding {
    public int minRanges(int[] arr) {
        List<Integer> ranges = new ArrayList<>();
        int elementCount = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                elementCount = 1;
            } else {
                if (arr[i] == arr[i - 1] + 1) {
                    elementCount++;
                } else {
                    ranges.add(elementCount);
                    elementCount = 1;
                }
            }
            
            if (i == arr.length - 1) {
                ranges.add(elementCount);
            }
        }
        
        return ranges.size();
    }
}
