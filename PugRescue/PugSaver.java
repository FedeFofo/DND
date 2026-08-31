import java.util.ArrayList;
import java.util.Objects;

public class PugSaver {

	// Moves every dog whose breed is "Pug" in the list to the back of the list
	public static void rescuePugs(ArrayList<Dog> list) {

		System.out.println("\t // BEFORE METHOD RAN:\n");
		for (Dog dog : list) {
			System.out.println(dog.toString() + "\n");
		}

		ArrayList<Dog> pugs = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBreed().equals("Pug")) {
				pugs.add(list.get(i));
				list.remove(i);
				i--;
			}
		}

		for (Dog pug : pugs) {
			list.add(pug);
		}

		// old idea (doesn't work):

		// int count = 0;

		// for (Dog dog : list) {
		// if (list.indexOf(dog) >= (list.size() - count)) {
		// break;
		// }

		// if (dog.getBreed().equals("Pug")) {
		// Dog temp = dog;
		// int pug = list.indexOf(dog);
		// count++;

		// for (int i = list.size() - 1; i > pug; i--) {
		// if (!(list.get(i).getBreed().equals("Pug"))) {
		// list.set(pug, list.get(i));
		// list.set(i, temp);
		// }
		// }
		// }
		// }

		System.out.println("\t // AFTER METHOD RAN:\n");
		for (Dog dog : list) {
			System.out.println(dog.toString() + "\n");
		}
	}
}
