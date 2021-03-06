Background

White Elephant is a way for a group of friends, family members, or co-workers to exchange gifts.
All of the participants' names are placed into a container (hat, box, bag, etc) and mixed up. Each person then chooses one name from the container, but doesn't tell anyone which name was picked. He/she is now responsible for buying a gift for the person selected.

As the "White Elephant", he/she wraps the gift and labels it with the recipientís name but doesn't indicate whom the present is from (part of the fun is in the secrecy).

All the gifts are then placed in a general area for opening at a designated time. When the time comes to give gifts, the recipient finds their gift and must guess who their White Elephant is. If they can't guess, their White Elephant eventually confesses.

Summary

The method generateAssignments(...) below is to be used in a White Elephant draw. You are given the task of implementing the method.

/**
* @param participants list of individuals participating in the draw.
* @return the list of individuals paired with the participants where participants[0] is matched
* with assignments[0], participants[1] is matched with assignments[1], and so on.
*/
public String[] generateAssignments(final String[] participants) {
 // Your code here.
}

Implement the Method

Here are some basic rules:
1. A person must be assigned to another person; no person must be assigned to himself/herself.
2. All participants must have an assigned person from the passed list of participants.
3. Shifting the names left or right or reversing the names are not acceptable solutions.
4. Here's an example of how the method would be used:

final String[] participants = new String[] { "Kyle", "Kenny", "Eric", "Stan", "Stewie", "Brian" };
final String[] assignments = generateAssignments(participants);
// Sample result: { "Eric", "Stewie", "Brian", "Kenny", "Kyle", "Stan" }

Additional Instructions
1. The code must be compilable and produce the correct output.
2. Unit tests are required.
3. Include any build scripts, dependency management configuration files, etc.
4. Package everything as a complete project. Compress the package into one file then send it back to the GoHealth Technical Recruiter.
5. Implement at least 2 algorithms/implementations. Use your judgment on how to design it.
