/**
 * @author Christian Tresch
 * @version 1.0
 * @created 08-Nov-2013
 */
package com.votevis.dataimport;
import java.util.ArrayList;
import java.util.List;

public class VoteBase {

	private List<Vote> votes;
	private List<GeoData> locations;
	private List<SecondaryData> secData;
	
	public VoteBase() {
		this.votes = new ArrayList<Vote>();
		this.locations = new ArrayList<GeoData>();
		GeoData geodata = new GeoData();
		this.locations.add(geodata);
		this.secData = new ArrayList<SecondaryData>();
	}
	
	public List<Vote> getVotes() {
		return votes;
	}
	public void setVotes(List<Vote> votes) {
		this.votes = votes;
	}
	public List<GeoData> getLocations() {
		return locations;
	}
	public void setLocations(List<GeoData> locations) {
		this.locations = locations;
	}
	public List<SecondaryData> getSecData() {
		return secData;
	}
	public void setSecData(List<SecondaryData> secData) {
		this.secData = secData;
	}
	
}
