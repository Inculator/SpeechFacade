package com.mg.speech.controller;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.mg.speech.utils.AbstractSpeechCommand;

public class OpenFileController extends AbstractSpeechCommand {

	public OpenFileController(String command) {
		super(command);
	}

	public void openFile() {
		String[] commands = super.getCommands();
		if (commands.length == 3 && "t".equalsIgnoreCase(commands[1]) && "tool".equalsIgnoreCase(commands[2])) {

			if (Desktop.isDesktopSupported()) {
				Desktop desktop = Desktop.getDesktop();
				try {
					desktop.open(new File("M:\\Shimla Trip\\IMG_20180118_161929447.jpg"));
				} catch (IOException e) {
				}
			} else {

			}
		}
	}
}
