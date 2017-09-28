package cn.com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.dao.java.CategoryMapper;
import cn.com.model.CategoryModel;
import cn.com.service.inter.CategoryInter;

@Service
public class CategoryService implements CategoryInter{

	@Resource
	private CategoryMapper mapper;
	
	public List<CategoryModel> category(){
		
		return mapper.select();
	}
}
