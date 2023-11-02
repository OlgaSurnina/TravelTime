public class TravelTime {


    public static void main(String[] args) {

        final short lengthPath = 54;
        System.out.println("Расстояние от дома до работы " + lengthPath + " км");

        double averageSpeedTaxi = 32.2;
        System.out.println("Средняя скорость такси без пробок " + averageSpeedTaxi + " км/ч");

        double travelTime = lengthPath / averageSpeedTaxi;
        System.out.println("Время в пути без пробок " + travelTime + " ч.");

        double indexRetard = 1.7;
        System.out.println("Коэффицент замедления транспорта вечером " + indexRetard);

        double travelTimePileup = travelTime * indexRetard;
        System.out.println("Время в пути с пробками " + travelTimePileup + " ч.");
    }
}
