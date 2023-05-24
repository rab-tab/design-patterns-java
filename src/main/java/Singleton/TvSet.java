package Singleton;

public class TvSet {
    private static volatile TvSet tvSet = null;

    public TvSet() {
        System.out.println("Tv set object created");
    }

    public static TvSet getTvSet() {
        if (tvSet == null) { //optimisation
            synchronized (TvSet.class) {
                if (tvSet == null) // double checking
                    tvSet = new TvSet();
            }
        }
        return tvSet;
    }
}
