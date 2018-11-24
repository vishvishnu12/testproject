package com.cap.Demo;

public class One implements Cloneable {
	protected int a = 2;
	public int b = 5;

	public Object getClonedObject(One o) throws CloneNotSupportedException {
		return o.clone();
	}

	public static void main(String[] args) {
		One o = new One();
		try {
			One o1 = (One) o.getClonedObject(o);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
