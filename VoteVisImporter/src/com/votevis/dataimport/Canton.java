/**
 * @author Christian Tresch
 * @version 1.0
 * @created 08-Nov-2013
 */
package com.votevis.dataimport;
public class Canton {

	private String name;

	private int eligibleVoters;
	private int votesCasted;
	private float participation;
	private int yesVotes;
	private int noVotes;
	private float yesPercent;
	private float noPercent;
	
	public Canton(){}
	
	public Canton(String name, int eligibleVoters, int votesCasted,
			float participation, int yesVotes, int noVotes, float yesPercent,
			float noPercent) {
		this.name = name;
		this.eligibleVoters = eligibleVoters;
		this.votesCasted = votesCasted;
		this.participation = participation;
		this.yesVotes = yesVotes;
		this.noVotes = noVotes;
		this.yesPercent = yesPercent;
		this.noPercent = noPercent;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEligibleVoters() {
		return eligibleVoters;
	}

	public void setEligibleVoters(int eligibleVoters) {
		this.eligibleVoters = eligibleVoters;
	}

	public int getVotesCasted() {
		return votesCasted;
	}

	public void setVotesCasted(int votesCasted) {
		this.votesCasted = votesCasted;
	}

	public float getParticipation() {
		return participation;
	}

	public void setParticipation(float participation) {
		this.participation = participation;
	}

	public int getYesVotes() {
		return yesVotes;
	}

	public void setYesVotes(int yesVotes) {
		this.yesVotes = yesVotes;
	}

	public int getNoVotes() {
		return noVotes;
	}

	public void setNoVotes(int noVotes) {
		this.noVotes = noVotes;
	}

	public float getYesPercent() {
		return yesPercent;
	}

	public void setYesPercent(float yesPercent) {
		this.yesPercent = yesPercent;
	}

	public float getNoPercent() {
		return noPercent;
	}

	public void setNoPercent(float noPercent) {
		this.noPercent = noPercent;
	}

}
