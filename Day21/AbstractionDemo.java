package Day21;

public class AbstractionDemo extends AbstractionClass{
    public static void main(String[] args) {
        AbstractionDemo ad = new AbstractionDemo();
        ad.CPU("Intel i5");
        ad.GPU("NVidia RTX 2060");
        ad.MotherBoard("Gigabyte B360");
        ad.Ram(16);
    }

    //Un-Implemented methods from abstract class
    @Override
    public void CPU(String CPU) {
        System.out.println("CPU name: "+CPU);
    }

    @Override
    public void GPU(String GPU) {
        System.out.println("GPU name: "+GPU);
    }

    @Override
    public void MotherBoard(String MotherBoard) {
        System.out.println("Motherboard name: "+ MotherBoard);
    }

    @Override
    public void Ram(int Ram) {
        System.out.println("Size of RAM: "+ Ram+" GB");
    }
}

abstract class AbstractionClass{
    //Abstract methods
    public abstract void CPU(String CPU);
    public abstract void GPU(String GPU);
    public abstract void MotherBoard(String MotherBoard);
    public abstract void Ram(int Ram);

    //Concrete methods:
    public void Normal(){
        System.out.println("This is concrete method");
    }
}