public class LowEndGamingComputer extends ComputerDecorator {
    public LowEndGamingComputer(Computer computer) {
        super(computer);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding characteristics of a low end gaming computer! ");
    }
}