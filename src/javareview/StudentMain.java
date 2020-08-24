package javareview;

public class StudentMain {
    public static void main(String[] args) {

//        Student kwan = new Student();
//        kwan.id = 1;
//        kwan.name = "Kwan";
        Student kwan = new Student(1,"Kwan");

//        Student kate = new Student();
//        kate.id = 2;
//        kate.name = "Kate";
        Student kate = new Student(2,"Kate");

//        System.out.println(kwan.id + " : " +kwan.name);
//        System.out.println(kate.id + " : " +kate.name);
        System.out.println(kwan.getId() + " : " +kwan.getName());
        System.out.println(kate.getId() + " : " +kate.getName());
        System.out.println(kwan.toString());
        System.out.println(kwan);
//
//        kwan.midtermScore = 10;
//        kwan.finalScore = 8;
        kwan.setMidtermScore(10);
        kwan.setFinalScore(8);
//        System.out.println("Kwan's total = "+ kwan.getTotalScore());
////        double ki = new Double(kwan.getTotalScore());
////        System.out.println("Kwan's total = "+ ki);
//
//        Student s = kwan;
//        s.id = 100;
//        System.out.println(kwan.id + " : " +kwan.name);

    }
}
