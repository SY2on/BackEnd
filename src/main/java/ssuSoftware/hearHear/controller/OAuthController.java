package ssuSoftware.hearHear.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ssuSoftware.user.auth.dto.LoginResponse;
import ssuSoftware.user.oauth.OauthService;
import ssuSoftware.user.oauth.dto.KakaoUserInfo;

@RestController
@RequiredArgsConstructor
@Slf4j
@Tag(name="로그인", description = "로그인 관련 api")
public class OAuthController {

    private final OauthService oauthService;


    @Operation(summary = "OAuth로그인 api" , description = "회원정보와 /accessToken와 /회원가입인지 로그인인지 상태 /전달")
    @PostMapping("/login/{provider}")
    public ResponseEntity<LoginResponse> login(@PathVariable String provider, @RequestBody KakaoUserInfo kakaoUserInfo) {
        LoginResponse loginResponse = oauthService.loginWithToken(provider, kakaoUserInfo);
        return ResponseEntity.ok().body(loginResponse);
    }


}


