package cn.com.model;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.springframework.stereotype.Component;

@Component
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class GoodsModel {

	private Integer id;
	private String goodsName;
	private Integer goodsPrice;
	private Integer goodsNumber;
	private String goodsAddress;
	private Integer goodsFreight;
	private Integer	cateId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public Integer getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(Integer goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public Integer getGoodsNumber() {
		return goodsNumber;
	}
	public void setGoodsNumber(Integer goodsNumber) {
		this.goodsNumber = goodsNumber;
	}
	public String getGoodsAddress() {
		return goodsAddress;
	}
	public void setGoodsAddress(String goodsAddress) {
		this.goodsAddress = goodsAddress;
	}
	public Integer getGoodsFreight() {
		return goodsFreight;
	}
	public void setGoodsFreight(Integer goodsFreight) {
		this.goodsFreight = goodsFreight;
	}
	public Integer getCateId() {
		return cateId;
	}
	public void setCateId(Integer cateId) {
		this.cateId = cateId;
	}
	
}
