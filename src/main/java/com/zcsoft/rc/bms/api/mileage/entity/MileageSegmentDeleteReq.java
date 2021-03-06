package com.zcsoft.rc.bms.api.mileage.entity;

import org.hibernate.validator.constraints.NotEmpty;

public class MileageSegmentDeleteReq {

    /**
     * id
     */
    @NotEmpty
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MileageSegmentDeleteReq{");
        sb.append("id='").append(id).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
