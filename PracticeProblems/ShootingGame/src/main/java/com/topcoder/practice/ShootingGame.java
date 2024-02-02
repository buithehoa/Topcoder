/**
 * 
 */
package com.topcoder.practice;

/**
 * 
 */
public class ShootingGame {
    public double findProbability(int p) {
        double pAlice = p / Math.pow(10, 6);
        double pBob = pAlice / (1 - pAlice);
        
        return (pBob >= 1) ? -1.0 : pBob;
    }
}
