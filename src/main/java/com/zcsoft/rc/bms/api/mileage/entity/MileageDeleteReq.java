package com.zcsoft.rc.bms.api.mileage.entity;

public class MileageDeleteReq {

    /**
     * id
     */
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MileageDeteleReq{");
        sb.append("id='").append(id).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
