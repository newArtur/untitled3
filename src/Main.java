public class Main {
    public static void main(String[] args) {

        Cow cow1 = new Cow("Burenka",20,50,"f");
        Cow cow2 = new Cow("Alenka",80,60,"f");
        Cow cow3 = new Cow("Sasha",40,90,"f");
        Cow cow4 = new Cow("Dasha",30,64,"f");
        Cow cow5 = new Cow("Ruslan",50,90,"m");

        Sheep sheep1 = new Sheep("Egor",10,30,"m");
        Sheep sheep2 = new Sheep("Dariya",20,40,"f");
        Sheep sheep3 = new Sheep("Burena",30,90,"f");

        Horse horse1 = new Horse("Akjol",40,120,"m","Braun");
        Horse horse2 = new Horse("Bulka",30,108,"f","Black");

        Cow[]cows = {cow1,cow2,cow3,cow4,cow5};
        Cow[]cows1 = {cow1};
        Horse[]horses = {horse1,horse2};
        Horse[]horses1 = {horse1};
        Sheep[]sheep = {sheep1,sheep2,sheep3};
        Sheep[]sheep4 = {sheep3};

        Farm farm1 = new Farm("USA",cows,horses,sheep,"Mr Artur");
        Farm farm2 = new Farm("Parij",cows1,horses1,sheep4,"Mr Beast");

        System.out.println(farm1);
        System.out.println(farm2);
    }
}
