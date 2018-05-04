package kr.or.ddit.board.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.board.vo.BoardVO;

public interface BoardServiceInf {

	//전체데이터 가져오기
	public List<BoardVO> selectAll();
	
	//페이지 별 데이터 가져오기
	public List<BoardVO> selectAll(Map<String, Object> map) ;
	
}
