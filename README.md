# Process


# Java - Work with processes


The ProcessBuilder.start() and Runtime.exec methods create a native process and return an instance of a subclass of Process that can be used to control the process and obtain information about it. The class Process provides methods for performing input from the process, performing output to the process, waiting for the process to complete, checking the exit status of the process, and destroying (killing) the process. 
More information can be found at [https://docs.oracle.com/](https://docs.oracle.com/javase/7/docs/api/java/lang/Process.html).


## Main class.


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
				e.printStackTrace();
			}
			process.destroy();
			System.out.println("Process killed.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}


Produced by [Wiki Dreams.github.io](https://WikiDreams.github.io/).