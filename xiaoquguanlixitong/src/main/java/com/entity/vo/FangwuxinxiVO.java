package com.entity.vo;

import com.entity.FangwuxinxiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 房屋信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("fangwuxinxi")
public class FangwuxinxiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
