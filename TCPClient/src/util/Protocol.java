package util;

public class Protocol {
	//协议
	
	public String getAddBookMsg(String bookname, String author, float price){
		//类型：add:bookname,author,price
		String resultMsg ="add:" + bookname + "," + author + "," + price + "\n";
		return resultMsg;
	}
	
	public String getdeleteBookMsg(int id, String bookname){
		if(id == -1){
			String resultMsg="delete:" + "name," + bookname + "\n";
			return resultMsg;
		}
		else{
			String resultMsg="delete:" + "id," + Integer.toString(id) + "\n";
			return resultMsg;
		}
	}
	
	public String getchangeBookMsg(int id, String bookname, String changename){
		if(id == -1){
			String resultMsg="change:" + "bookname," + bookname + "," + changename + "\n";
			return resultMsg;
		}
		else{
			String resultMsg="delete:" + "id," + Integer.toString(id) + "," + changename + "\n";
			return resultMsg;
		}
	}
	
	public String getselectBookMsg(int id, String bookname, String dimname, String author, float minprice, float maxprice){
		if(id != -1){
			String resultMsg="select:" + "id," + Integer.toString(id) + "\n";
			return resultMsg;
		}
		else if(bookname != null){
			String resultMsg="select:" + "bookname," + bookname + "\n";
			return resultMsg;
		}
		else if(dimname != null){
			String resultMsg="select:" + "dimname," + dimname + "\n";
			return resultMsg;
		}
		else if(author != null){
			String resultMsg="select:" + "author," + author + "\n";
			return resultMsg;
		}
		else{
			String resultMsg="select:" + "price," + minprice + "," + maxprice + "\n";
			return resultMsg;
		}
	}
	
	public String findAllMsg()
	{
		String resultMsg = "findall: \n";
		return resultMsg;
	}
	
	public String exit(){
		String resultMsg = "exit\n";
		return resultMsg;
	}
	
	public String clear(){
		String resultMsg = "clearall:\n";
		return resultMsg;
	}
}
