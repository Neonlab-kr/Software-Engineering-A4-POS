package control;

import java.sql.*;

import SQL.dbConnector;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WorkTimeSearch {
	SQL.dbConnector db = new SQL.dbConnector();
	
	private String name;
	private String date;
	private Object[][] userData;
	private int[] Result;

	public Object[][] getInfo(String name){
		ResultSet rs = db.executeQuery("");
		return userData;
	}
	public Object[][] getInfo(Date date) {
		return userData;
	}
}
