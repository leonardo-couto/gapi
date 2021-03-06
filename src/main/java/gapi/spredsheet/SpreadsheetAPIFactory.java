package gapi.spredsheet;

import gapi.SpreadsheetAPI;

import com.google.gdata.client.spreadsheet.SpreadsheetService;

public final class SpreadsheetAPIFactory {

	private SpreadsheetAPIFactory() {
		throw new RuntimeException("Should not be instanciated");
	}

	public static SpreadsheetAPI create(SpreadsheetService spreadsheetService) {
		return new SpreadsheetAPIImpl(spreadsheetService);
	}
}
