package cn.com.model;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.springframework.stereotype.Component;

@Component
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CategoryModel {

	private Integer cateId;
	private String cateName;

	
	public Integer getCateId() {
		return cateId;
	}
	public void setCateId(Integer cateId) {
		this.cateId = cateId;
	}
	public String getCateName() {
		return cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}


	
}
