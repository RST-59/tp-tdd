package iut.tdd;

import junit.framework.Assert;
import org.junit.Test;

public class TestConvert 
{
	@Test
	public void test_num2text_0() 
	{
		// Given
		String input = "0";
		String expected = "zéro";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test_num2text_1() 
	{
		// Given
		String input = "1";
		String expected = "un";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test_num2text_2() 
	{
		// Given
		String input = "2";
		String expected = "deux";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test_num2text_3() 
	{
		// Given
		String input = "3";
		String expected = "trois";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test_num2text_4() 
	{
		// Given
		String input = "4";
		String expected = "quatre";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test_num2text_5() 
	{
		// Given
		String input = "5";
		String expected = "cinq";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test_num2text_6() 
	{
		// Given
		String input = "6";
		String expected = "six";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test_num2text_7() 
	{
		// Given
		String input = "7";
		String expected = "sept";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test_num2text_8() 
	{
		// Given
		String input = "8";
		String expected = "huit";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test_num2text_9() 
	{
		// Given
		String input = "9";
		String expected = "neuf";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test_num2text_10() 
	{
		// Given
		String input = "10";
		String expected = "dix";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test_num2text_11() 
	{
		// Given
		String input = "11";
		String expected = "onze";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test_num2text_12() 
	{
		// Given
		String input = "12";
		String expected = "douze";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test_num2text_13() 
	{
		// Given
		String input = "13";
		String expected = "treize";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test_num2text_14() 
	{
		// Given
		String input = "14";
		String expected = "quatorze";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test_num2text_15() 
	{
		// Given
		String input = "15";
		String expected = "quinze";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test_num2text_16() 
	{
		// Given
		String input = "16";
		String expected = "seize";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	
	public void test_num2text_17() 
	{
		// Given
		String input = "17";
		String expected = "dix sept";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test_num2text_20() 
	{
		// Given
		String input = "20";
		String expected = "vingt";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_30() 
	{
		// Given
		String input = "30";
		String expected = "trent";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_40() 
	{
		// Given
		String input = "40";
		String expected = "quarente";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_50() 
	{
		// Given
		String input = "50";
		String expected = "cinquante";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_60() 
	{
		// Given
		String input = "60";
		String expected = "soixante";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_70() 
	{
		// Given
		String input = "70";
		String expected = "soixante dix";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_80() 
	{
		// Given
		String input = "80";
		String expected = "quatre vingt";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_90() 
	{
		// Given
		String input = "90";
		String expected = "quatre vingt dix";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	
}
