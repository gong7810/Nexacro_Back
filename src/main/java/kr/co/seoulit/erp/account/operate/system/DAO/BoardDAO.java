package kr.co.seoulit.erp.account.operate.system.DAO;

import kr.co.seoulit.erp.account.operate.system.Entity.NoticeBoardEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardDAO {

    //게시판 조회
    List<NoticeBoardEntity> findBoardList()throws Exception;

    //게시글 상세조회
    NoticeBoardEntity findBoardDetail(String boardId)throws Exception;

    //게시글 추가
    void insertBoard(NoticeBoardEntity noticeBoardEntity) throws Exception;

    //게시판 수정
    void updateBoard(NoticeBoardEntity noticeBoardEntity) throws Exception;

    //게시판 삭제
    void deleteBoard(String boardId)throws Exception;
}
