package com.mg.speech.utils;

public class AbstractSpeechCommand {

	private String command;

	public AbstractSpeechCommand(String command) {
		this.command = command;
	}

	public String getCommand() {
		return command;
	}

	public String[] getCommands() {
		return command.split(" ");
	}

}
