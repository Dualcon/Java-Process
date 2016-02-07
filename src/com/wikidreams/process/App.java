package com.wikidreams.process;

import java.io.IOException;

public class App {

	public static void main(String[] args) {

		try {
			Process process = Runtime.getRuntime().exec("notepad");
			System.out.println("Creating new process.");
			try {
				Thread.sleep(5000);
				System.out.println("Waiting 5 seconds.");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			process.destroy();
			System.out.println("Process killed.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
