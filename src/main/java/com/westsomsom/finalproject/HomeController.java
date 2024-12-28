package com.westsomsom.finalproject;

//import ch.qos.logback.core.model.Model;
import com.westsomsom.finalproject.service.KakaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

//완료
@RequiredArgsConstructor //final로 선언된 필드를 이용하여 생성자를 자동으로 생성 -> 생성자 직접 안 적옫 돼서 코드 간결해짐
@Controller
public class HomeController {
    private final KakaoService kakaoService;

    @GetMapping("/")
    public String login(Model model) {
        String kakaoUrl = kakaoService.getKakaoLogin();
        System.out.println("Kakao URL: " + kakaoUrl);  // 이 라인 추가

        //model.addAttribute("kakaoUrl", kakaoUrl);
        model.addAttribute("kakaoUrl", kakaoService.getKakaoLogin());

        return "index"; //스프링은 이 뷰 이름을 찾아서 해당 뷰를 렌더링 "index.html"
    }

    //추가된 내용
    @GetMapping("/info-form")
    public String showInfoForm() {
        return "info-form";
    }
}
