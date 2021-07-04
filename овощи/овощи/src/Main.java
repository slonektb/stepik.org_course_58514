public class Main {

    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.setType("Unicorn");
        a1.setName("Evkakiy");
        a1.setWeight(3140.5);
        a1.setAge(18);
        a1.setArea("Your dream");
        a1.setSwim(true);
        a1.setWalk(false);
        a1.setFly(false);
        System.out.println(a1);
        Animal a2 = new Animal("Duck", "Vasilich", 88, 81, "OBZh", false, true, false);
        System.out.println(a2);
        Animal a3 = new Animal("Krot", "Afanasiy");
        System.out.println(a3);
        Animal a4 = new Animal();
        System.out.println(a4);
        a2.voice();
    }

}
