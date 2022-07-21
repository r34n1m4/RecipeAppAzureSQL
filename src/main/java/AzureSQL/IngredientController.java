package AzureSQL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IngredientController {

    @Autowired
    private IngredientsRepo ingredientRepo;

    @GetMapping({"/ingredientlist"})
    public ModelAndView getAllIngredients() {
        ModelAndView mav2 = new ModelAndView("ingredientlist");
        mav2.addObject("ingredients", ingredientRepo.findAll());
        return mav2;
    }
}