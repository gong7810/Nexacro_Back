package kr.co.seoulit.account.operate.system.controller;

import java.util.List;

import kr.co.seoulit.account.operate.system.to.BoardReqDto;
import kr.co.seoulit.account.operate.system.to.BoardResDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nexacro.java.xapi.data.PlatformData;

import kr.co.seoulit.account.operate.system.service.SystemService;
import kr.co.seoulit.erp.sys.common.mapper.DatasetToBeanMapper;

@RestController
@RequestMapping("/operate")
public class BoardController {

	@Autowired
	private SystemService systemService;
	@Autowired
	private DatasetToBeanMapper datasetToBeanMapper;


	// board CRUD

	@RequestMapping("/findBoardList")
	public void findBoardList(@RequestAttribute("reqData")PlatformData reqData,
							  @RequestAttribute("resData")PlatformData resData) throws Exception {
		System.out.println("<<<<<<<<<<< 게시판 조회 >>>>>>>>>>>>");
		List<BoardResDto> boardList = systemService.findBoardList();
		datasetToBeanMapper.beansToDataset(resData, boardList, BoardResDto.class);
	}

	@RequestMapping("/findBoardDetail")
	public void findBoardDetail(@RequestAttribute("reqData")PlatformData reqData,
								@RequestAttribute("resData")PlatformData resData) throws Exception {
		String boardInfo = reqData.getVariable("bno").getString();
		System.out.println("this board info"+boardInfo);

		BoardResDto boardDetail = systemService.findBoardDetail(boardInfo);
		datasetToBeanMapper.beanToDataset(resData, boardDetail, BoardResDto.class);

	}

	@RequestMapping("/registerBoard")
	public void findBoard(@RequestAttribute("reqData")PlatformData reqData,
						  @RequestAttribute("resData")PlatformData resData) throws Exception {
		BoardReqDto boardReqDto = datasetToBeanMapper.datasetToBean(reqData, BoardReqDto.class);
		System.out.println("<<<<<<<<< 게시판 추가 >>>>>>>>>>>>"+boardReqDto);
		systemService.registerBoard(boardReqDto);
	}

	@RequestMapping("/modifyBoard")
	public void modifyBoard(@RequestAttribute("reqData")PlatformData reqData,
							@RequestAttribute("resData")PlatformData resData) throws Exception {
		System.out.println("This is resData : "+resData);
		System.out.println("<<<<<<<<<<< 게시판 수정 >>>>>>>>>>>>>>>>");
		BoardReqDto boardReqDto = datasetToBeanMapper.datasetToBean(reqData, BoardReqDto.class);
		System.out.println("<<<<<<<<<<<<<this is Data for modify"+boardReqDto);
		systemService.modifyBoard(boardReqDto);
	}

	@RequestMapping("/removeBoard")
	public void removeBoard(@RequestAttribute("reqData")PlatformData reqData,
							@RequestAttribute("resData")PlatformData resData) throws Exception {
		String boardId = reqData.getVariable("bno").getString();
		System.out.println(""+boardId+" 게시판 삭제");
		systemService.removeBoard(boardId);

	}


}
