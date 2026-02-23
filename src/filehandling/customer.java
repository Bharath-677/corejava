package filehandling;

import java.io.Serializable;

public class customer implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	int cid;
	String name;
	long cardnum;
	transient int cvv;
	static int pin;
	
	public customer(int cid, String name, long cardnum, int cvv) {
		super();
		this.cid = cid;
		this.name = name;
		this.cardnum = cardnum;
		this.cvv = cvv;
	}



@Override
	public String toString() {
		return "customer [cid=" + cid + ", name=" + name + ", cardnum=" + cardnum + "]";
	}



	
}





