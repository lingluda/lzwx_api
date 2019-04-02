//
//package com.lzwx.dao.combine;
//
//import com.lzwx.dao.entity.Base;
//import com.lzwx.dao.entity.ZsTeacher;
//
//import java.io.Serializable;
//
//public class TeacherInfo implements Serializable{
//    private Base base;
//    private ZsTeacher zsTeacher;
//    public TeacherInfo(){
//    }
//    public TeacherInfo(Base base){
//        ZsTeacher zsTeacher = new ZsTeacher();
//        this.base=base;this.zsTeacher=zsTeacher;
//    }
//    public TeacherInfo(ZsTeacher zsTeacher){
//        Base base = new Base();
//        this.base=base;this.zsTeacher=zsTeacher;
//    }
//    public TeacherInfo(Base base,ZsTeacher zsTeacher){
//        this.base=base;this.zsTeacher=zsTeacher;
//    }
//
//    public Base getBase() {
//        return base;
//    }
//
//    public void setBase(Base base) {
//        this.base = base;
//    }
//
//    public ZsTeacher getZsTeacher() {
//        return zsTeacher;
//    }
//
//    public void setZsTeacher(ZsTeacher zsTeacher) {
//        this.zsTeacher = zsTeacher;
//    }
//}
//
