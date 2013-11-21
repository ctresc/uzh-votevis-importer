package com.votevis.dataimport;

import java.io.IOException;
import java.net.MalformedURLException;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;


public class Controller {
	
	public static void main(String[] args)
			throws FailingHttpStatusCodeException, MalformedURLException,
			IOException {
		VoteBase voteBase = new VoteBase();
		VoteScraper scraper = new VoteScraper();
		scraper.scrapeVotes(voteBase);
		System.out.println("Votescraper has terminated.");
		
		GeoDataImporter geoDataImporter = new GeoDataImporter();
		geoDataImporter.read(voteBase, "C:/VoteBase/Kantonsgrenzen.xls");
		System.out.println("GeoDataImporter has terminated.");
		
		ExcelWriter excelWriter = new ExcelWriter();
		excelWriter.writeOut(voteBase, "C:/VoteBase/votebase.xls");
		System.out.println("Excelwriter has terminated.");
		
		System.out.println("DataImport done.");
	}

}
