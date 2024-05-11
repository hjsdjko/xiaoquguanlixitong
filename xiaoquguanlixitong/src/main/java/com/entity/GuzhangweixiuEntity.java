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
 * 故障维修
 *
 * @author 
 * @email
 */
@TableName("guzhangweixiu")
public class GuzhangweixiuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GuzhangweixiuEntity() {

	}

	public GuzhangweixiuEntity(T t) {
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
     * 维修设施
     */
    @TableField(value = "ruzhudengji_name")

    private String ruzhudengjiName;


    /**
     * 设施类型
     */
    @TableField(value = "guzhangweixiu_types")

    private Integer guzhangweixiuTypes;


    /**
     * 详细地址
     */
    @TableField(value = "ruzhudengji_text")

    private String ruzhudengjiText;


    /**
     * 审核状态
     */
    @TableField(value = "guzhangweixiu_yesno_types")

    private Integer guzhangweixiuYesnoTypes;


    /**
     * 审核结果
     */
    @TableField(value = "guzhangweixiu_yesno_text")

    private String guzhangweixiuYesnoText;


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
	 * 设置：维修设施
	 */
    public String getRuzhudengjiName() {
        return ruzhudengjiName;
    }


    /**
	 * 获取：维修设施
	 */

    public void setRuzhudengjiName(String ruzhudengjiName) {
        this.ruzhudengjiName = ruzhudengjiName;
    }
    /**
	 * 设置：设施类型
	 */
    public Integer getGuzhangweixiuTypes() {
        return guzhangweixiuTypes;
    }


    /**
	 * 获取：设施类型
	 */

    public void setGuzhangweixiuTypes(Integer guzhangweixiuTypes) {
        this.guzhangweixiuTypes = guzhangweixiuTypes;
    }
    /**
	 * 设置：详细地址
	 */
    public String getRuzhudengjiText() {
        return ruzhudengjiText;
    }


    /**
	 * 获取：详细地址
	 */

    public void setRuzhudengjiText(String ruzhudengjiText) {
        this.ruzhudengjiText = ruzhudengjiText;
    }
    /**
	 * 设置：审核状态
	 */
    public Integer getGuzhangweixiuYesnoTypes() {
        return guzhangweixiuYesnoTypes;
    }


    /**
	 * 获取：审核状态
	 */

    public void setGuzhangweixiuYesnoTypes(Integer guzhangweixiuYesnoTypes) {
        this.guzhangweixiuYesnoTypes = guzhangweixiuYesnoTypes;
    }
    /**
	 * 设置：审核结果
	 */
    public String getGuzhangweixiuYesnoText() {
        return guzhangweixiuYesnoText;
    }


    /**
	 * 获取：审核结果
	 */

    public void setGuzhangweixiuYesnoText(String guzhangweixiuYesnoText) {
        this.guzhangweixiuYesnoText = guzhangweixiuYesnoText;
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
        return "Guzhangweixiu{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", ruzhudengjiName=" + ruzhudengjiName +
            ", guzhangweixiuTypes=" + guzhangweixiuTypes +
            ", ruzhudengjiText=" + ruzhudengjiText +
            ", guzhangweixiuYesnoTypes=" + guzhangweixiuYesnoTypes +
            ", guzhangweixiuYesnoText=" + guzhangweixiuYesnoText +
            ", createTime=" + createTime +
        "}";
    }
}
