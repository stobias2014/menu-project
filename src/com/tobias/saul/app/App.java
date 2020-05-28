package com.tobias.saul.app;

import com.tobias.saul.prompter.OptionPrompter;
import com.tobias.saul.view.MenuView;

public class App {
	
	MenuView menuView;
	OptionPrompter optionPrompter;
	
	public static void main(String[] args) {
		
		App app = new App();
		app.run();
		
	}
	
	public void run() {
		
		boolean keepRunning = true;
		menuView = new MenuView();
		optionPrompter =  new OptionPrompter();
		
		while(keepRunning) {
			menuView.menuDisplay();
			int option = optionPrompter.prompUser();
			
			if(option == 4) {
				keepRunning = false;
			}
			
		}
	}

}
