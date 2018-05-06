package com.mg.speech.controller;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import com.mg.speech.utils.AbstractSpeechCommand;

public class BrowserController extends AbstractSpeechCommand {

	public BrowserController(String command) {
		super(command);
	}

	public void openBrowser() {
		String url = "http://www.google.com";
		String[] commands = super.getCommands();

		if (commands.length >= 3) {
			if (commands[1].contains("g") && commands[2].contains("mail"))
				url = "http://www.gmail.com";
		}

		if (Desktop.isDesktopSupported()) {
			Desktop desktop = Desktop.getDesktop();
			try {
				desktop.browse(new URI(url));
			} catch (IOException | URISyntaxException e) {
			}
		} else {

		}
	}
}
