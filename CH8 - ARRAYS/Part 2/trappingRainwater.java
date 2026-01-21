/*
Given n non negative integers representing an elevation
map where the width of each bar is 1, compute how much
water it can trap after raining.
*/

import java.util.*;

public class trappingRainwater {

    // Trapping Rainwater
    public static int trap(int height[]) {
        int n = height.length;
        // Calculate Left Max Boundary
        int lMax[] = new int[n];
        lMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            lMax[i] = Math.max(height[i], lMax[i - 1]);
        }
        // Calculate Right Max Boundary
        int rMax[] = new int[n];
        rMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rMax[i] = Math.max(height[i], rMax[i + 1]);
        }
        // Loop
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            // Water level = min(leftMax bound, RightMax bound)
            int Waterlevel = Math.min(lMax[i], rMax[i]);
            // Trapped Water = Waterlevel - height[i]
            trappedWater += Waterlevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("The height of trapped Water is : "+trap(height));
    }
}
