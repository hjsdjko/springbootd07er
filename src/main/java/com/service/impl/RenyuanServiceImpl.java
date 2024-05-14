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


import com.dao.RenyuanDao;
import com.entity.RenyuanEntity;
import com.service.RenyuanService;
import com.entity.vo.RenyuanVO;
import com.entity.view.RenyuanView;

@Service("renyuanService")
public class RenyuanServiceImpl extends ServiceImpl<RenyuanDao, RenyuanEntity> implements RenyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenyuanEntity> page = this.selectPage(
                new Query<RenyuanEntity>(params).getPage(),
                new EntityWrapper<RenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenyuanEntity> wrapper) {
		  Page<RenyuanView> page =new Query<RenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RenyuanVO> selectListVO(Wrapper<RenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenyuanVO selectVO(Wrapper<RenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenyuanView> selectListView(Wrapper<RenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenyuanView selectView(Wrapper<RenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
