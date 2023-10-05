package com.grats.realtime.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.grats.realtime.bean.AccountDetails;

public class AccountMaintenanceDao {

	public Map<String, AccountDetails> getAllAccountDetailMap() {
		return readAccounts();
	}
	
	public String createAccount(AccountDetails accountDetails) {
		System.out.println(":Dao:Start");
		
		Map<String, AccountDetails> mapObj;
		File file;
		try {
			file = new File("accounts_master.obj");

			if (file.exists()) {
				mapObj = readAccounts();
			} else {
				mapObj = new HashMap<>();
			}
			mapObj.put(accountDetails.getAccNo(), accountDetails);


//			fos = new FileOutputStream("accounts_master.obj",false);
//			oos = new ObjectOutputStream(fos);
//			oos.writeObject(mapObj);
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
		System.out.println(":Dao:End");
		return "";
	}
	
	private void writeAccountDetails(Map<String, AccountDetails> mapObj) {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos = new FileOutputStream("accounts_master.obj",false);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(mapObj);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(oos!=null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	private Map<String,AccountDetails> readAccounts(){
		FileInputStream fis;
		ObjectInputStream ois;
		Object obj;
		Map<String,AccountDetails> mapObj=null;
		try {
			fis = new FileInputStream("accounts_master.obj");
			ois = new ObjectInputStream(fis);
			
			obj = ois.readObject();
			mapObj = (HashMap)obj;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mapObj;
	}

	public void updateAccount(Map<String, AccountDetails> acctDetlMap) {
		// TODO Auto-generated method stub
		writeAccountDetails(acctDetlMap);
	}
	

}
