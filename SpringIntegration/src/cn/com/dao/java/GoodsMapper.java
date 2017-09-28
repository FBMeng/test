package cn.com.dao.java;

import java.util.List;

import cn.com.model.GoodsModel;

public interface GoodsMapper {

	public List<GoodsModel> select(GoodsModel goodsModel);
}
