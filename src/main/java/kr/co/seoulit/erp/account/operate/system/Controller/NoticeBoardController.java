package kr.co.seoulit.erp.account.operate.system.Controller;

import com.nexacro.java.xapi.data.PlatformData;
import kr.co.seoulit.erp.account.operate.system.DTO.BoardReqDTO;
import kr.co.seoulit.erp.account.operate.system.DTO.BoardResDTO;
import kr.co.seoulit.erp.sys.common.mapper.DatasetToBeanMapper;
import kr.co.seoulit.erp.account.operate.system.ServiceFacade.BoardServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/acc/operate")
public class NoticeBoardController {

    @Autowired
    private BoardServiceFacade boardServiceFacade;
    @Autowired
    private DatasetToBeanMapper datasetToBeanMapper;

    // 게시판 조회
    @GetMapping("/findBoardList")
    public void findBoardList(@RequestAttribute("reqData")PlatformData reqData,
                              @RequestAttribute("resData")PlatformData resData) throws Exception {
        System.out.println("게시판 조회 Rest API");
        List<BoardResDTO> boardList = boardServiceFacade.findBoardList();
        datasetToBeanMapper.beansToDataset(resData, boardList, BoardResDTO.class);
    }

    // 게시판 상세 조회
    @GetMapping("/findBoardDetail")
    public void findBoardDetail(@RequestAttribute("reqData")PlatformData reqData,
                                @RequestAttribute("resData")PlatformData resData) throws Exception {

        String boardInfo = reqData.getVariable("bno").getString();
        System.out.println("게시글 : "+ boardInfo + "상세 조회 Rest API");

        BoardResDTO boardDetail = boardServiceFacade.findBoardDetail(boardInfo);
        datasetToBeanMapper.beanToDataset(resData, boardDetail, BoardResDTO.class);
    }

    // 게시판 추가
    @PostMapping("/insertBoard")
    public void insertBoard(@RequestAttribute("reqData") PlatformData reqData,
                          @RequestAttribute("resData")PlatformData resData) throws Exception {

        BoardReqDTO BoardReqDTO = datasetToBeanMapper.datasetToBean(reqData, BoardReqDTO.class);
        System.out.println("게시판 추가 Rest API "+ BoardReqDTO);
        boardServiceFacade.insertBoard(BoardReqDTO);
    }

    // 게시판 수정
    @PutMapping("/updateBoard")
    public void updateBoard(@RequestAttribute("reqData")PlatformData reqData,
                            @RequestAttribute("resData")PlatformData resData) throws Exception {

        BoardReqDTO BoardReqDTO = datasetToBeanMapper.datasetToBean(reqData, BoardReqDTO.class);
        System.out.println("게시판 수정 Rest API "+ BoardReqDTO);
        boardServiceFacade.updateBoard(BoardReqDTO);
    }

    // 게시판 삭제
    @DeleteMapping("/deleteBoard")
    public void deleteBoard(@RequestAttribute("reqData")PlatformData reqData,
                            @RequestAttribute("resData")PlatformData resData) throws Exception {
        String boardId = reqData.getVariable("bno").getString();
        System.out.println("게시글 : " + boardId + "삭제 Rest API");
        boardServiceFacade.deleteBoard(boardId);
    }

}
