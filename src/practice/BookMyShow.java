package practice;

public interface BookMyShow {
	
	// which hides the data,it is pure abstract class

	// by using interface we can achive multiple inheritance
	// we are declaration it self ,child class only
	
	
 public void MovieTicket(); // it allows only abstract methods 
	
	public final static int id=30; //defalult variables are public, final and static declare or not
	
	public abstract void morningshow(); // defalut methodes are public and abstract declare or not
	
	//public BookMyShow() {
		
	// we cant't  creat constractor in interface	
//	}
	
	//{
	//	we can't write  instance blocks
		
	//}
	
	//static{
		
		// we can't write  static blocks
//	}
	
	//BookMyShow bk=new BookMyShow(); we can't write object in interface
	

}
