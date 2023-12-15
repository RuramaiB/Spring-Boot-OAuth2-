package zw.co.hushsoft.motorsparesbackend.OAuth2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oauth2")
public class OAuth2Controller {
    @PostMapping("/login")
    public String googleLogin() {
        return "redirect:localhost:8080/oauth2/authorization/google";
    }
}
