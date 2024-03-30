package uz.kamron.springcource;

public class ClassicalMusic implements Music {
private ClassicalMusic(){};
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
   public void doMyDestroy(){
       System.out.println("Doing my destruction");
   }


    @Override
    public String getSong() {
        return "Chief keef";
    }
}
