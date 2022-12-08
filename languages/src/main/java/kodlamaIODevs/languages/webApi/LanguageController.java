package kodlamaIODevs.languages.webApi;

import kodlamaIODevs.languages.business.abstracts.LanguageService;
import kodlamaIODevs.languages.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {
    @Autowired
    private LanguageService languageService;

    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getall")
    public List<Language> getAll() throws Exception {
        return languageService.getAll();
    }

    @GetMapping("/getbyid/{id}")
    public Language getById(@PathVariable int id) throws Exception{
        return languageService.getById(id);
    }

    @PostMapping("/add")
    public void create(@RequestBody Language language) throws Exception{
        languageService.create(language);
    }

    @PutMapping("/update")
    public void update(@RequestBody Language language) throws Exception{
        languageService.update(language);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) throws Exception{
        languageService.delete(id);
    }
}
