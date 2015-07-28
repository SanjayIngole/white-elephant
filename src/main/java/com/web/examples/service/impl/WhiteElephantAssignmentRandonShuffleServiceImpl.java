package com.web.examples.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.RandomAccess;
import java.util.logging.Logger;

import com.web.examples.service.WhiteElephantAssignmentService;

/**
 * Iterate backwards and shuffle the highest element with any random lower elements.
 * 
 * @author singole
 *
 */
public class WhiteElephantAssignmentRandonShuffleServiceImpl implements
		WhiteElephantAssignmentService {

	private static Logger logger = Logger
			.getLogger(WhiteElephantAssignmentRandonShuffleServiceImpl.class
					.getName());

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
		
		String[] assignments = Arrays.copyOf(participants, participants.length);
		
		shuffle(assignments);

		return assignments;
	}

	/**
	 * Method to iterate form the end of the array and keep on shuffling the element with random element in the array.
	 * 
	 * @param assignments
	 */
	private void shuffle(String[] assignments) {
		int size = assignments.length;
		Random random = new Random();
		
		// Iterate backwards and shuffle the highest element with any random lower elements.
		for (int i = size; i > 1; i--) {
			int randNum = random.nextInt(i);
			if(!swapElements(assignments, i - 1, randNum)){
				// If values to be swapped are same then try again until a different value is used for swapping.
				i++;
			}
		}
	}

	/**
	 * Swap the current pivot element with a random element.
	 * @param assignments
	 * @param pivot
	 * @param random
	 * @return true if swapped, false if values are same.
	 */
	private boolean swapElements(String[] assignments, int pivot, int random) {
		if(assignments[pivot] != null && assignments[random] !=null
				&& !assignments[pivot].equals(assignments[random])) {
			String temp = assignments[pivot];
			assignments[pivot] = assignments[random];
			assignments[random] = temp;
			return true;			
		} else {
			return false;
		}
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
				logger.info("Participant " +  participants[i] + " Assigned to : " + assignments[i]);
			}
		}
	}
}
