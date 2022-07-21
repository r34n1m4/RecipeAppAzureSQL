package AzureSQL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RecipeController {

    @Autowired
    private RecipeRepo recipeRepo;

    @GetMapping({"/list", "/"})
    public ModelAndView getAllRecipes() {
        ModelAndView mav = new ModelAndView("list");
        mav.addObject("recipe", recipeRepo.findAll());
        return mav;
    }
}
