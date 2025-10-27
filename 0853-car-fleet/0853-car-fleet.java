import java.util.*;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double[][] cars = new double[n][2];
        
        // Pair each car's position with its speed
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        
        // Sort by position in descending order (closest to target first)
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));
        
        Stack<Double> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            double time = (target - cars[i][0]) / cars[i][1];
            stack.push(time);
            
            // If two fleets meet (i.e., the last car reaches at same or earlier time)
            if (stack.size() >= 2 && stack.peek() <= stack.get(stack.size() - 2)) {
                stack.pop(); // merge into the same fleet
            }
        }
        
        return stack.size();
    }
}
