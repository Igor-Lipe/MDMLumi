package br.com.lumimdm.MDM_Lumi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@GetMapping("/logout")
	public String logout(HttpSession session) {
	    session.invalidate(); // Encerra a sessão atual
	    return "redirect:/login";
	}
	
    @GetMapping("/login")
    public String login() {
        return "login"; // Retorna o arquivo login.jsp da pasta /WEB-INF/jsp/login.jsp
    }

    @GetMapping("/home")
    public String home() {
        return "home"; // Retorna home.jsp (página após login bem-sucedido)
    }
    
    @GetMapping("/blockapps")
    public String blockapps() {
        return "blockapps"; // WEB-INF/jsp/blockapps.jsp
    }
    
    @GetMapping("/wallpaperoff")
    public String wallpaperoff() {
        return "wallpaperoff"; // WEB-INF/jsp/wallpaperoff.jsp
    }
    
    @GetMapping("/thenightisyoung")
    public String thenightisyoung() {
        return "thenightisyoung"; // WEB-INF/jsp/theninghtisyoung.jsp
    }
    
    @GetMapping("/unauthorizedstudent")
    public String unauthorizedstudent() {
        return "unauthorizedstudent"; // WEB-INF/jsp/unauthorized.jsp
    }
    
    @GetMapping("/goaway")
    public String goaway() {
        return "goaway"; // WEB-INF/jsp/goway.jsp
    }
    
    @GetMapping("/nono")
    public String nono() {
        return "nono"; // WEB-INF/jsp/nono.jsp
    }
    
    @GetMapping("/admgogle")
    public String admgogle() {
        return "admgogle"; // WEB-INF/jsp/admgoogle.jsp
    }
    
    @GetMapping("/findwifi")
    public String findwifi() {
        return "findwifi"; // WEB-INF/jsp/blockapps.jsp
    }
}
