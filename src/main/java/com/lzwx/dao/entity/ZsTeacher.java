package com.lzwx.dao.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "zsteacher")
public class ZsTeacher implements Serializable{
    @Id
    @GeneratedValue
    private Long id;
    @Column(length = 50)
    private String name;
    @Column(length = 50)
    private String sex;
    @OneToOne
    @JoinColumn
    private Base base;
    private Long majorid;
    private Long schoolid;
    @Column(length = 50)
    private String phone;
    private Date enteringtime;
    private Long teacherid;
    @Column(length = 50)
    private String audits;
    @Column(length = 50)
    private String situation;
    @Column(length = 50)
    private Byte status;
    private Date createtime;
    private Date modifiedtime;

    public ZsTeacher(){
        super();
    }
    public ZsTeacher(Long id,String name,String sex,Long majorid,Long schoolid,String phone,Date enteringtime,Long teacherid,String audits,String situation,Byte status,Date createtime,Date modifiedtime){
        this.id=id;this.name=name;this.sex=sex;this.majorid=majorid;this.schoolid=schoolid;this.phone=phone;this.enteringtime=enteringtime;this.teacherid=teacherid;this.audits=audits;this.situation=situation;this.status=status;this.createtime=createtime;this.modifiedtime=modifiedtime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Long getMajorid() {
        return majorid;
    }

    public void setMajorid(Long majorid) {
        this.majorid = majorid;
    }

    public Long getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(Long schoolid) {
        this.schoolid = schoolid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    public Date getEnteringtime() {
        return enteringtime;
    }

    public void setEnteringtime(Date enteringtime) {
        this.enteringtime = enteringtime;
    }

    public Long getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Long teacherid) {
        this.teacherid = teacherid;
    }

    public String getAudits() {
        return audits;
    }

    public void setAudits(String audits) {
        this.audits = audits;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(Date modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }
}
