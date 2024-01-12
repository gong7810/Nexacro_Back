package kr.co.seoulit.account.operate.system.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.seoulit.account.operate.system.entity.BoardEntity;

@Mapper
public interface BoardMapper {


	List<BoardEntity> constBoardList()throws Exception;


	//test 완료
	List<BoardEntity> selectBoardList()throws Exception;



	//Test 성공
	 BoardEntity selectBoardDetail(String id)throws Exception;


	//test 성공
	 void insertBoard(BoardEntity bean) throws Exception;



	//test 성공
	 void updateBoard(BoardEntity bean) throws Exception;



	//Test 성공
	 void deleteBoard(String id)throws Exception;





//		//test 성공 ---> 안쓸거 같음
//		public List<BoardEntity> selectBoard(int bno);


//	//사용안함
//	public ArrayList<BoardEntity> selectBoardList();
//
//	//사용안함
//	public ArrayList<BoardEntity> selectBoarddetail(String row);


}
