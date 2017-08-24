package com.generator.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Material {
    private Long id;

    private String key;

    private String name;

    private Long authoruid;

    private Short duration;

    private Short playstyle;

    private String description;

    private Byte hot;

    private Date validdate;

    private Byte status;

    private BigDecimal price;

    private String previewpic;

    private String previewmp4;

    private Date createtime;

    private Integer buytimes;

    private Short type;

    private String icon;

    private String themetype;

    private Long uid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getAuthoruid() {
        return authoruid;
    }

    public void setAuthoruid(Long authoruid) {
        this.authoruid = authoruid;
    }

    public Short getDuration() {
        return duration;
    }

    public void setDuration(Short duration) {
        this.duration = duration;
    }

    public Short getPlaystyle() {
        return playstyle;
    }

    public void setPlaystyle(Short playstyle) {
        this.playstyle = playstyle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Byte getHot() {
        return hot;
    }

    public void setHot(Byte hot) {
        this.hot = hot;
    }

    public Date getValiddate() {
        return validdate;
    }

    public void setValiddate(Date validdate) {
        this.validdate = validdate;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPreviewpic() {
        return previewpic;
    }

    public void setPreviewpic(String previewpic) {
        this.previewpic = previewpic == null ? null : previewpic.trim();
    }

    public String getPreviewmp4() {
        return previewmp4;
    }

    public void setPreviewmp4(String previewmp4) {
        this.previewmp4 = previewmp4 == null ? null : previewmp4.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getBuytimes() {
        return buytimes;
    }

    public void setBuytimes(Integer buytimes) {
        this.buytimes = buytimes;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getThemetype() {
        return themetype;
    }

    public void setThemetype(String themetype) {
        this.themetype = themetype == null ? null : themetype.trim();
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }
}