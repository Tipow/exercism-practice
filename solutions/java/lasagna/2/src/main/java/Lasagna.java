public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
     public int expectedMinutesInOven(){
         int minutes = 40;
         return minutes;
     }

    // TODO: define the 'remainingMinutesInOven()' method
     public int remainingMinutesInOven(int minutes){
        int minutesRemaining = expectedMinutesInOven() - minutes;
        return minutesRemaining;
    }
   
    // TODO: define the 'preparationTimeInMinutes()' method
     public int preparationTimeInMinutes(int layers){
        int preparationTime = layers * 2;
         return preparationTime;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int numberOfMinutesInOven){
        int totalTime = preparationTimeInMinutes(layers) + numberOfMinutesInOven;
        return totalTime;
    }
}
