package kr.co.seoulit.erp.sys.common.Mapstruct;


import java.util.List;

public interface EntityReqMapper <E,D> {
    //ReqMapper
    E toEntity(D dto);

    List<E> toEntity (List<D> dtos);
}
