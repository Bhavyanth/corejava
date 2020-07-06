package com.basics.exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TryWithResources {
 public void writeData(Path path1, Path path2) throws IOException {
	try (BufferedReader in = Files.newBufferedReader(path1); // passing as an argument
			BufferedWriter out = Files.newBufferedWriter(path2);){
		out.write(in.readLine());
	} // when it comes out of try block, automatically reader and writer gets closed 
	// Hence the need of finally block can be eliminated in this case (From Java 7)
	}
}
