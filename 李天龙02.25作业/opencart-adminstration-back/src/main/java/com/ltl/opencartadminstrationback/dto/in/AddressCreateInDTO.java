package com.ltl.opencartadminstrationback.dto.in;

public class AddressCreateInDTO {

    private Integer customerid;
    private String receivername;
    private String content;
    private String tag;

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getReceivername() {
        return receivername;
    }

    public void setReceivername(String receivername) {
        this.receivername = receivername;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "AddressCreateInDTO{" +
                "customerid=" + customerid +
                ", receivername='" + receivername + '\'' +
                ", content='" + content + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }

    public AddressCreateInDTO(Integer customerid, String receivername, String content, String tag) {
        this.customerid = customerid;
        this.receivername = receivername;
        this.content = content;
        this.tag = tag;
    }

    public AddressCreateInDTO() {
    }
}
