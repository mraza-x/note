import java.util.*;
import java.lang.Math;

/**
  Mohammed Raza
  CSC 236 - Lab2 #2 (class1)
*/

public class Note
{

	double length = 0.0;
	int value = 0;

	String notelet;
	String color;

	double freq1;
	double freq2;


	public Note (double len, int val)
	{
		length = len;
		value = val;
	}

	public void setLength(double len)
	{
		length = len;
	}

	public void setValue(int val)
	{
		value = val;
	}

	public double getLength()
	{
		return length;
	}

	public int getValue()
	{
		return value;
	}

	public String noteLetter(double length, int value)
	{
		if(value == 2)
			notelet = "B";
		if(value == 1)
			notelet = "A sharp";
		if(value == 0)
			notelet = "A";
		if(value == -1)
			notelet = "G sharp";
		if(value == -2)
			notelet = "G";
		if(value == -3)
			notelet = "F sharp";
		if(value == -4)
			notelet = "F";
		if(value == -5)
			notelet = "E";
		if(value == -6)
			notelet = "D sharp";
		if(value == -7)
			notelet = "D";
		if(value == -8)
			notelet = "C sharp";
		if(value == -9)
			notelet = "C";

		return notelet;

	}

	public String noteColor()
	{
		if (notelet.length() > 1)
			color = "Sharp (Black key)";
		else
			color = "Natural (White key)";

		return color;
	}

	public double calcFreq(int value)
	{
		freq1 = (double)value/12;
		freq2 = 440.0 * Math.pow(2,freq1);
		return freq2;
	}



}



