package collect;

import java.util.Comparator;

public class BasedonId implements Comparator<Pedilite>{

	@Override
	public int compare(Pedilite o1, Pedilite o2) {
		
		return o1.id-o2.id;
	}

}
