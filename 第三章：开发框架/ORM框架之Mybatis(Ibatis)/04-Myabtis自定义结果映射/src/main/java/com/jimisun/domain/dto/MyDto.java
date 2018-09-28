package com.jimisun.domain.dto;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 09:48 2018-09-24
 * @Modified By:
 */
public class MyDto {


    private Integer myid;
    private String myusername;


    public Integer getMyid() {
        return myid;
    }

    public void setMyid(Integer myid) {
        this.myid = myid;
    }

    public String getMyusername() {
        return myusername;
    }

    public void setMyusername(String myusername) {
        this.myusername = myusername;
    }


    @Override
    public String toString() {
        return "MyDto{" +
                "myid=" + myid +
                ", myusername='" + myusername + '\'' +
                '}';
    }
}
