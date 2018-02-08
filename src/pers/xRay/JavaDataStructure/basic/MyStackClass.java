package pers.xRay.JavaDataStructure.basic;

import pers.xRay.JavaDataStructure.basic.MyArrayClass.*;

public class MyStackClass extends MyArray {	
	public MyNode pop() {
		MyNode node = get(getSize());
		remove(getSize());
		return node;
	}
	
	public int push(MyNode node) {
		insert(getSize(), node);
		return getSize();
	}
}
