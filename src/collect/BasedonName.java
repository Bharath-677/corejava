package collect;

import java.util.Comparator;

public class BasedonName implements Comparator<Pedilite> {

	@Override
	public int compare(Pedilite o1, Pedilite o2) {
		
		return o1.name.compareTo(o2.name);
	}

}
