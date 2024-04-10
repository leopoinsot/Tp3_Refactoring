package oop2.tp3.ejercicio2;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVReader;

public class OpenCSVReader {
	private String filePath;
	public OpenCSVReader(String filePath){this.filePath = filePath;}
	public List<String[]> readCSV() throws IOException {
		List<String[]> csvData = new ArrayList<String[]>();
		CSVReader reader = new CSVReader(new FileReader(filePath));
		String[] row = null;

		while ((row = reader.readNext()) != null) {
			csvData.add(row);
		}
		reader.close();
		csvData.remove(0);
		return csvData;
	}
}