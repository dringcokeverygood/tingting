package com.alsif.tingting.user.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class LoginResponseDto {
	private int userSeq;
	private String userEmail;
}
