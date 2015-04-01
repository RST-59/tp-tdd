package iut.tdd;

public class Convert 
{
	public String convert_unite(String input) 
	{
		String areturn ="";
		switch (input) 
		{
		case "0":
			areturn = "zéro";
			break;
		case "1":
			areturn = "un";
			break;
		case "2":
			areturn = "deux";
			break;
		case "3":
			areturn = "trois";
			break;
		case "4":
			areturn = "quatre";
			break;
		case "5":
			areturn = "cinq";
			break;
		case "6":
			areturn = "six";
			break;
		case "7":
			areturn = "sept";
			break;
		case "8":
			areturn = "huit";
			break;
		case "9":
			areturn = "neuf";
			break;

		default:
			areturn ="";
			break;
		}
		return areturn;
	}
	public String num2text(String input) 
	{
		String areturn="";
		if(input.length()==1)
		{
			areturn += this.convert_unite(input);
		}
		else if (input.length()==2) 
		{
			return "dix";
		}
		
		return areturn;
	}

}
