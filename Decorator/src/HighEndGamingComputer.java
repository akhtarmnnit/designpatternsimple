public class HighEndGamingComputer extends ComputerDecorator {
    public HighEndGamingComputer(Computer computer) {
        super(computer);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding characteristics of a high end gaming computer! ");
    }
}