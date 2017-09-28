package cn.com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.dao.java.GoodsMapper;
import cn.com.model.GoodsModel;

@Service
public class GoodsService {

	@Resource
	private GoodsMapper mapper;

	public List<GoodsModel> goodService(GoodsModel goodsModel){
		
		return mapper.select(goodsModel);
	}
}
