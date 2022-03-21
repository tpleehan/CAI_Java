package com.spring.dct.lecture.service;

import java.util.List;

import com.spring.dct.vo.OnlineLectureUplaodVO;
import com.spring.dct.vo.OnlineLecturesVO;
import com.spring.dct.vo.PageVO;

public interface ILectureService {

	// 글 등록
	void regist(OnlineLectureUplaodVO vo);

	// 글 목록
	List<OnlineLectureUplaodVO> getList(PageVO vo);

	// 총 게시물 수
	int getTotal(PageVO vo);

	// 상세보기
	OnlineLectureUplaodVO getContent(int lectureNo);

	// 수정
	void update(OnlineLecturesVO vo);

	// 삭제
	void delete(int LectureNo);

}