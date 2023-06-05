public class Runner {

    public static void main(String[] args) {
        WaterBottle waterBottle = new WaterBottle(100);
        int volume = waterBottle.getVolume();
        System.out.println(volume);
        waterBottle.drink();
        System.out.println(waterBottle.getVolume());
    }
}
