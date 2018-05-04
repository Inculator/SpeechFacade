package com.mg.speechFacade;

import com.mg.speech.controller.BrowserController;
import com.mg.speech.controller.CommandInterface;

public class SpeechFacade {

	public void controllerForSpeechCommand(String command){
		if("browser".equalsIgnoreCase(command)){
			CommandInterface controller = r -> new BrowserController().openBrowser();
			controller.executeCommand(command);
		}
	}
}
