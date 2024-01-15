package kr.co.seoulit.erp.sys.base.mapper;

import java.util.ArrayList;

import kr.co.seoulit.erp.sys.base.to.AddressBean;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AddressMapper {
    /*public ArrayList<AddressBean> searchAddressList(String dong);*/

    public ArrayList<AddressBean> selectRoadList(String sido, String sigunguname, String roadname);

    public ArrayList<AddressBean> selectSigunguList(String parameter);

    public ArrayList<AddressBean> selectSidoList();

    public ArrayList<AddressBean> selectPostList(String dong);
}
