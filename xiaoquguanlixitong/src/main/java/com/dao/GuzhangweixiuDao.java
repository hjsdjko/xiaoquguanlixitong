package com.dao;

import com.entity.GuzhangweixiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GuzhangweixiuView;

/**
 * 故障维修 Dao 接口
 *
 * @author 
 */
public interface GuzhangweixiuDao extends BaseMapper<GuzhangweixiuEntity> {

   List<GuzhangweixiuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
