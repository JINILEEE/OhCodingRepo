package com.cherry.qna.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.cherry.jdbc.JDBCTemplate;
import com.cherry.qna.vo.QnaVo;

public class QnaDao {

	// 문의글 작성
	public int write(Connection conn, QnaVo vo) throws Exception {
		
		//sql
		String sql = "";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(0, sql);
		int result = pstmt.executeUpdate();
		
		//rs
		
		//close
		JDBCTemplate.close(pstmt);
		return result;
		
	}//write end
	
}
