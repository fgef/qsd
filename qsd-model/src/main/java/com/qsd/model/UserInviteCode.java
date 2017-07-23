package com.qsd.model;

import java.util.Date;

public class UserInviteCode {
    /**
     * user_invite_code.id;
     */
    private Integer id;

    /**
     * user_invite_code.order_item_id;订单ID
     */
    private Integer orderItemId;

    /**
     * user_invite_code.invite_code;邀请码
     */
    private String inviteCode;

    /**
     * user_invite_code.create_time;创建时间
     */
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode == null ? null : inviteCode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}