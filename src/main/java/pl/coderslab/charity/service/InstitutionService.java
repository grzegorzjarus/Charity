package pl.coderslab.charity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.Institution;
import pl.coderslab.charity.repository.InstitutionRepository;

import java.util.List;

@Service
public class InstitutionService {
    final
    InstitutionRepository institutionRepository;

    public InstitutionService(InstitutionRepository institutionRepository) {
        this.institutionRepository = institutionRepository;
    }

    public void initialInstitutions(){
        Institution institution1 = new Institution("Dbam o Zdrowie","Pomoc dzieciom z ubogich rodzin.");
        Institution institution2 = new Institution("A kogo", "Pomoc wybudzaniu dzieci ze śpiączki.");
        Institution institution3 = new Institution("Dla dzieci", "Pomoc osobom znajdującym się w trudnej sytuacji życiowej.");
        Institution institution4 = new Institution("Bez domu", "Pomoc dla osób nie posiadających miejsca zamieszkania.");
        institutionRepository.save(institution1);
        institutionRepository.save(institution2);
        institutionRepository.save(institution3);
        institutionRepository.save(institution4);
    }

    public List<Institution> getAllInstitutions(){
       return institutionRepository.findAll();
    }
}
