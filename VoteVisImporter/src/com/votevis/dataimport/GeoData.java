/**
 * @author Christian Tresch
 * @version 1.0
 * @created 08-Nov-2013
 */
package com.votevis.dataimport;
import java.util.HashMap;
import java.util.Map;

public class GeoData {
	
	private Map<String,String> geometry; // Key: Canton name, Value: geometry column
	private Map<String, Integer> geometryvertexcount; // Key: Canton name, Value: geometry vertex count
	
	public GeoData(){
		this.geometry = new HashMap<String,String>();
		this.geometryvertexcount = new HashMap<String, Integer>();
	}
	
	public Map<String, String> getGeometry() {
		return geometry;
	}

	public void setGeometry(Map<String, String> geometry) {
		this.geometry = geometry;
	}

	public Map<String, Integer> getGeometryvertexcount() {
		return geometryvertexcount;
	}

	public void setGeometryvertexcount(Map<String, Integer> geometryvertexcount) {
		this.geometryvertexcount = geometryvertexcount;
	}


}
