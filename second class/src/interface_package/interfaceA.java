package interface_package;

public class interfaceA {
    int num=55;
    public void printMessage(String message);
    default void eatFood(String food){
        System.out.println("Eating"+food);
    }
}
