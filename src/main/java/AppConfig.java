import com.pluralsight.Repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.Repository.SpeakerRepository;
import com.pluralsight_service.SpeakerService;
import com.pluralsight_service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pluralsight_service.SpeakerServiceImpl;

@Configuration
public class AppConfig {
    @Bean(name= "speakerService")
    public SpeakerServiceImpl getSpeakerService(){
        SpeakerServiceImpl service= new SpeakerServiceImpl(getSpeakerRepository());
        service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name ="speakerRepository")
    public SpeakerRepository getSpeakerrepository(){
        return new HibernateSpeakerRepositoryImpl();
    }
}
