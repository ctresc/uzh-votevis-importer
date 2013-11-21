/**
 * @author Christian Tresch
 * @version 1.0
 * @created 08-Nov-2013
 */
package com.votevis.dataimport;
import java.util.ArrayList;
import java.util.List;


public class Vote{
	
	private String id;
	private int date;
	private String subject;
	private String electionOutcome;


	private List<Canton> cantons;
	
	private int eligibleVoters;
	private int votesCasted;
	private float participation;
	private int yesVotes;
	private int noVotes;
	private float yesPercent;
	private float noPercent;
	

	public Vote(){
		this.cantons = new ArrayList<Canton>();
	}
	
	public Vote(String id, int date, String subject, String electionOutcome, ArrayList<Canton> cantons, 
			int eligibleVoters, int votesCasted, float participation,
			int yesVotes, int noVotes, float yesPercent, float noPercent) {
		this.id = id;
		this.date = date;
		this.subject = subject;
		this.electionOutcome = electionOutcome;
		this.cantons = cantons;
		this.eligibleVoters = eligibleVoters;
		this.votesCasted = votesCasted;
		this.participation = participation;
		this.yesVotes = yesVotes;
		this.noVotes = noVotes;
		this.yesPercent = yesPercent;
		this.noPercent = noPercent;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public List<Canton> getCantons() {
		return cantons;
	}

	public void setCantons(List<Canton> cantons) {
		this.cantons = cantons;
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
	
	public String getElectionOutcome() {
		return electionOutcome;
	}

	
	public void setElectionOutcome(String electionOutcome) {
		this.electionOutcome = electionOutcome;
	}

}


