package com.entity.model;

import com.entity.GuzhangweixiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 故障维修
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GuzhangweixiuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 维修设施
     */
    private String ruzhudengjiName;


    /**
     * 设施类型
     */
    private Integer guzhangweixiuTypes;


    /**
     * 详细地址
     */
    private String ruzhudengjiText;


    /**
     * 审核状态
     */
    private Integer guzhangweixiuYesnoTypes;


    /**
     * 审核结果
     */
    private String guzhangweixiuYesnoText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：维修设施
	 */
    public String getRuzhudengjiName() {
        return ruzhudengjiName;
    }


    /**
	 * 设置：维修设施
	 */
    public void setRuzhudengjiName(String ruzhudengjiName) {
        this.ruzhudengjiName = ruzhudengjiName;
    }
    /**
	 * 获取：设施类型
	 */
    public Integer getGuzhangweixiuTypes() {
        return guzhangweixiuTypes;
    }


    /**
	 * 设置：设施类型
	 */
    public void setGuzhangweixiuTypes(Integer guzhangweixiuTypes) {
        this.guzhangweixiuTypes = guzhangweixiuTypes;
    }
    /**
	 * 获取：详细地址
	 */
    public String getRuzhudengjiText() {
        return ruzhudengjiText;
    }


    /**
	 * 设置：详细地址
	 */
    public void setRuzhudengjiText(String ruzhudengjiText) {
        this.ruzhudengjiText = ruzhudengjiText;
    }
    /**
	 * 获取：审核状态
	 */
    public Integer getGuzhangweixiuYesnoTypes() {
        return guzhangweixiuYesnoTypes;
    }


    /**
	 * 设置：审核状态
	 */
    public void setGuzhangweixiuYesnoTypes(Integer guzhangweixiuYesnoTypes) {
        this.guzhangweixiuYesnoTypes = guzhangweixiuYesnoTypes;
    }
    /**
	 * 获取：审核结果
	 */
    public String getGuzhangweixiuYesnoText() {
        return guzhangweixiuYesnoText;
    }


    /**
	 * 设置：审核结果
	 */
    public void setGuzhangweixiuYesnoText(String guzhangweixiuYesnoText) {
        this.guzhangweixiuYesnoText = guzhangweixiuYesnoText;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
