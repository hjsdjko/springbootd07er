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


import com.dao.KanbanxinxiDao;
import com.entity.KanbanxinxiEntity;
import com.service.KanbanxinxiService;
import com.entity.vo.KanbanxinxiVO;
import com.entity.view.KanbanxinxiView;

@Service("kanbanxinxiService")
public class KanbanxinxiServiceImpl extends ServiceImpl<KanbanxinxiDao, KanbanxinxiEntity> implements KanbanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KanbanxinxiEntity> page = this.selectPage(
                new Query<KanbanxinxiEntity>(params).getPage(),
                new EntityWrapper<KanbanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KanbanxinxiEntity> wrapper) {
		  Page<KanbanxinxiView> page =new Query<KanbanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KanbanxinxiVO> selectListVO(Wrapper<KanbanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KanbanxinxiVO selectVO(Wrapper<KanbanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KanbanxinxiView> selectListView(Wrapper<KanbanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KanbanxinxiView selectView(Wrapper<KanbanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
