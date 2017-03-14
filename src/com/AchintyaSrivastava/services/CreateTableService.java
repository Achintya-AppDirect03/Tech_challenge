package com.AchintyaSrivastava.services;

import com.AchintyaSrivastava.DAO.DaoInsertTable;
import com.AchintyaSrivastava.DAO.DaoTable;
import com.AchintyaSrivastava.domain.UserDetails;

public class CreateTableService {
	public static void Calltable(){
		DaoTable.Creator();
		DaoTable.Company();
		DaoTable.Account();
		DaoTable.Order();
	}
	
	public static void CallInsertion(UserDetails ud)
	{
		DaoInsertTable.Insert(ud);
	}
}
