package com.mg.speechFacade;

import com.mg.speech.controller.BrowserController;
import com.mg.speech.controller.CommandInterface;
import com.mg.speech.controller.OpenFileController;

public class SpeechFacade {

	private CommandInterface controller;

	public void controllerForSpeechCommand(String command) {

		if (command.contains("browse"))
			controller = r -> new BrowserController(command).openBrowser();

		if (command.contains("launch"))
			controller = r -> new OpenFileController(command).openFile();

		if (controller != null)
			controller.executeCommand(command);
	}
}
