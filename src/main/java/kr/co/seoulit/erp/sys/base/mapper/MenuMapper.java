package kr.co.seoulit.erp.sys.base.mapper;

import java.util.ArrayList;

import kr.co.seoulit.erp.sys.base.to.MenuEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MenuMapper {
    ArrayList<MenuEntity> selectMenuList(String empCode);

    ArrayList<MenuEntity> selectAllMenuList();
    
    ArrayList<MenuEntity> selectMenuNameList(String deptCode);

}
