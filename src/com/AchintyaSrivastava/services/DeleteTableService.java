package com.AchintyaSrivastava.services;

import com.AchintyaSrivastava.DAO.DeleteTable;
import com.AchintyaSrivastava.domain.UserDetails;

public class DeleteTableService {
	public static void deleteTableService(UserDetails ud){
		DeleteTable.DaoDelete_table(ud);
	}
}
