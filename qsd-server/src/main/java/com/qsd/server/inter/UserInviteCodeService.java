package com.qsd.server.inter;

import com.qsd.model.UserInviteCode;

public interface UserInviteCodeService {

	public String generate(int paymentId, int userId);

	public Integer create(UserInviteCode userInviteCode);
}
