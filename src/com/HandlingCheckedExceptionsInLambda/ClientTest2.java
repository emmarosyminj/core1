package com.HandlingCheckedExceptionsInLambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ClientTest2 {

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(3, 9, 7, 0, 10, 20);
		integers.forEach(throwConsumerWrapper(i-> WriteToFile(i)));

	}

	private static Object WriteToFile(Integer i) {
		return null;
	}

	private static <T> Consumer<T> throwConsumerWrapper(ThrowingConsumer<T,Exception> throwingConsumer ) {
		
		return i ->{
			try {
				throwingConsumer.accept(i);
			}
			catch(Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

}
