package util;

import model.ReturnResult;

public class Parser {
	//�����ݴ�����ض��ĸ�ʽ
	public String judge;
	public Object[][] result;
	public String errorReport;
	
	public ReturnResult getAddBookResult(String returnStr){
		
		//���ص�returnStr��ʽ��
		//success:id1,bookname1,author1,price1&id2,bookname2,author2,price2...
		//����: error:why?
		judge = returnStr.split(":")[0];
		ReturnResult res = new ReturnResult(judge,result,errorReport);
		return res;
	}
	
	public ReturnResult getDeleteBookResult(String returnStr){
		judge = returnStr.split(":")[0];
		ReturnResult res = new ReturnResult(judge,result,errorReport);
		return res;
	}
	
	public ReturnResult getChangeBookResult(String returnStr){
		judge = returnStr.split(":")[0];
		ReturnResult res = new ReturnResult(judge,result,errorReport);
		return res;
	}
	
	public ReturnResult clearResult(String returnStr){
		judge = returnStr.split(":")[0];
		ReturnResult res = new ReturnResult(judge,result,errorReport);
		return res;
	}
	
	public ReturnResult getSelectBookResult(String returnStr){
		judge = returnStr.split(":")[0];
		if(judge.equals("success"))
		{
			errorReport = null;
			String[] temp = returnStr.split(":")[1].split("&");
			result = new Object[temp.length][4];
			for(int i = 0; i < temp.length; i++)
			{
				result[i][0] = temp[i].split(",")[0]; //id
				result[i][1] = temp[i].split(",")[1]; //bookname
				result[i][2] = temp[i].split(",")[2]; //author
				result[i][3] = temp[i].split(",")[3]; //price
			}
		}
		else if(judge.equals("error"))
		{
			errorReport = returnStr.split(":")[1];
			result = null;
		}
		else
		{
			System.out.println("����δ֪����");
		}
		
		ReturnResult res = new ReturnResult(judge,result,errorReport);
		return res;
	}
	
	public ReturnResult findAllResult(String returnStr){
		judge = returnStr.split(":")[0];
		if(judge.equals("success"))
		{
			errorReport = null;
			String[] temp = returnStr.split(":")[1].split("&");
			result = new Object[temp.length][4];
			for(int i = 0; i < temp.length; i++)
			{
				result[i][0] = temp[i].split(",")[0]; //id
				result[i][1] = temp[i].split(",")[1]; //bookname
				result[i][2] = temp[i].split(",")[2]; //author
				result[i][3] = temp[i].split(",")[3]; //price
			}
		}
		else if(judge.equals("error"))
		{
			errorReport = returnStr.split(":")[1];
			result = null;
		}
		else
		{
			System.out.println("����δ֪����");
		}
		
		ReturnResult res = new ReturnResult(judge,result,errorReport);
		return res;
	}
}
