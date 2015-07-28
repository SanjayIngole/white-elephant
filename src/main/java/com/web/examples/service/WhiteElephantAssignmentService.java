package com.web.examples.service;

/**
 * Interface to be implemented by services to generate White Elephant Assignments for Participants.
 * 
 * @author singole
 *
 */
public interface WhiteElephantAssignmentService {
	
	/**
	* @param participants list of individuals participating in the draw.
	* @return the list of individuals paired with the participants where participants[0] is matched
	* with assignments[0], participants[1] is matched with assignments[1], and so on.
	*/
	public String[] generateAssignments(final String[] participants);
	
	/**
	 * Method to print the Assigned Participants to respective individual.
	 * 
	 * @param participants
	 * @param assignments
	 */
	public void printAssignments(String[] participants, String[] assignments);

}
