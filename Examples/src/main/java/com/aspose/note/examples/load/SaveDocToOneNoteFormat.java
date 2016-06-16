package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.examples.Utils;
import java.io.IOException;
import java.nio.file.Path;

public class SaveDocToOneNoteFormat {

	public static void main(String... args) throws IOException {

		String inputFile = "Sample1.one";
		Path inputPath = Utils.getPath(SaveDocToOneNoteFormat.class, inputFile);
		String outputFile = "SaveDocToOneNoteFormat.one";
		Path outputPath = Utils.getPath(SaveDocToOneNoteFormat.class, outputFile);

		Document doc = new Document(inputPath.toString());

		doc.save(outputPath.toString());
	}
}
