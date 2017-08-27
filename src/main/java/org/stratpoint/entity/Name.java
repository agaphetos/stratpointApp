package org.stratpoint.entity;

/*
 * Composite Field for Name to be used on Profile Entity
 * Contains first, middle, last elements
 */
public class Name {
	private String first;
	private String middle;
	private String last;
	
	/*
	 * Getter and Setters
	 */
	
	public String getFirst() {
		return first;
	}
	
	public void setFirst(String first) {
		this.first = first;
	}
	
	public String getMiddle() {
		return middle;
	}
	
	public void setMiddle(String middle) {
		this.middle = middle;
	}
	
	public String getLast() {
		return last;
	}
	
	public void setLast(String last) {
		this.last = last;
	}

	/*
	 * (non-Javadoc)
	 * Returns String format of all elements on this class
	 * 
	 * This method overrides toString() method with our custom String format for this class
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Name{" +
				"first='" + first + '\'' +
				", middle='" + middle + '\'' +
				", last='" + last + '\'' +
				'}';
	}
}
