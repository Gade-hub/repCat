package com.jcg.csv2excel;

import org.apache.log4j.Logger;

public class AppMain {

	private static Logger logger = Logger.getLogger(AppMain.class);

	public static void main(String[] args) {
		String xlsLoc = "config/", csvLoc = "config/Incoming.csv", fileLoc = "";

		fileLoc = CsvToExcel.convertCsvToXls(xlsLoc, csvLoc);
		logger.info("File Location Is?= " + fileLoc);
		int i=0;
		int[] tab= {1,2,3};
		System.out.println("tab[i]"+i +" "+tab[++i]);
	}
}