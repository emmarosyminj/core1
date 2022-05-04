package com.Closures;

public class Test {

	public static void main(String[] args) {
		// closures

		int x = 30;
		int y = 40; //Compiler assumes final int y =40;  in Java 1.7 if we declare final it works. java 8 gives an error will treat as final
		
		//Approach 1

/*		doOperate(x, new Operation() { // Annonymous Inner Type

			@Override
			public void operate(int n) {
				//y=300; // change value of y Err: Local variable y defined in an enclosing scope must be final or effectively final
				System.out.println(n + y);

			}
		});

	}
	
*/
		//Approach 2
		doOperate(x, (int n) ->  System.out.println(n + y)); //value of y cannot be changed

	}

	private static void doOperate(int i, Operation o) {
		o.operate(i);
	}
}
