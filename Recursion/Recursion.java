public class Recursion {

	// Prints the value of every node in the singly linked list with the given head,
	// but in reverse
	public static void printListInReverse(ListNode head) {

	}

	// For the given 2D array of Strings, replaces the String at index[r][c]
	// with "infected" unless the String is "vaccinated";
	// also, any Strings they are orthogonally adjacent to
	// that are not "vaccinated" will also be infected, and any adjacent to
	// them as well etc.
	// Infecting someone who is already infected has no effect
	// Trying to infect outside the confines of the grid also has no effect
	// Precondition: grid has no null entries
	public static void infect(String[][] grid, int r, int c) {

	}

	// Subset: a smaller group or collection whose items or elements
	//		are all completely contained within a larger set.
	//
	// How many subsets are there of the numbers 1...n that contain NO consecutive integers?
	// e.g. for n = 4, the subsets are {}, {1}, {2}, {3}, {4}, {1, 3}, {1, 4}, {2, 4}
	// So 8 non-consecutive subsets!
	//
	// Subsets of 1,2,3,4 that DO contain consecutive integers are
	// {1,2}, {2,3}, {3,4}, {1,2,3}, {1,2,4}, {1,3,4}, {1,2,3,4}
	// Precondition: n > 0
	public static long countNonConsecutiveSubsets(int n) {

	}

	// A kid at the bottom of the stairs can jump up 1, 2, or 3 stairs at a time.
	// How many different ways can they jump up n stairs?
	// Jumping 1-1-2 is considered different than jumping 1-2-1
	// Precondition: n > 0
	public static long countWaysToJumpUpStairs(int n) {

	}

	// --------------------------------------------------------------------
	// NOTE:
	// Everything above the line does NOT require a recursive helper method
	// Everything below the line requires a recursive helper method
	// Any recursive helper method you write MUST have a comment describing:
	// 1) what the helper method does/returns
	// 2) include the role of each parameter in the helper method


	// Prints all the subsets of str on separate lines
	// For example, subsets("abc") would print out "", "a", "b", "c", "ab", "ac",
	// "bc", "abc"
	// Order is your choice
	// Precondition: String str has NO repeated characters
	public static void printSubsets(String str) {

	}

	// List contains a single String to start.
	// Prints all the permutations of str on separate lines
	// For example, permute("abc") could print out "abc", "acb", "bac", "bca",
	// "cab", "cba"
	// Order is your choice
	// Precondition: 	String str has no repeated characters
	public static void printPermutations(String str) {

	}

	// Performs a mergeSort on the given array of ints
	// Precondition: There are NO duplicates!!!
	public static void mergeSort(int[] ints) {

	}

	// Performs a quickSort on the given array of ints
	// Use the middle element (index n/2) as the pivot
	// Precondition: There are NO duplicates!!!
	public static void quickSort(int[] ints) {

	}

	// Prints a sequence of moves (one on each line) to complete a Towers of Hanoi problem:
	// The towers are number 0, 1, 2, and each move should be printed in the form "1 -> 2",
	// meaning "take the top disk of tower 1 and put it on tower 2" etc.
	// All disks must end on tower 2.
	// Precondition: All disks start on tower 0
	public static void solveHanoi(int startingDisks) {

	}

	// You are partaking in a scavenger hunt!
	// You've gotten a secret instrument to find many of the most valuable
	// items, but they only appear at VERY SPECIFIC TIMES.
	// You have two arrays
	// 		times[] - Lists at which MINUTE an item becomes available.
	// Precondition: Times is sorted in ascending order.
	//    points[] - Points you score in the ScavHunt for the associated item
	// Precondition: Same length as times[]
	//
	// Problem is: Once you use the device to get an item, no other item will
	// appear for 5 minutes.  So if there is an item, for example, available at
	// time 23 and another at time 27, it's just not possible for you to take both.
	// You'll have to choose!
	// Note: You can take an item at time 23 and another at time 28
	// Write a method that returns the maximum POINTS you can get.
	//
	// Example: if times = [3, 7, 9] and points = [10, 15, 10]
	// Then the best possible result is getting the item at time 3 and the one at
	// time 9 for a total of 20 points, so it would return 20.
	public static int scavHunt(int[] times, int[] points) {

	}

}
