package Strategy.Searching;

import java.util.List;

public class SearchContext {
    SearchStrategy search;

    public void setSearch(SearchStrategy search) {
        this.search = search;
    }

    void search(List<Integer> nums) {
        search.search(nums);
    }
}
