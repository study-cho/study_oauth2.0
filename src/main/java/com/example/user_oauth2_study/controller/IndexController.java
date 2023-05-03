package com.example.user_oauth2_study.controller;

import com.example.user_oauth2_study.domain.Account;
import com.example.user_oauth2_study.repository.AccountRepo;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final AccountRepo accountRepo;

    public IndexController(BCryptPasswordEncoder bCryptPasswordEncoder, AccountRepo accountRepo) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.accountRepo = accountRepo;
    }

    @GetMapping({"", "/"})
    public String index() {
        return "index";
    }

    @GetMapping("/joinForm")
    public String joinForm(Model model) {
        model.addAttribute("account", new Account());
        return "joinForm";
    }

    @PostMapping("/join")
    public String join(Account account) {
        // 권한 설정
        account.setRole("ROLE_USER");

        // 비밀번호 암호화
        String rawPwd = account.getPassword();
        String encodePwd = bCryptPasswordEncoder.encode(rawPwd);
        account.setPassword(encodePwd);

        // 저장
        accountRepo.save(account);

        return "redirect:/loginForm";
    }

    @GetMapping("/loginForm")
    public String login() {
        return "loginForm";
    }

    @GetMapping("/user")
    public @ResponseBody String user() {
        return "user";
    }

    @GetMapping("/manager")
    public @ResponseBody String manager() {
        return "manager";
    }

    @GetMapping("/admin")
    public @ResponseBody String admin() {
        return "admin";
    }
}
