package kr.co.seoulit.erp.account.operate.system.service;

import kr.co.seoulit.erp.account.operate.system.dao.*;
import kr.co.seoulit.erp.account.operate.system.to.*;
import kr.co.seoulit.erp.account.operate.system.entity.*;
import kr.co.seoulit.erp.account.operate.system.mapstruct.*;
import kr.co.seoulit.erp.account.operate.system.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BoardServiceFacadeImpl implements BoardServiceFacade {
    @Autowired
    private BoardDAO boardDAO;
    @Autowired
    private BoardRepository boardRepository;
    @Autowired
    private BoardReqMapStruct boardReqMapstruct;
    @Autowired
    private BoardResMapStruct boardResMapstruct;


    // 게시판 조회
    @Override
    public List<BoardResDTO> findBoardList() throws Exception {

        List<BoardEntity> noticeBoardEntityList = boardDAO.findBoardList();
//        List<NoticeBoardEntity> boardEntityList = boardRepository.findBoardList();
        return	boardResMapstruct.toDto(noticeBoardEntityList);
    }

    // 게시판 상세 조회
    @Override
    public BoardResDTO findBoardDetail(String boardId) throws Exception {

        BoardEntity noticeBoardEntity = boardDAO.findBoardDetail(boardId);
//        BoardEntity boardEntity	= boardRepository.findBoardDetail(boardId);
        return	boardResMapstruct.toDto(noticeBoardEntity);
    }

    // 게시판 추가
    @Override
    public void insertBoard(BoardReqDTO boardReqDTO) throws Exception {

        BoardEntity noticeBoardEntity = boardReqMapstruct.toEntity(boardReqDTO);
        boardDAO.insertBoard(noticeBoardEntity);
//        boardRepository.save(noticeBoardEntity);
    }

    // 게시판 수정
    @Override
    public void updateBoard(BoardReqDTO boardReqDTO) throws Exception {

        BoardEntity noticeBoardEntity = boardReqMapstruct.toEntity(boardReqDTO);
        boardDAO.updateBoard(noticeBoardEntity);
    }

    // 게시판 삭제
    @Override
    public void deleteBoard(String boardId) throws Exception {

        boardDAO.deleteBoard(boardId);
    }
}

