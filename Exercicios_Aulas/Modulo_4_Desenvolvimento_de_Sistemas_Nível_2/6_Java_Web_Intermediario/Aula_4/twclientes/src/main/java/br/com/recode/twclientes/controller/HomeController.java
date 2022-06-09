package br.com.recode.twclientes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// Passando do controller para a view
//import1 import org.springframework.web.bind.annotation.RequestMethod;
//import2 import org.springframework.ui.Model;
//import3 import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

// Passando da view para o controller
//import4 import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/")
public class HomeController {
  
  //import1 @RequestMapping(path = "/", method = RequestMethod.GET)
  @GetMapping("/")
  public String home() {
    return "home";
  }

  // Passando do controller para a view
  // @GetMapping("/mensagem")    import2
  // public String mensagem(Model model) {
  //   model.addAttribute("mensagem", "Mensagem vinda do servidor");
  //   return "mensagem";
  // }

  // Passando do controller para a view
  // @GetMapping("/mensagem")     import3
  // public String mensagem(ModelMap modelMap) {
  //   modelMap.addAttribute("mensagem", "Outra mensagem vinda do servidor");
  //   return "mensagem";
  // }

  // Passando do controller para a view
  @GetMapping("/mensagem")
  public ModelAndView mensagem() {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("mensagem");
    modelAndView.addObject("mensagem", " Mais uma Mensagem vinda do servidor");
    return modelAndView;
  }

  // Passando da view para o controller import4
  // @GetMapping("/saudacao/{nome}")
  // public ModelAndView saudacao(@PathVariable String nome) {
  //   ModelAndView modelAndView = new ModelAndView();
  //   modelAndView.setViewName("saudacao");
  //   modelAndView.addObject("nome", nome);
  //   return modelAndView;
  // }

  // Mesma coisa do de baixo mais com valor default caso não coloque nada no parametro
  // @GetMapping("/saudacao")
  // public ModelAndView saudacao(@RequestParam String nome) {
  //   ModelAndView modelAndView = new ModelAndView();
  //   modelAndView.setViewName("saudacao");
  //   modelAndView.addObject("nome", nome);
  //   return modelAndView;
  // }

  @GetMapping("/saudacao")
  public ModelAndView saudacao(
      @RequestParam(required = false, defaultValue = "Recode") String nome) {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("saudacao");
    modelAndView.addObject("nome", nome);
    return modelAndView;
  }
}
