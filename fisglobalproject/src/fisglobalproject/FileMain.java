package fisglobalproject;


public class FileMain {

	public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("FileMain", "chetanshimpi");
		
		HandleOptions.handleWelcomeScreenInput();
	}

	
}