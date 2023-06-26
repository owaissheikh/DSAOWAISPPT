package ArrayAssigment2;

// Question 4
// You have a long flowerbed in which some of the plots are planted, and some are not.
// However, flowers cannot be planted in adjacent plots.
// Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

// Example 1:
// Input: flowerbed = [1,0,0,0,1], n = 1
// Output: true

public class FlowerBedPlanting {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int i = 0;

        while (i < flowerbed.length) {
            // Check if the current plot is empty and its adjacent plots are also empty
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                // Plant a flower in the current plot
                flowerbed[i] = 1;
                count++;

                // Check if the required number of flowers have been planted
                if (count >= n) {
                    return true;
                }
            }

            i++;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        FlowerBedPlanting solution = new FlowerBedPlanting();
        boolean canPlace = solution.canPlaceFlowers(flowerbed, n);
        System.out.println("Can place " + n + " flowers: " + canPlace);
    }
}

