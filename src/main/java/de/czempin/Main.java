package de.czempin;

import java.util.ResourceBundle;

public class Main {
	public static void main(String[] args) {
		ResourceBundle resource = ResourceBundle.getBundle("test");

		String version = resource.getString("version");

		System.out.println("Version: " + version);
	}
}
