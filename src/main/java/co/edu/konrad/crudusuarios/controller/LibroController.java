package co.edu.konrad.crudusuarios.controller;

import co.edu.konrad.crudusuarios.model.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import co.edu.konrad.crudusuarios.service.api.LibroServiceAPI;

@Controller
public class LibroController {

    @Autowired
    private LibroServiceAPI libroServiceAPI;

    @RequestMapping("/biblioteca")
    public String index(Model model) {
        model.addAttribute("list", libroServiceAPI.getAll());
        return "biblioteca";
    }

    @GetMapping("/saveLibro/{id}")
    public String viewSave(@PathVariable("id") Long id, Model model) {
        if(id != null && id != 0) {
            model.addAttribute("libro", libroServiceAPI.get(id));
        } else {
            model.addAttribute("libro", new Libro());
        }
        return "saveLibro";
    }

    @PostMapping("/saveLibro")
    public String save(Libro libro) {
        libroServiceAPI.save(libro);
        return "redirect:/biblioteca";
    }

    @GetMapping("deleteLibro/{id}")
    public String delete(@PathVariable("id") Long id) {
        libroServiceAPI.delete(id);
        return "redirect:/biblioteca";
    }
}
