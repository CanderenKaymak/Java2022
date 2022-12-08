package kodlamaIODevs.languages.business.concretes;

import kodlamaIODevs.languages.business.abstracts.LanguageService;
import kodlamaIODevs.languages.dataAccess.concretes.InMemoryLanguageRepository;
import kodlamaIODevs.languages.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {

    @Autowired
    private InMemoryLanguageRepository inMemoryLanguageRepository;

    public LanguageManager(InMemoryLanguageRepository inMemoryLanguageRepository) {
        this.inMemoryLanguageRepository = inMemoryLanguageRepository;
    }

    @Override
    public List<Language> getAll() throws Exception {
        return inMemoryLanguageRepository.getAll();
    }

    @Override
    public Language getById(int id) throws Exception {
        Language language = inMemoryLanguageRepository.getById(id);

        if (language != null) return language;

        throw new Exception("Couldn't find such a thing...");
    }

    @Override
    public void delete(int id) throws Exception {
        Language language = inMemoryLanguageRepository.getById(id);

        if (language == null){
            throw new Exception("Couldn't find such a thing...");
        }

        inMemoryLanguageRepository.delete(id);
    }

    @Override
    public void update(Language language) throws Exception {
        // get language list to control required specifications
        List<Language> languageList = getAll();

        // check if updated language name is empty
        if (language.getName().isEmpty())throw new Exception("Language name can not be empty!");

        //check if updated language name is already exist.
        for (Language lang: languageList){
            if (lang.getName().equals(language.getName())){
                throw new Exception("This name is already exist.");
            }
        }

        // update operations
        Language checkLanguage = inMemoryLanguageRepository.getById(language.getId());

        if (checkLanguage != null) inMemoryLanguageRepository.update(language);
        else throw new Exception("Couldn't find such a thing");
    }

    @Override
    public void create(Language language) throws Exception {
        List<Language> languageList = getAll();

        if (language.getName().isEmpty()) throw new Exception("Language name can not be empty!");

        for (Language lang:languageList){
            if (lang.getId() == language.getId() || lang.getName().equals(language.getName())){
                throw new Exception("This language is already exist.");
            }
        }
        inMemoryLanguageRepository.create(language);
    }
}
