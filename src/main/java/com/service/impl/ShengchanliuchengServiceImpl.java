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


import com.dao.ShengchanliuchengDao;
import com.entity.ShengchanliuchengEntity;
import com.service.ShengchanliuchengService;
import com.entity.vo.ShengchanliuchengVO;
import com.entity.view.ShengchanliuchengView;

@Service("shengchanliuchengService")
public class ShengchanliuchengServiceImpl extends ServiceImpl<ShengchanliuchengDao, ShengchanliuchengEntity> implements ShengchanliuchengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShengchanliuchengEntity> page = this.selectPage(
                new Query<ShengchanliuchengEntity>(params).getPage(),
                new EntityWrapper<ShengchanliuchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShengchanliuchengEntity> wrapper) {
		  Page<ShengchanliuchengView> page =new Query<ShengchanliuchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShengchanliuchengVO> selectListVO(Wrapper<ShengchanliuchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShengchanliuchengVO selectVO(Wrapper<ShengchanliuchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShengchanliuchengView> selectListView(Wrapper<ShengchanliuchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShengchanliuchengView selectView(Wrapper<ShengchanliuchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ShengchanliuchengEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ShengchanliuchengEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ShengchanliuchengEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
