package com.demostore.qa.dataprovider;

public class DataProvider {
@org.testng.annotations.DataProvider(name="UserAdress")
	public static Object[][] logInData()
	{
		return new Object[][]
				{
			{"IN","Maharashtra","tushar.rajput9311gmail.com","Tushar","Rajput","201,SB Road","Pune","Maharashtra","IN","422006","9856784598"}
			};
	}
}
