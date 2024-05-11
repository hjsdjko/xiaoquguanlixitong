package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.dao.RuzhudengjiDao;
import com.entity.RuzhudengjiEntity;
import com.service.RuzhudengjiService;
import com.entity.view.RuzhudengjiView;

/**
 * 入住登记 服务实现类
 */
@Service("ruzhudengjiService")
@Transactional
public class RuzhudengjiServiceImpl extends ServiceImpl<RuzhudengjiDao, RuzhudengjiEntity> implements RuzhudengjiService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<RuzhudengjiView> page =new Query<RuzhudengjiView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
