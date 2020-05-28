package com.tobias.saul.prompter;

import java.util.Scanner;

import com.tobias.saul.processor.OptionProcessor;

public class OptionPrompter {

	private final Scanner in;
	private final OptionProcessor optionProcessor;

	public OptionPrompter() {
		in = new Scanner(System.in);
		optionProcessor = new OptionProcessor();
	}

	public int prompUser() {
		int option = 0;

		System.out.println("Please choose from option above");
		option = in.nextInt();
		System.out.println();
		return optionProcessor.inputOptionProcess(option);

	}

}
