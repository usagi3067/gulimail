package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

/**
 * 品牌
 * 
 * @author dango
 * @email a15521474798@outlook.com
 * @date 2023-03-09 15:06:47
 */


@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 */
	@TableId
	private Long brandId;
	/**
	 * 品牌名
	 */

	@NotBlank(message = "品牌名必须提交")
	private String name;
	/**
	 * 品牌logo地址
	 */
	@URL(message = "logo必须是一个合法的URL地址")
	private String logo;
	/**
	 * 介绍
	 */
	private String descript;
	/**
	 * 显示状态[0-不显示；1-显示]
	 */
	private Integer showStatus;
	/**
	 * 检索首字母
	 */
	@Pattern(regexp = "^[a-zA-Z]$",message = "检索首字母必须是一个字母")
	private String firstLetter;
	/**
	 * 排序
	 */
	@Min(value = 0,message = "排序必须是一个正整数")
	private Integer sort;

}
