package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShengchankailiDao;
import com.entity.ShengchankailiEntity;
import com.service.ShengchankailiService;
import com.entity.vo.ShengchankailiVO;
import com.entity.view.ShengchankailiView;

@Service("shengchankailiService")
public class ShengchankailiServiceImpl extends ServiceImpl<ShengchankailiDao, ShengchankailiEntity> implements ShengchankailiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShengchankailiEntity> page = this.selectPage(
                new Query<ShengchankailiEntity>(params).getPage(),
                new EntityWrapper<ShengchankailiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShengchankailiEntity> wrapper) {
		  Page<ShengchankailiView> page =new Query<ShengchankailiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShengchankailiVO> selectListVO(Wrapper<ShengchankailiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShengchankailiVO selectVO(Wrapper<ShengchankailiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShengchankailiView> selectListView(Wrapper<ShengchankailiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShengchankailiView selectView(Wrapper<ShengchankailiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
