package kr.co.seoulit.account.posting.business.controller;

import java.util.ArrayList;

import io.swagger.v3.oas.annotations.Hidden;
import kr.co.seoulit.account.posting.business.DTO.JournalDetailreqDto;
import kr.co.seoulit.account.posting.business.DTO.JournalDetailresDto;
import kr.co.seoulit.account.posting.business.DTO.JournalreqDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.nexacro.java.xapi.data.PlatformData;

import kr.co.seoulit.account.posting.business.service.BusinessService;
import kr.co.seoulit.account.posting.business.Entity.JournalDetailEntity;
import kr.co.seoulit.account.sys.common.mapper.DatasetBeanMapper;

@Hidden //swagger test : 일단 ledger부분만 나오도록 설정해둠
@RestController
@RequestMapping("/posting")
public class JournalDetailController {

    @Autowired
    private BusinessService businessService;

    @Autowired
    private DatasetBeanMapper datasetBeanMapper;


    ModelAndView mav = null;
    ModelMap map = new ModelMap();

    //@GetMapping("/journaldetaillist")
    @RequestMapping(value = "/findJournalDetailList")
    public void findJournalDetailList(@RequestAttribute("reqData") PlatformData reqData,
                                                                @RequestAttribute("resData")PlatformData resData) throws Exception {
        String journalNo = reqData.getVariable("journalNo").getString();
        System.out.println(journalNo+"😡😡😡😡"); // 저널 번호 넘어 온다.
        ArrayList<JournalDetailresDto> journalDetailList = businessService.findJournalDetailList(journalNo);
        System.out.println(journalDetailList+"💀💀💀");
        datasetBeanMapper.beansToDataset(resData, journalDetailList, JournalDetailresDto.class);
    }

    @RequestMapping(value = "/journalDetailAccountList")
    public ArrayList<JournalDetailEntity> journalDetailAccountList(@RequestAttribute("reqData")PlatformData reqData,
                                                                   @RequestAttribute("resData")PlatformData resData) throws Exception {
        String accountCode = reqData.getVariable("accountCode").getString();

        ArrayList<JournalDetailEntity> List = businessService.detailAccountList(accountCode);
        datasetBeanMapper.beansToDataset(resData, List, JournalDetailEntity.class);


        return null;
    }


    @GetMapping("/journaldetailmodification")
    public void modifyJournalDetail(@RequestParam String accountControlType, @RequestParam String journalNo,
                                    @RequestParam(value = "journalDetailNo", required = false) String journalDetailNo,
                                    @RequestParam String journalDescription) {

        JournalDetailEntity journalDetailEntity = new JournalDetailEntity();

        journalDetailEntity.setAccountControlType(accountControlType);
        journalDetailEntity.setJournalNo(journalNo);
        journalDetailEntity.setJournalDetailNo(journalDetailNo);
        journalDetailEntity.setJournalDescription(journalDescription);

        businessService.modifyJournalDetail(journalDetailEntity);

    }
//        여기 modify 인데 리턴값이 있고 그 런턴을 반환하지도 않음 이상함(choi)

}
