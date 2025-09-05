package br.com.carstore.controller;

import br.com.carstore.dto.CarDTO;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @PostMapping("/create-car")
    public String createCar(@Valid @ModelAttribute("carDTO") CarDTO car,
                            BindingResult result,
                            Model model) {

        if (result.hasErrors()) {
            return "index"; // volta pro formulário
        }

        // aqui você chamaria o service/repository para salvar no banco
        return "redirect:/dashboard";
    }

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("carDTO", new CarDTO()); // passa um objeto vazio para o form
        return "index";
    }
}
