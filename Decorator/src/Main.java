public class Main {
    public static void main(String[] args) {
        Computer gamingComputer = new GamingComputer(new BasicComputer());
        gamingComputer.assemble();
        System.out.println("\n");

        Computer workComputer = new WorkComputer(new GamingComputer(new
                BasicComputer()));
        workComputer.assemble();
        System.out.println("\n");

        Computer lowEndGamingComputer = new LowEndGamingComputer(gamingComputer);
        lowEndGamingComputer.assemble();
        System.out.println("\n");

        Computer highEndGamingComputer = new HighEndGamingComputer(gamingComputer);
        highEndGamingComputer.assemble();
        System.out.println("\n");
    }
}