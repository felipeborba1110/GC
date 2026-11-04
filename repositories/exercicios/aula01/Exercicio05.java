package repositories.exercicios.aula01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Exercicio05 {

    void run(){
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime lastMidnight = LocalDate.now().atStartOfDay();
        LocalDateTime nextMidnight = LocalDate.now().atStartOfDay().plusDays(1);

        long untilNextMidnight = now.until(nextMidnight, ChronoUnit.SECONDS);
        long pastLastMidnight = now.until(lastMidnight,ChronoUnit.SECONDS);

        System.out.println(calculateTimeDistance(untilNextMidnight));
        System.out.println(calculateTimeDistance(pastLastMidnight));
    }

    private String calculateTimeDistance(long distanceInSeconds){
        boolean future = true;
        double time = (double) distanceInSeconds;

        if(time < 0){
            time = -(time);
            future = false;
        }

        double timeHours = time/3600;
        double timeMinutes = (timeHours%1)*60;
        double timeSeconds = (timeMinutes%1)*60;

        return String.format("%s %02.0f:%02.0f:%02.0f",future?"Faltam":"Já passaram",Math.floor(timeHours),Math.floor(timeMinutes),Math.floor(timeSeconds));
    }
}
