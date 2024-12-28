package com.westsomsom.finalproject.controller;

import com.westsomsom.finalproject.MsgEntity;
import com.westsomsom.finalproject.repository.MemberRepository;
import jakarta.servlet.http.HttpSession;
import com.westsomsom.finalproject.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class UserController {

    @GetMapping("/mypage")
    public String getMyPage(HttpSession session, Model model) {
        // 세션에서 로그인한 사용자 정보 가져오기
        Member member = (Member) session.getAttribute("member");
        if (member == null) {
            model.addAttribute("error", "No logged-in user found");
            return "error"; // 에러 페이지로 이동
        }

        // 사용자 정보를 모델에 추가
        model.addAttribute("member", member);
        return "mypage"; // 마이페이지 뷰로 이동
    }

}
