package cn.com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.model.GoodsModel;
import cn.com.service.GoodsService;
import common.model.Msg;

@Controller
public class GoodsController {

	@Resource
	private GoodsService goodsService;
	
	@ResponseBody
	@RequestMapping("/goods")
	public Object goods(Model model,
			@RequestParam(value="goodsId",required=false)Integer goodsId,
			@RequestParam(value="cateId",required=false)Integer cateId){
		Msg msg = new Msg();
		Map<String,Object> map = new HashMap<>();
		List<GoodsModel> goodList = new ArrayList<>();
		
		msg.setCode(200);
		msg.setDescribe("商品信息");
		GoodsModel goodsModel = new GoodsModel();
		goodsModel.setCateId(cateId);
		goodsModel.setId(goodsId);
		
		goodList = goodsService.goodService(goodsModel);
		map.put("goodList",goodList);
		msg.setMap(map);
//		goodsModel.setId("123");
//		model.addAttribute(goodsModel);
		return msg;
	}
}
