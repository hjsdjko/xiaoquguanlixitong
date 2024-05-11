package com.entity.model;

import com.entity.RuzhudengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 入住登记
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class RuzhudengjiModel implements Serializable {
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
     * 入住地址
     */
    private String ruzhudengjiName;


    /**
     * 房屋图片
     */
    private String ruzhudengjiPhoto;


    /**
     * 入住房屋类型
     */
    private Integer ruzhudengjiTypes;


    /**
     * 入住时间
     */
    private String ruzhudengjiShijian;


    /**
     * 入住人员
     */
    private String ruzhudengjiRenyuan;


    /**
     * 详情
     */
    private String ruzhudengjiContent;


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
	 * 获取：入住地址
	 */
    public String getRuzhudengjiName() {
        return ruzhudengjiName;
    }


    /**
	 * 设置：入住地址
	 */
    public void setRuzhudengjiName(String ruzhudengjiName) {
        this.ruzhudengjiName = ruzhudengjiName;
    }
    /**
	 * 获取：房屋图片
	 */
    public String getRuzhudengjiPhoto() {
        return ruzhudengjiPhoto;
    }


    /**
	 * 设置：房屋图片
	 */
    public void setRuzhudengjiPhoto(String ruzhudengjiPhoto) {
        this.ruzhudengjiPhoto = ruzhudengjiPhoto;
    }
    /**
	 * 获取：入住房屋类型
	 */
    public Integer getRuzhudengjiTypes() {
        return ruzhudengjiTypes;
    }


    /**
	 * 设置：入住房屋类型
	 */
    public void setRuzhudengjiTypes(Integer ruzhudengjiTypes) {
        this.ruzhudengjiTypes = ruzhudengjiTypes;
    }
    /**
	 * 获取：入住时间
	 */
    public String getRuzhudengjiShijian() {
        return ruzhudengjiShijian;
    }


    /**
	 * 设置：入住时间
	 */
    public void setRuzhudengjiShijian(String ruzhudengjiShijian) {
        this.ruzhudengjiShijian = ruzhudengjiShijian;
    }
    /**
	 * 获取：入住人员
	 */
    public String getRuzhudengjiRenyuan() {
        return ruzhudengjiRenyuan;
    }


    /**
	 * 设置：入住人员
	 */
    public void setRuzhudengjiRenyuan(String ruzhudengjiRenyuan) {
        this.ruzhudengjiRenyuan = ruzhudengjiRenyuan;
    }
    /**
	 * 获取：详情
	 */
    public String getRuzhudengjiContent() {
        return ruzhudengjiContent;
    }


    /**
	 * 设置：详情
	 */
    public void setRuzhudengjiContent(String ruzhudengjiContent) {
        this.ruzhudengjiContent = ruzhudengjiContent;
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
