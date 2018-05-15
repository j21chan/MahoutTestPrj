package com.dcnl.mahoutTest.csv;

import java.io.BufferedReader;
import java.io.FileReader;

public class CsvConverter {
	private String result;

	public String readCsv(String filepath) {
		BufferedReader br = null;
		String line = null;
		String path = "C:/Users/jc/eclipse-workspace/MahoutTestPrj/data/movie.csv";
		result = null;
		try {
//			br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
			br = new BufferedReader(new FileReader(path)); // 이렇게도 가능
			
			while((line = br.readLine()) != null) {
				String[] temp = line.split("\t"); // 탭으로 구분
//				String[] temp = line.split(","); // 쉼표로 구분
				
				for(int i=0; i<temp.length; i++) {
					result += temp[i];
//					System.out.print((i+1)+"열: "+temp[i]);

					if(i!=temp.length-1) {
//						System.out.print(",");
						result += ",";
					}
					else {
						System.out.println();
						result += "\n";
						System.out.println(result);
					}
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
