package com.assignments_2;

import java.io.*;

public class Question67 {

	public static void main(String[] args) {
		try {
			FileInputStream is = new FileInputStream("D://setup//Assign1.txt");
			ObjectInputStream ois = new ObjectInputStream(is);
			Question67 emp = (Question67) ois.readObject();
			ois.close();
			is.close();
			System.out.println(emp.toString());
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}
