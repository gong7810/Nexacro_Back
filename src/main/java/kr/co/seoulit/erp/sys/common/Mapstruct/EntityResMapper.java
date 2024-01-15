package kr.co.seoulit.erp.sys.common.Mapstruct;


import java.util.List;


public interface EntityResMapper<E,D> {
    //ResMapper
    D toDto(E entity);
    List<D> toDto(List<E> entities);
}
