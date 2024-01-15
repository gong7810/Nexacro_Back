package kr.co.seoulit.erp.sys.base.controller;

import java.util.ArrayList;

import kr.co.seoulit.erp.sys.base.service.BaseService;
import kr.co.seoulit.erp.sys.base.to.MenuEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nexacro.java.xapi.data.PlatformData;

import kr.co.seoulit.erp.sys.common.mapper.DatasetToBeanMapper;

@RestController
@RequestMapping("/base")
public class MenuListController {  // 하나의 컨트롤러에서 여러개의 요청처리 지원

    @Autowired
    private BaseService baseService;
    @Autowired
    private DatasetToBeanMapper datasetToBeanMapper;

    @RequestMapping("/findMenuList")
    public ArrayList<MenuEntity>findMenuList(@RequestAttribute("reqData") PlatformData reqData,
                                             @RequestAttribute("resData") PlatformData resData) throws Exception{
    	
    	ArrayList<MenuEntity> menuList = baseService.selectAllMenuList();

        datasetToBeanMapper.beansToDataset(resData, menuList, MenuEntity.class);
        return null;
    }
    




}
