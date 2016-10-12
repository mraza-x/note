import java.util.*;
import java.lang.Math;

/**
  Mohammed Raza
  CSC 236 - Lab2 #2 (main)
*/

public class NoteDemo
{

	public static void main(String[] args)
	{

		double length;
		int value;

		Scanner keyboard = new Scanner(System.in);

		System.out.println(":::Music Note Information:::");

		System.out.print("\nEnter the note's value (-9 to 2):");
		value = keyboard.nextInt();

		System.out.print("\nEnter the note's length: (.0625 = 1/16 note), (.125 = 1/8 note), \n\t\t\t (.25 = 1/4 note), (.5 = 1/2 note), \n\t\t\t (1 = whole note): ");
		length = keyboard.nextDouble();

		Note note = new Note(length, value);

		System.out.println("\nLength: " + note.getLength());
		System.out.println("\nValue: " + note.getValue());

		System.out.println("\nNote Letter: " + note.noteLetter(length,value));
		System.out.println("\nNote type: " + note.noteColor());
		System.out.println("\nFrequency: " + note.calcFreq(value) + " Hertz");

	}
}

