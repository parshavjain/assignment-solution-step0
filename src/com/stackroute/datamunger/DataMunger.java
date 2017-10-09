package com.stackroute.datamunger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataMunger {

	// Regex for white spcae.
	private static final String WHITE_SPACE = "\\S+";

	public static void main(String[] args) throws IOException {

		/* read a sentence from the user */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string = br.readLine();

		/*
		 * call getWordCount() method which should return no. of words present in the
		 * string and display the same
		 */
		DataMunger dataMunger = new DataMunger();
		System.out.println(dataMunger.getWordCount(string));

	}

	/**
	 * Method to count number of words in a sentence.
	 *
	 * @param sentence
	 *
	 * @return wordCount
	 */
	public int getWordCount(String string) {
		// Checking whether sentence is null or empty.
		if (null == string || string.trim().isEmpty())
			return 0;

		// Splitting sentence based on white spaces.
		return string.split(WHITE_SPACE).length;
	}

}
