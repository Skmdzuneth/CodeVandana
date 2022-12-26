import java.util.Scanner;

public class Sentence_letter {
	public static void main(String[] args) {
		Scanner InputData = new Scanner(System.in);
		
		System.out.println("Enter a Sentence(Any English Sentence):");
		String sentence = InputData.nextLine();
		
		System.out.println("Enter a Letter(Any Letter from A to Z):");
		String letter = InputData.nextLine();
		
		int index = sentence.indexOf(letter);
		
		if(index == -1) {
			System.out.println("The letter does not exist in the Sentence.");
		}else {
			System.out.println(sentence.substring(index+1));
		}
	}

}
