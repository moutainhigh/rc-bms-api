package com.zcsoft.rc.bms.api.user.entity;

import org.hibernate.validator.constraints.NotEmpty;

public class RoleDetailsReq {

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
        final StringBuilder sb = new StringBuilder("RoleDetailsReq{");
        sb.append("id='").append(id).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
