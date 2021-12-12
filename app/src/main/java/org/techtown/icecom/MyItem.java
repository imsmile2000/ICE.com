package org.techtown.icecom;

public class MyItem {
    String name;
    String explain;
    String explain2;
    int resId;
    int resId2;
    public MyItem(String name, String explain,String explain2,int resId,int resId2){
        this.name=name;
        this.explain=explain;
        this.explain2=explain2;
        this.resId=resId;
        this.resId2=resId2;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getExplain(){
        return explain;
    }
    public void setExplain(String explain){
        this.explain=explain;
    }
    public String getExplain2(){
        return explain2;
    }
    public void setExplain2(String explain2){
        this.explain2=explain2;
    }
    public int getResId(){
        return resId;
    }
    public int getResId2(){return resId2;}
}
