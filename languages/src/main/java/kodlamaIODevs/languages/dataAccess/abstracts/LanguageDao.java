package kodlamaIODevs.languages.dataAccess.abstracts;

import kodlamaIODevs.languages.entities.concretes.Language;

import java.util.List;

public interface LanguageDao {
    List<Language> getAll() throws Exception;
    Language getById(int id) throws Exception;
    void delete(int id) throws Exception;
    void update(Language language) throws Exception;
    void create(Language language) throws Exception;
}
