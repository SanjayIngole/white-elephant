/**
 * 
 */
package com.web.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Logger;

import com.web.examples.service.WhiteElephantAssignmentService;
import com.web.examples.service.impl.WhiteElephantAssignmentRandonShuffleServiceImpl;
import com.web.examples.service.impl.WhiteElephantAssignmentServiceImpl;

/**
 * @author singole
 *
 */
public class WhiteElephantMain {

	private static Logger logger = Logger.getLogger(WhiteElephantMain.class
			.getName());

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		logger.info("## Main Start");
		
		/**
		 * List of participants.
		 */
		final String[] participants = new String[] { "Kyle", "Kenny", "Eric",
				"Stan", "Stewie", "Brian" };

		/**
		 * First Implementation.
		 */
		WhiteElephantAssignmentService whiteElephantAssignmentService = new WhiteElephantAssignmentServiceImpl();
		
		// Assign Individuals to participants.
		final String[] assignments = 
				whiteElephantAssignmentService.generateAssignments(participants);
		
		logger.info(" Output of first Implementation :");
		// Print the Assigned List.
		whiteElephantAssignmentService.printAssignments(participants, assignments);
		
		/**
		 * Second Implementation
		 */
		WhiteElephantAssignmentService whiteElephantAssignmentRandomShuffleService = new WhiteElephantAssignmentRandonShuffleServiceImpl();

		// Assign Individuals to participants.
		final String[] randomSuffledAssignments = 
				whiteElephantAssignmentRandomShuffleService.generateAssignments(participants);
		
		logger.info(" Output of Second Implementation (Random Shuffle):");
		// Print the Assigned List.
		whiteElephantAssignmentRandomShuffleService.printAssignments(participants, randomSuffledAssignments);	
		
		logger.info("## Main End");
	}
}
