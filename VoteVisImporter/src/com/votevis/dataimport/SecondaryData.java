/**
 * @author Christian Tresch
 * @version 1.0
 * @created 08-Nov-2013
 */
package com.votevis.dataimport;
import java.util.HashMap;
import java.util.Map;


public class SecondaryData {

	private Map<String,String> paroles;

	
	public SecondaryData(){
		this.paroles = new HashMap<String,String>();
	}
	
	public Map<String, String> getParoles() {
		return paroles;
	}

	public void setParoles(Map<String, String> paroles) {
		this.paroles = paroles;
	}


}