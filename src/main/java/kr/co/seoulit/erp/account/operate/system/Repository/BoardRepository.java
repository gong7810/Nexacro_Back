package kr.co.seoulit.erp.account.operate.system.Repository;

import kr.co.seoulit.erp.account.operate.system.Entity.NoticeBoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BoardRepository extends JpaRepository<NoticeBoardEntity, Integer> {

    // 게시판 조회
    @Query("SELECT board FROM NoticeBoardEntity board")
    List<NoticeBoardEntity> findBoardList();

    // 게시판 상세 조회
    @Query("SELECT board FROM NoticeBoardEntity board WHERE board.id = :boardId")
    NoticeBoardEntity findBoardDetail(@Param("boardId") String boardId);



}
