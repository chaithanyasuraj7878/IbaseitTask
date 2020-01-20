package com.ibaseit.exception;

import java.io.IOException;

public class UsingThrowsAndThrow {
	void myMethod(int num) throws IOException, ClassNotFoundException {
		if (num == 1)
			throw new IOException("IOException Occurred");
		else
			throw new ClassNotFoundException("exception handled");
	}

	public static void main(String args[]) {
		try {
			UsingThrowsAndThrow obj = new UsingThrowsAndThrow();
			obj.myMethod(78);
		} catch (Exception ex) {
			System.out.println(ex);

		}
	}
}
