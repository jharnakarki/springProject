package pluralsight_service;

import com.pluralsight.Repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.Repository.SpeakerRepository;
import com.pluralsight.model.Speaker;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository;

    public SpeakerServiceImpl(SpeakerRepository speakerrepository){
        repository=speakerRepository;
    }
    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }

    public List<Speaker> findAll() {

        return repository.findAll();
    }
}
