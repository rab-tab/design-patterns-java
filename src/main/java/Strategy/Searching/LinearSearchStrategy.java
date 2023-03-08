package Strategy.Searching;

import java.util.List;

public class LinearSearchStrategy implements SearchStrategy {
    @Override
    public void search(List<Integer> nums) {
        System.out.println("Linear search");
    }
}
