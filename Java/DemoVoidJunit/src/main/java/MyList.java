import java.util.*;


public class MyList {

	private List lstFruits = new ArrayList<Object>();
	
	public void add(String fruit) {
		lstFruits.add(fruit);
	}
	public void remove(String fruit) {
		if(!lstFruits.contains(fruit)) 	{
			throw new NoSuchElementException(); 
		}
		lstFruits.remove(fruit);
	}
	public int size() {
		return lstFruits.size();
	}
	public void removeAll() {
		lstFruits.clear();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
