package kr.co.seoulit.erp.account.operate.system.ServiceFacade;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import kr.co.seoulit.erp.account.operate.system.DAO.*;
import kr.co.seoulit.erp.account.operate.system.DTO.*;
import kr.co.seoulit.erp.account.operate.system.Entity.*;
import kr.co.seoulit.erp.account.operate.system.Mapstruct.*;
import kr.co.seoulit.erp.account.operate.system.Repository.*;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BoardServiceFacadeImpl implements BoardServiceFacade {
    @Autowired
    private BoardDAO boardDAO;
    @Autowired
    private BoardRepository boardRepository;
    @Autowired
    private BoardReqMapstruct boardReqMapstruct;
    @Autowired
    private BoardResMapstruct boardResMapstruct;


    // 게시판 조회
    @Override
    public List<BoardResDTO> findBoardList() throws Exception {

        List<NoticeBoardEntity> noticeBoardEntityList = boardDAO.findBoardList();
//        List<NoticeBoardEntity> boardEntityList = boardRepository.findBoardList();
        return	boardResMapstruct.toDto(noticeBoardEntityList);
    }

    // 게시판 상세 조회
    @Override
    public BoardResDTO findBoardDetail(String boardId) throws Exception {

        NoticeBoardEntity noticeBoardEntity = boardDAO.findBoardDetail(boardId);
//        BoardEntity boardEntity	= boardRepository.findBoardDetail(boardId);
        return	boardResMapstruct.toDto(noticeBoardEntity);
    }

    // 게시판 추가
    @Override
    public void insertBoard(BoardReqDTO boardReqDTO) throws Exception {

        NoticeBoardEntity noticeBoardEntity = boardReqMapstruct.toEntity(boardReqDTO);
        boardDAO.insertBoard(noticeBoardEntity);
//        boardRepository.save(noticeBoardEntity);
    }

    // 게시판 수정
    @Override
    public void updateBoard(BoardReqDTO boardReqDTO) throws Exception {

        NoticeBoardEntity noticeBoardEntity = boardReqMapstruct.toEntity(boardReqDTO);
        boardDAO.updateBoard(noticeBoardEntity);
    }

    // 게시판 삭제
    @Override
    public void deleteBoard(String boardId) throws Exception {

        boardDAO.deleteBoard(boardId);
    }
}

