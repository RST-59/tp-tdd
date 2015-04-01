package iut.tdd;

import java.util.ArrayList;
import java.util.List;

public class Convert 
{
	public String num2text(String input) 
	{
		String areturn="";
		int input_num= Integer.parseInt(input);
		if(chifre_unique(input_num))
		{
			areturn += this.convert_unique(input);
		}
		else if(input_num>=10)
		{
			String inpute_disaine = input.substring(input.length()-2,input.length()-1);
			areturn += disaines(inpute_disaine);
			
			String inpute_unite = input.substring(input.length()-1,input.length());
			areturn += unite(inpute_unite);
		}
		
		return areturn;
	}
	
	private String unite(String input) 
	{
		String areturn ="";
		switch (input) 
		{
		case "1":
			areturn = "et un";
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
		}
		
		return areturn;
	}

	public String disaines(String input)
	{
		String areturn ="";
		switch (input) 
		{
		case "1":
			areturn = "dix";
			break;
		case "2":
			areturn = "vingt";
			break;
		case "3":
			areturn = "trent";
			break;
		case "4":
			areturn = "quarente";
			break;
		case "5":
			areturn = "cinquante";
			break;
		case "6":
			areturn = "soixante";
			break;
		case "7":
			areturn = "soixante dix";
			break;
		case "8":
			areturn = "quatre vingt";
			break;
		case "9":
			areturn = "quatre vingt dix";
			break;
		}
		
		return areturn+" ";
	}
	
	public String convert_unique(String input) 
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
		
		case "11":
			areturn = "onze";
			break;
		case "12":
			areturn = "douze";
			break;
		case "13":
			areturn = "treize";
			break;
		case "14":
			areturn = "quatorze";
			break;
		case "15":
			areturn = "quinze";
			break;
		case "16":
			areturn = "seize";
			break;
			
		default:
			areturn ="";
			break;
		}
		return areturn+" ";
	}

	private boolean chifre_unique(int input_num) 
	{
		List<Integer> l =new ArrayList<Integer>();
		l.add(0);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(15);
		l.add(16);
		return l.contains(input_num);
	}
}
