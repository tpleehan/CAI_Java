package com.spring.myweb.snsboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.myweb.command.SNSBoardVO;
import com.spring.myweb.snsboard.mapper.ISNSBoardMapper;

@Service
public class SNSBoardService implements ISNSBoardService {

	@Autowired
	private ISNSBoardMapper mapper;
	
	@Override
	public void insert(SNSBoardVO vo) {
		mapper.insert(vo);

	}

	@Override
	public List<SNSBoardVO> getList() {
		return mapper.getList();
	}

	@Override
	public SNSBoardVO getDetail(int bno) {
		return mapper.getDetail(bno);
	}

	@Override
	public void delete(int bno) {
		mapper.delete(bno);

	}

}
