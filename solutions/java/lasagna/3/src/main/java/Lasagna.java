public class Lasagna {
     public int expectedMinutesInOven(){
         int minutes = 40;
         return minutes;
     }

     public int remainingMinutesInOven(int minutes){
        int minutesRemaining = expectedMinutesInOven() - minutes;
        return minutesRemaining;
    }
   
     public int preparationTimeInMinutes(int layers){
        int preparationTime = layers * 2;
         return preparationTime;
    }

    public int totalTimeInMinutes(int layers, int numberOfMinutesInOven){
        int totalTime = preparationTimeInMinutes(layers) + numberOfMinutesInOven;
        return totalTime;
    }
}
