package javareview;

public class Student {

    //--- access specifier / access modifier ----
    //--- ตัวระบุการเข้าถึงตัวแปรและเมธอด  มี 4 ระดับ
    // private, public, package(default), protected

    //********************* 1. field, attribute, instance variable ***********************
    private int id;
    private String name;
    private double midtermScore;
    private double finalScore;
    //********************* 2. constructor ***********
    // ถูกเรียกครั้งเดียวตอนสร้าง object ช่วยกำหนดค่าเริ่มต้นให้ field
    // ชื่อเดียวกับชื่อคลาส
    public Student(int id, String name){
        this.id = id;
        this.name = name;

    }

    //********************* 3. method (คล้ายฟังก์ชัน) *****************************
    public double getTotalScore() {
        double total = midtermScore + finalScore;
        return total;
    }

    //----method getters ช่วยคืนค่า field
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    //  setters ช่วยกำหนดค่า
    public void setMidtermScore(double midtermScore){
        this.midtermScore = midtermScore;
    }
    public void setFinalScore(double finalScore){
        this.finalScore = finalScore;
    }

    //toString method
    public String toString(){
        return id + " -- " + name;
    }


}
