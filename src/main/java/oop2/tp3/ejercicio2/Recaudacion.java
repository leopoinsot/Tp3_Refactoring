package oop2.tp3.ejercicio2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Recaudacion {
	private String filePath;
	public Recaudacion(String filePath){
		this.filePath = filePath;
	}
	public List<Map<String, String>> where(Map<String, String> options) throws IOException {
		OpenCSVReader openCSVReader = new OpenCSVReader(filePath);
		List<String[]> csvData = openCSVReader.readCSV();

		// Filtramos los datos según las opciones proporcionadas
		for (String key : options.keySet()) {
			String value = options.get(key);
			csvData.removeIf(csvDatum -> !csvDatum[getColumnIndex(key)].equals(value));
		}

		// Convertimos los datos filtrados a una lista de mapas
		List<Map<String, String>> output = new ArrayList<>();
		for (String[] csvDatum : csvData) {
			Map<String, String> mapped =
					IntStream.range(0, csvDatum.length).boxed().
					collect(Collectors.toMap(this::getColumnName, i -> csvDatum[i], (a, b) -> b));
			output.add(mapped);
		}
		return output;
	}

	private int getColumnIndex(String columnName) {
		switch (columnName) {
			case "company_name":
				return 1;
			case "city":
				return 4;
			case "state":
				return 5;
			case "round":
				return 9;
			default:
				return -1;
		}
	}

	private String getColumnName(int index) {
		switch (index) {
			case 0:
				return "permalink";
			case 1:
				return "company_name";
			case 2:
				return "number_employees";
			case 3:
				return "category";
			case 4:
				return "city";
			case 5:
				return "state";
			case 6:
				return "funded_date";
			case 7:
				return "raised_amount";
			case 8:
				return "raised_currency";
			case 9:
				return "round";
			default:
				return "";
		}
	}
}