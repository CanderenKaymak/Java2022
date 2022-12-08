package kodlamaIODevs.languages.dataAccess.concretes;

import kodlamaIODevs.languages.dataAccess.abstracts.LanguageDao;
import kodlamaIODevs.languages.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements LanguageDao {
    List<Language> languages;

    public InMemoryLanguageRepository() {
        languages = new ArrayList<>();

        languages.add(new Language(1,"Java"));
        languages.add(new Language(2,"Python"));
        languages.add(new Language(3,"C#"));
        languages.add(new Language(4,"Flutter"));
    }

    @Override
    public List<Language> getAll() throws Exception {
        return languages;
    }

    @Override
    public Language getById(int id) throws Exception {
        for (Language language:languages){
            if (language.getId() == id) return language;
        }
        return null;
    }

    @Override
    public void delete(int id) throws Exception {
        Language languageToDelete = getById(id);
        languages.remove(languageToDelete);
    }

    @Override
    public void update(Language language) throws Exception {
        Language languageToUpdate = getById(language.getId());
        // set(index,Language element) ==> we got the index value from language id, since we have consecutive id
        // numbers related to their places in the list. so we chose the language which we wanted to update. then we
        // replaced it with a new language values.
        languages.set(languageToUpdate.getId()-1, new Language(languageToUpdate.getId(),language.getName()));
    }

    @Override
    public void create(Language language) throws Exception {
        languages.add(language);
    }
}
