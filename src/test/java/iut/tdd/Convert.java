package iut.tdd;

public class Convert 
{

	public String num2text(String input) 
	{
		switch (input) 
		{
		case "0":
			return "zéro";
		case "1":
			return "un";
		case "2":
			return "deux";
		case "3":
			return "trois";
		case "4":
			return "quatre";
		case "5":
			return "cinq";
		case "6":
			return "six";
		case "7":
			return "sept";
		case "8":
			return "huit";
		case "9":
			return "neuf";

		default:
			return null;
		}
	}

}
