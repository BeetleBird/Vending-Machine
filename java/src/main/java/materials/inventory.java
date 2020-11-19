package materials;

public class inventory {

	String fileName = "vendingmachine.csv";
	
	if (!fileName.exists()) {
		System.out.println("Invalid file.");
		System.exit(1);
		System.out.println("path: " + fileName.getAbsolutePath());
	
	}
	
	
	
}
}
