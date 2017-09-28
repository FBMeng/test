package cn.com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.model.CategoryModel;
import cn.com.service.CategoryService;
import common.model.Msg;

@Controller
public class CategoryController {

	@Resource
	private CategoryService catService;
	
	@ResponseBody
	@RequestMapping("/category")
	public Object category(){
		Msg msg = new Msg();
		Map<String,Object> map = new HashMap<>();
		msg.setCode(200);
		msg.setDescribe("商品类别列表");
		List<CategoryModel> list = new ArrayList<>();
		try{
			list = catService.category();
		}catch(Exception e){
			msg.setCode(100);
			msg.setDescribe("获取商品类别列表失败");
			return msg;
		}
		map.put("commodityCategorys",list);
		msg.setMap(map);
		
//		m.addAttribute("categoryList",list);
//		System.out.println(catService.category());
		return msg;
	}
}
