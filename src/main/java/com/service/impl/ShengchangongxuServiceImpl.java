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


import com.dao.ShengchangongxuDao;
import com.entity.ShengchangongxuEntity;
import com.service.ShengchangongxuService;
import com.entity.vo.ShengchangongxuVO;
import com.entity.view.ShengchangongxuView;

@Service("shengchangongxuService")
public class ShengchangongxuServiceImpl extends ServiceImpl<ShengchangongxuDao, ShengchangongxuEntity> implements ShengchangongxuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShengchangongxuEntity> page = this.selectPage(
                new Query<ShengchangongxuEntity>(params).getPage(),
                new EntityWrapper<ShengchangongxuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShengchangongxuEntity> wrapper) {
		  Page<ShengchangongxuView> page =new Query<ShengchangongxuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShengchangongxuVO> selectListVO(Wrapper<ShengchangongxuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShengchangongxuVO selectVO(Wrapper<ShengchangongxuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShengchangongxuView> selectListView(Wrapper<ShengchangongxuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShengchangongxuView selectView(Wrapper<ShengchangongxuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
