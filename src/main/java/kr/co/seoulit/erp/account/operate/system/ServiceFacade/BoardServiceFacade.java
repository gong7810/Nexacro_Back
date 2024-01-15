package kr.co.seoulit.erp.account.operate.system.ServiceFacade;

import kr.co.seoulit.erp.account.operate.system.DTO.BoardReqDTO;
import kr.co.seoulit.erp.account.operate.system.DTO.BoardResDTO;

import java.util.List;

public interface BoardServiceFacade {

    // 게시판 조회
    public List<BoardResDTO> findBoardList()throws Exception;

    // 게시판 상세 조회
    public BoardResDTO findBoardDetail(String boardId)throws Exception;

    // 게시판 추가
    public void insertBoard(BoardReqDTO boardReqDTO)throws Exception;

    // 게시판 수정
    public void updateBoard(BoardReqDTO boardReqDTO)throws Exception;

    // 게시판 삭제
    public void deleteBoard(String boardId)throws Exception;

}
