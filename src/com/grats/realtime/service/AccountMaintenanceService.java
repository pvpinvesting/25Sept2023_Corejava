package com.grats.realtime.service;

import java.util.Map;

import javax.security.auth.login.AccountNotFoundException;

import com.grats.realtime.bean.AccountDetails;
import com.grats.realtime.dao.AccountMaintenanceDao;

public class AccountMaintenanceService {
	
	AccountMaintenanceDao acctManDao=new AccountMaintenanceDao();
	
	public AccountDetails findAccountDetl(String acctNo) {
		// TODO Auto-generated method stub
		Map<String,AccountDetails> acctDetlMap=acctManDao.getAllAccountDetailMap();
		System.out.println(":acctDetlMap:"+acctDetlMap);
		return acctDetlMap.get(acctNo);
	}

	public String createAccount(AccountDetails accDetl) {
		// TODO Auto-generated method stub
		System.out.println(":Service:Start");
		String msg = acctManDao.createAccount(accDetl);
		System.out.println(":Service:End");
		return msg;
	}

	public void depositAmount(AccountDetails accDetl)throws AccountNotFoundException {
		// TODO Auto-generated method stub
		Map<String,AccountDetails> acctDetlMap=acctManDao.getAllAccountDetailMap();
		if(!acctDetlMap.containsKey(accDetl.getAccNo())) {
			throw new AccountNotFoundException("Please enter a valid account no");
		}else {
			AccountDetails obj=acctDetlMap.get(accDetl.getAccNo());
			Integer totBal = Integer.parseInt(obj.getBalance())+Integer.parseInt(accDetl.getBalance());
			obj.setBalance(totBal+"");
		}
		acctManDao.updateAccount(acctDetlMap);
	}

}
