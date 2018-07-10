package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterProgram {

	public static void main(String[] args) {

		String[] lines = new String[] { "good morning", "Good tarde", "good noite" };

		String path = "C:\\CursoJAVA\\writer.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {//para criar um novo file, remover o true
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
