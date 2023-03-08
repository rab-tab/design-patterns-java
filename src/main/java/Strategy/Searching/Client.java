package Strategy.Searching;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        SearchContext searchContext = new SearchContext();
        searchContext.setSearch(new BinarySearchStrategy());
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(1);
        nums.add(0);
        searchContext.search(nums);


    }
}
