package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 房屋信息
 *
 * @author 
 * @email
 */
@TableName("fangwuxinxi")
public class FangwuxinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FangwuxinxiEntity() {

	}

	public FangwuxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 房屋名称
     */
    @TableField(value = "fangwuxinxi_name")

    private String fangwuxinxiName;


    /**
     * 房屋图片
     */
    @TableField(value = "fangwuxinxi_photo")

    private String fangwuxinxiPhoto;


    /**
     * 房屋类型
     */
    @TableField(value = "fangwuxinxi_types")

    private Integer fangwuxinxiTypes;


    /**
     * 房屋大小
     */
    @TableField(value = "fangwuxinxi_size")

    private String fangwuxinxiSize;


    /**
     * 房屋布局
     */
    @TableField(value = "fangwuxinxi_buju")

    private String fangwuxinxiBuju;


    /**
     * 详情
     */
    @TableField(value = "fangwuxinxi_content")

    private String fangwuxinxiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：房屋名称
	 */
    public String getFangwuxinxiName() {
        return fangwuxinxiName;
    }


    /**
	 * 获取：房屋名称
	 */

    public void setFangwuxinxiName(String fangwuxinxiName) {
        this.fangwuxinxiName = fangwuxinxiName;
    }
    /**
	 * 设置：房屋图片
	 */
    public String getFangwuxinxiPhoto() {
        return fangwuxinxiPhoto;
    }


    /**
	 * 获取：房屋图片
	 */

    public void setFangwuxinxiPhoto(String fangwuxinxiPhoto) {
        this.fangwuxinxiPhoto = fangwuxinxiPhoto;
    }
    /**
	 * 设置：房屋类型
	 */
    public Integer getFangwuxinxiTypes() {
        return fangwuxinxiTypes;
    }


    /**
	 * 获取：房屋类型
	 */

    public void setFangwuxinxiTypes(Integer fangwuxinxiTypes) {
        this.fangwuxinxiTypes = fangwuxinxiTypes;
    }
    /**
	 * 设置：房屋大小
	 */
    public String getFangwuxinxiSize() {
        return fangwuxinxiSize;
    }


    /**
	 * 获取：房屋大小
	 */

    public void setFangwuxinxiSize(String fangwuxinxiSize) {
        this.fangwuxinxiSize = fangwuxinxiSize;
    }
    /**
	 * 设置：房屋布局
	 */
    public String getFangwuxinxiBuju() {
        return fangwuxinxiBuju;
    }


    /**
	 * 获取：房屋布局
	 */

    public void setFangwuxinxiBuju(String fangwuxinxiBuju) {
        this.fangwuxinxiBuju = fangwuxinxiBuju;
    }
    /**
	 * 设置：详情
	 */
    public String getFangwuxinxiContent() {
        return fangwuxinxiContent;
    }


    /**
	 * 获取：详情
	 */

    public void setFangwuxinxiContent(String fangwuxinxiContent) {
        this.fangwuxinxiContent = fangwuxinxiContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Fangwuxinxi{" +
            "id=" + id +
            ", fangwuxinxiName=" + fangwuxinxiName +
            ", fangwuxinxiPhoto=" + fangwuxinxiPhoto +
            ", fangwuxinxiTypes=" + fangwuxinxiTypes +
            ", fangwuxinxiSize=" + fangwuxinxiSize +
            ", fangwuxinxiBuju=" + fangwuxinxiBuju +
            ", fangwuxinxiContent=" + fangwuxinxiContent +
            ", createTime=" + createTime +
        "}";
    }
}
