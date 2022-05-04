package com.HandlingCheckedExceptionsInLambda;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ClientTest1 {

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(3, 9, 7, 0, 10, 20);
		integers.forEach(i->{try {
			WriteToFile(i);
		} catch (IOException e) {
			throw  new RuntimeException(e);
			
		}});

		
	}

	private static Object WriteToFile(Integer i) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
