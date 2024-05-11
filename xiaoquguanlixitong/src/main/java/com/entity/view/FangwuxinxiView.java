package com.entity.view;

import com.entity.FangwuxinxiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 房屋信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("fangwuxinxi")
public class FangwuxinxiView extends FangwuxinxiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 房屋类型的值
		*/
		private String fangwuxinxiValue;



	public FangwuxinxiView() {

	}

	public FangwuxinxiView(FangwuxinxiEntity fangwuxinxiEntity) {
		try {
			BeanUtils.copyProperties(this, fangwuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 房屋类型的值
			*/
			public String getFangwuxinxiValue() {
				return fangwuxinxiValue;
			}
			/**
			* 设置： 房屋类型的值
			*/
			public void setFangwuxinxiValue(String fangwuxinxiValue) {
				this.fangwuxinxiValue = fangwuxinxiValue;
			}










}
