package controller;

import model.ReturnResult;
import net.Client;
import util.Parser;
import util.Protocol;

public class Operator {
	
	public static int clearKey = 123456;
	
	public ReturnResult addBook(String bookname, String author, float price)
	{
		Protocol protocol = new Protocol();
		String msg = protocol.getAddBookMsg(bookname, author, price);
		Client.write(msg);
		System.out.println("operator:"+ msg);
		String returnStr = Client.read();
		System.out.println(returnStr);
		Parser parser = new Parser();
		ReturnResult returnResult = parser.getAddBookResult(returnStr);
		return returnResult;
	}
	
	public ReturnResult deleteBook(int id, String bookname){
		Protocol protocol = new Protocol();
		String msg = protocol.getdeleteBookMsg(id, bookname);
		Client.write(msg);
		System.out.println("operator:"+ msg);
		String returnStr = Client.read();
		System.out.println(returnStr);
		Parser parser = new Parser();
		ReturnResult returnResult = parser.getDeleteBookResult(returnStr);
		return returnResult;
	}
	
	public ReturnResult changeBook(int id, String bookname, String changename){
		Protocol protocol = new Protocol();
		String msg = protocol.getchangeBookMsg(id, bookname, changename);
		Client.write(msg);
		System.out.println("operator:"+ msg);
		String returnStr = Client.read();
		System.out.println(returnStr);
		Parser parser = new Parser();
		ReturnResult returnResult = parser.getChangeBookResult(returnStr);
		return returnResult;
	}
	
	public ReturnResult selectBook(int id, String bookname, String dimname, String author, float minprice, float maxprice){
		Protocol protocol = new Protocol();
		String msg = protocol.getselectBookMsg(id, bookname, dimname, author, minprice, maxprice);
		Client.write(msg);
		System.out.println("operator:"+ msg);
		String returnStr = Client.read();
		System.out.println(returnStr);
		Parser parser = new Parser();
		ReturnResult returnResult = parser.getSelectBookResult(returnStr);
		return returnResult;
	}
	
	public ReturnResult findAll()
	{
		Protocol protocol = new Protocol();
		String msg = protocol.findAllMsg();
		Client.write(msg);
		System.out.println("operator:"+ msg);
		String returnStr = Client.read();
		System.out.println(returnStr);
		Parser parser = new Parser();
		ReturnResult returnResult = parser.findAllResult(returnStr);
		return returnResult;
	}
	
	public ReturnResult Clear(){
		Protocol protocol = new Protocol();
		String msg = protocol.clear();
		Client.write(msg);
		System.out.println("operator:"+ msg);
		String returnStr = Client.read();
		System.out.println(returnStr);
		Parser parser = new Parser();
		ReturnResult returnResult = parser.clearResult(returnStr);
		return returnResult;
	}
	
	public void Exit(){
		Protocol protocol = new Protocol();
		String msg = protocol.exit();
		Client.write(msg);
	}
}
