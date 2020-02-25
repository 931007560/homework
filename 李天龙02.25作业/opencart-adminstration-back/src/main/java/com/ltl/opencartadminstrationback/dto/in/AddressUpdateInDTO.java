package com.ltl.opencartadminstrationback.dto.in;

public class AddressUpdateInDTO {

    private Integer addressid;
    private Integer customerid;
    private String receivername;
    private String content;
    private String tag;

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

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


    public AddressUpdateInDTO(Integer addressid, Integer customerid, String receivername, String content, String tag) {
        this.addressid = addressid;
        this.customerid = customerid;
        this.receivername = receivername;
        this.content = content;
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "AddressUpdateInDTO{" +
                "addressid=" + addressid +
                ", customerid=" + customerid +
                ", receivername='" + receivername + '\'' +
                ", content='" + content + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }

    public AddressUpdateInDTO() {
    }
}
