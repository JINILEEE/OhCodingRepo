package com.cherry.qna.service;

import java.sql.Connection;

import com.cherry.jdbc.JDBCTemplate;
import com.cherry.qna.dao.QnaDao;
import com.cherry.qna.vo.QnaVo;

public class QnaService {

	private final QnaDao dao;
	
	//기본 생성자
	public QnaService() {
		dao = new QnaDao();
	}
	
	//문의글 작성
	public int write(QnaVo vo) throws Exception {
		
		// conn
		Connection conn = JDBCTemplate.getConnection();
		
		//dao
		int result = dao.write(conn, vo);
		
		//tx
		if(result == 1) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		
		//close
		JDBCTemplate.close(conn);
		
		return result;
	}
	
}
