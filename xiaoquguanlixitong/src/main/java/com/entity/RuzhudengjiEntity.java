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
 * 入住登记
 *
 * @author 
 * @email
 */
@TableName("ruzhudengji")
public class RuzhudengjiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public RuzhudengjiEntity() {

	}

	public RuzhudengjiEntity(T t) {
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
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 入住地址
     */
    @TableField(value = "ruzhudengji_name")

    private String ruzhudengjiName;


    /**
     * 房屋图片
     */
    @TableField(value = "ruzhudengji_photo")

    private String ruzhudengjiPhoto;


    /**
     * 入住房屋类型
     */
    @TableField(value = "ruzhudengji_types")

    private Integer ruzhudengjiTypes;


    /**
     * 入住时间
     */
    @TableField(value = "ruzhudengji_shijian")

    private String ruzhudengjiShijian;


    /**
     * 入住人员
     */
    @TableField(value = "ruzhudengji_renyuan")

    private String ruzhudengjiRenyuan;


    /**
     * 详情
     */
    @TableField(value = "ruzhudengji_content")

    private String ruzhudengjiContent;


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
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：入住地址
	 */
    public String getRuzhudengjiName() {
        return ruzhudengjiName;
    }


    /**
	 * 获取：入住地址
	 */

    public void setRuzhudengjiName(String ruzhudengjiName) {
        this.ruzhudengjiName = ruzhudengjiName;
    }
    /**
	 * 设置：房屋图片
	 */
    public String getRuzhudengjiPhoto() {
        return ruzhudengjiPhoto;
    }


    /**
	 * 获取：房屋图片
	 */

    public void setRuzhudengjiPhoto(String ruzhudengjiPhoto) {
        this.ruzhudengjiPhoto = ruzhudengjiPhoto;
    }
    /**
	 * 设置：入住房屋类型
	 */
    public Integer getRuzhudengjiTypes() {
        return ruzhudengjiTypes;
    }


    /**
	 * 获取：入住房屋类型
	 */

    public void setRuzhudengjiTypes(Integer ruzhudengjiTypes) {
        this.ruzhudengjiTypes = ruzhudengjiTypes;
    }
    /**
	 * 设置：入住时间
	 */
    public String getRuzhudengjiShijian() {
        return ruzhudengjiShijian;
    }


    /**
	 * 获取：入住时间
	 */

    public void setRuzhudengjiShijian(String ruzhudengjiShijian) {
        this.ruzhudengjiShijian = ruzhudengjiShijian;
    }
    /**
	 * 设置：入住人员
	 */
    public String getRuzhudengjiRenyuan() {
        return ruzhudengjiRenyuan;
    }


    /**
	 * 获取：入住人员
	 */

    public void setRuzhudengjiRenyuan(String ruzhudengjiRenyuan) {
        this.ruzhudengjiRenyuan = ruzhudengjiRenyuan;
    }
    /**
	 * 设置：详情
	 */
    public String getRuzhudengjiContent() {
        return ruzhudengjiContent;
    }


    /**
	 * 获取：详情
	 */

    public void setRuzhudengjiContent(String ruzhudengjiContent) {
        this.ruzhudengjiContent = ruzhudengjiContent;
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
        return "Ruzhudengji{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", ruzhudengjiName=" + ruzhudengjiName +
            ", ruzhudengjiPhoto=" + ruzhudengjiPhoto +
            ", ruzhudengjiTypes=" + ruzhudengjiTypes +
            ", ruzhudengjiShijian=" + ruzhudengjiShijian +
            ", ruzhudengjiRenyuan=" + ruzhudengjiRenyuan +
            ", ruzhudengjiContent=" + ruzhudengjiContent +
            ", createTime=" + createTime +
        "}";
    }
}
