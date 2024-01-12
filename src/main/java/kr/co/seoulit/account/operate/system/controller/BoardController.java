package kr.co.seoulit.account.operate.system.controller;

import java.util.ArrayList;
import java.util.List;

import kr.co.seoulit.account.operate.system.to.BoardReqDto;
import kr.co.seoulit.account.operate.system.to.BoardResDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nexacro.java.xapi.data.PlatformData;

import kr.co.seoulit.account.operate.system.service.SystemService;
import kr.co.seoulit.account.operate.system.entity.BoardEntity;
import kr.co.seoulit.account.sys.common.mapper.DatasetBeanMapper;

@RestController
@RequestMapping("/operate")
public class BoardController {

	@Autowired
	private SystemService systemService;
	@Autowired
	private DatasetBeanMapper datasetBeanMapper;


											// board CRUD

	@RequestMapping("/registerBoard")
	public void findBoard(@RequestAttribute("reqData")PlatformData reqData,
						  @RequestAttribute("resData")PlatformData resData) throws Exception {
		BoardReqDto boardReqDto = datasetBeanMapper.datasetToBean(reqData, BoardReqDto.class);
		System.out.println("<<<<<<<<<this is bean for insert!!!>>>>>>>>>>>>"+boardReqDto);
		systemService.registerBoard(boardReqDto);
	}

	@RequestMapping("/modifyBoard")
	public void modifyBoard(@RequestAttribute("reqData")PlatformData reqData,
							@RequestAttribute("resData")PlatformData resData) throws Exception {
		System.out.println("This is resData : "+resData);
		System.out.println("<<<<<<<<<<<<modifyBoard has been called>>>>>>>>>>>>>>>>");
		BoardReqDto boardReqDto = datasetBeanMapper.datasetToBean(reqData, BoardReqDto.class);
		System.out.println("<<<<<<<<<<<<<this is Data for modify"+boardReqDto);
		systemService.modifyBoard(boardReqDto);
	}



	@RequestMapping("/findBoardList")
	public void findBoardList(@RequestAttribute("reqData")PlatformData reqData,
							  @RequestAttribute("resData")PlatformData resData) throws Exception {
		System.out.println("<<<<<<<<<<<request arrived at findboardList>>>>>>>>>>>>");
		List<BoardResDto> boardList = systemService.findBoardList();
		datasetBeanMapper.beansToDataset(resData, boardList, BoardResDto.class);
	}

	@RequestMapping("/findBoardDetail")
	public void findBoardDetail(@RequestAttribute("reqData")PlatformData reqData,
								@RequestAttribute("resData")PlatformData resData) throws Exception {
		String boardInfo = reqData.getVariable("bno").getString();
		System.out.println("this board info"+boardInfo);

		BoardResDto boardDetail = systemService.findBoardDetail(boardInfo);
		datasetBeanMapper.beanToDataset(resData, boardDetail, BoardResDto.class);

	}

	@RequestMapping("/removeBoard")
	public void removeBoard(@RequestAttribute("reqData")PlatformData reqData,
							@RequestAttribute("resData")PlatformData resData) throws Exception {
		String boardId = reqData.getVariable("bno").getString();
		System.out.println("<<<<<<<<<<<<<<<Board "+boardId+" has been arrived at removeBoard!!!");
		systemService.removeBoard(boardId);

	}


}
