
package br.eddyportfolio.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EddyController {
    
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
