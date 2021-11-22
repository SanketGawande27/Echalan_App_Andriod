package com.example.echalan.model;

public class VehicleInfo {
    private int id;
    private String fullname;
    private  String mobileNo;
    private  String mailId;
    private String vechicleName;
    private String vechicleNo;
    private String address;

    public VehicleInfo(int id, String fullname, String mobileNo, String mailId, String vechicleName, String vechicleNo, String address) {
        this.id = id;
        this.fullname = fullname;
        this.mobileNo = mobileNo;
        this.mailId = mailId;
        this.vechicleName = vechicleName;
        this.vechicleNo = vechicleNo;
        this.address = address;
    }

    public VehicleInfo() {   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getVechicleName() {
        return vechicleName;
    }

    public void setVechicleName(String vechicleName) {
        this.vechicleName = vechicleName;
    }

    public String getVechicleNo() {
        return vechicleNo;
    }

    public void setVechicleNo(String vechicleNo) {
        this.vechicleNo = vechicleNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "VehicleInfo{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", mailId='" + mailId + '\'' +
                ", vechicleName='" + vechicleName + '\'' +
                ", vechicleNo='" + vechicleNo + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
