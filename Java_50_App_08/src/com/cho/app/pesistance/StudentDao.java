package com.cho.app.pesistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cho.app.dbconfig.DBConnection;
import com.cho.app.dbconfig.DBContract;
import com.cho.app.model.StudentVO;

public class StudentDao {
	
	private final Connection dbConn;
	public StudentDao() {
		dbConn = DBConnection.getDBConnection();
	}
	
	/*
	 * Exception 을 처리하는 두 가지 방법
	 * 1. Exception 코드를 try-catch 로 감싸주기.
	 * 
	 * 2. Exception 을 나를 호출한 곳으로 던지기.
	 *  Service 에서 다음과 같이 selectAll() 을 호출할 것이다.
	 * 		List<StudentVO> stList = dao.selectALl();
	 * 	dao.selectAll() 에서 Exception 이 발생하면
	 * 	dao.selectAll() 에서 직접 처리하지 않고,
	 * 	Service 로 exception 을 던지기(전달)하여 exception 을 모아서 처리하기.
	 */
	public List<StudentVO> selectAll() throws SQLException {
		PreparedStatement pStr = null;
		String sql = DBContract.ST_SELECT;
		pStr = dbConn.prepareStatement(sql);
		ResultSet rSet = pStr.executeQuery();
		return getResult(rSet);
	}
	
	private List<StudentVO> getResult(ResultSet rSet) throws SQLException {
		List<StudentVO> stList = new ArrayList<>();
		while(rSet.next()) {
			StudentVO stVO = StudentVO.builder()
									.stNum(rSet.getString(DBContract.ST_COL.ST_NUM))
									.stName(rSet.getString(DBContract.ST_COL.ST_NAME))
									.stDept(rSet.getString(DBContract.ST_COL.ST_DEPT))
									.stGrade(rSet.getInt(DBContract.ST_COL.ST_GRADE))
									.stAddr(rSet.getString(DBContract.ST_COL.ST_ADDR))
									.stTel(rSet.getString(DBContract.ST_COL.ST_TEL))
									.build();
			stList.add(stVO);
		}
		return stList;
	}

}
