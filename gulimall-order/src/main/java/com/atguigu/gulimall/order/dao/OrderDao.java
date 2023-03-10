package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author dango
 * @email a15521474798@outlook.com
 * @date 2023-03-09 21:39:39
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
