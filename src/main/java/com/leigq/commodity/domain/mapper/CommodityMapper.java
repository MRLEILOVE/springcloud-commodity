package com.leigq.commodity.domain.mapper;

import com.leigq.commodity.domain.entity.Commodity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品
 * <p>
 * 创建人：LeiGQ <br>
 * 创建时间：2019-03-06 20:40 <br>
 * <p>
 * 修改人： <br>
 * 修改时间： <br>
 * 修改备注： <br>
 * </p>
 */
@Mapper
public interface CommodityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Commodity record);

    int insertSelective(Commodity record);

    Commodity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Commodity record);

    int updateByPrimaryKey(Commodity record);
}