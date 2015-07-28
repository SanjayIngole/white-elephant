package com.web.examples.service.impl;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Logger;

import com.web.examples.service.WhiteElephantAssignmentService;

/**
 * @author singole
 *
 */
public class WhiteElephantAssignmentServiceImpl implements WhiteElephantAssignmentService {
	
	private static Logger logger = Logger.getLogger(WhiteElephantAssignmentServiceImpl.class.getName());

	/**
	 * Method to assign the participants with an Individual.
	 * 
	 * @param participants
	 * @return Array of Individuals/Assignments for a given list of
	 *         participants.
	 */
	public String[] generateAssignments(final String... participants) {

		if (participants == null || participants.length == 0) {
			logger.fine("No Participants to assign the individuals.");
			return null;
		}
		
		ArrayList<String> assignments = new ArrayList<String>();
		Random r = new Random();
		for (int i = 0; i < participants.length; i++) {
			Integer n = r.nextInt(participants.length);
			while ((n == i) || (assignments.contains(n.toString()))) {
				n = r.nextInt(participants.length);
			}
			assignments.add(n.toString());
		}
		return assignments.toArray(new String[assignments.size()]);
	}

	/**
	 * Method to print the Assigned Participants to respective individual.
	 * 
	 * @param participants
	 * @param assignments
	 */
	public void printAssignments(String[] participants, String[] assignments) {
		if (assignments == null || assignments.length == 0) {
			logger.fine("No Assignment could be retrived.");
		} else {
			for(int i=0; i< assignments.length; i++){
				logger.info("Participant " +  participants[i] + " Assigned to : " + participants[Integer.parseInt(assignments[i])]);
			}
		}
	}
}
