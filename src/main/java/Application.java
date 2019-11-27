import pluralsight_service.SpeakerService;
import pluralsight_service.SpeakerServiceImpl;

public class Application {
    public static void main(String args[]) {
        ApplicationContext appContext=
                new AnnotationConfigApplicationContext(AppConfig.class);
        //SpeakerService service = new SpeakerServiceImpl();
        SpeakerService service= appContext.getBean( s: "speakerService",SpeakerService.class);
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
