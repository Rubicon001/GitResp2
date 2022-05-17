package com.mj.jk.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mj.jk.mapper.DictTypeMapper;
import com.mj.jk.pojo.po.DictType;
import com.mj.jk.pojo.query.DictTypeQuery;
import com.mj.jk.service.DictTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;


@Service
@Transactional
public class DictTypeServiceImpl extends ServiceImpl<DictTypeMapper, DictType> implements DictTypeService {

    @Autowired
    private DictTypeMapper mapper;

    @Override
    public List<DictType> list(DictTypeQuery query) {

        LambdaQueryWrapper<DictType> wrapper = new LambdaQueryWrapper<>();

        String keyword = query.getKeyword();
        System.out.println(keyword);
        System.out.println(query.getPage());
        System.out.println(query.getSize());
        if (!StringUtils.isEmpty(keyword)) {
            wrapper.like(DictType::getName, keyword).or().like(DictType::getValue, keyword).or().like(DictType::getIntro, keyword);
        }

        Page<DictType> page = new Page<>(query.getPage(), query.getSize());

        return mapper.selectPage(page, wrapper).getRecords();
    }
}
