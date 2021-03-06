package io.xiaowei.order.dao;

import io.xiaowei.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xiaowei
 * @email xiaowei_wang@aliyun.com
 * @date 2020-07-12 15:56:37
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
