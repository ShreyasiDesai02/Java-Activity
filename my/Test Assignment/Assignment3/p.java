package Assignment3;

import java.util.Comparator;

public class p implements Comparator<Player>{

	@Override
	public int compare(Player p1, Player p2) {
		double diff = p1.getPowerRating() - p2.getPowerRating();
        if (diff > 0) {
            return 1;
        } else if (diff < 0) {
            return -1;
        } else {
            return 0;
        }
	}
	
}

