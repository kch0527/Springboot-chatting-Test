package chat.example.login;

import org.springframework.web.bind.annotation.GetMapping;

public class LoginController {

    @GetMapping("/auth/login")
    public String loginForm(){
        return "loginForm";
    }
}
