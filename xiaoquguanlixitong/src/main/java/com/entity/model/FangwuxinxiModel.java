package com.entity.model;

import com.entity.FangwuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 房屋信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class FangwuxinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 房屋名称
     */
    private String fangwuxinxiName;


    /**
     * 房屋图片
     */
    private String fangwuxinxiPhoto;


    /**
     * 房屋类型
     */
    private Integer fangwuxinxiTypes;


    /**
     * 房屋大小
     */
    private String fangwuxinxiSize;


    /**
     * 房屋布局
     */
    private String fangwuxinxiBuju;


    /**
     * 详情
     */
    private String fangwuxinxiContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：房屋名称
	 */
    public String getFangwuxinxiName() {
        return fangwuxinxiName;
    }


    /**
	 * 设置：房屋名称
	 */
    public void setFangwuxinxiName(String fangwuxinxiName) {
        this.fangwuxinxiName = fangwuxinxiName;
    }
    /**
	 * 获取：房屋图片
	 */
    public String getFangwuxinxiPhoto() {
        return fangwuxinxiPhoto;
    }


    /**
	 * 设置：房屋图片
	 */
    public void setFangwuxinxiPhoto(String fangwuxinxiPhoto) {
        this.fangwuxinxiPhoto = fangwuxinxiPhoto;
    }
    /**
	 * 获取：房屋类型
	 */
    public Integer getFangwuxinxiTypes() {
        return fangwuxinxiTypes;
    }


    /**
	 * 设置：房屋类型
	 */
    public void setFangwuxinxiTypes(Integer fangwuxinxiTypes) {
        this.fangwuxinxiTypes = fangwuxinxiTypes;
    }
    /**
	 * 获取：房屋大小
	 */
    public String getFangwuxinxiSize() {
        return fangwuxinxiSize;
    }


    /**
	 * 设置：房屋大小
	 */
    public void setFangwuxinxiSize(String fangwuxinxiSize) {
        this.fangwuxinxiSize = fangwuxinxiSize;
    }
    /**
	 * 获取：房屋布局
	 */
    public String getFangwuxinxiBuju() {
        return fangwuxinxiBuju;
    }


    /**
	 * 设置：房屋布局
	 */
    public void setFangwuxinxiBuju(String fangwuxinxiBuju) {
        this.fangwuxinxiBuju = fangwuxinxiBuju;
    }
    /**
	 * 获取：详情
	 */
    public String getFangwuxinxiContent() {
        return fangwuxinxiContent;
    }


    /**
	 * 设置：详情
	 */
    public void setFangwuxinxiContent(String fangwuxinxiContent) {
        this.fangwuxinxiContent = fangwuxinxiContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
