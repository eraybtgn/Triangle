import java.util.Scanner;

public class HipoCalcu {
    private double angle1;
    private double angle2;
    private double hip;

    public HipoCalcu(){

    }
    public HipoCalcu(double angle1,double angle2){
        this.angle1=angle1;
        this.angle2=angle1;

    }

    public double getAngle1(){
        return angle1;
    }

    public void setAngle1(int angle1){
        this.angle1 = angle1;
    }

    public double getAngle2() {
        return angle2;
    }

    public void setAngle2(int angle2) {
        this.angle2 = angle2;
    }

    public double degerAl(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen açıları giriniz.");
        angle1= scan.nextInt();
        System.out.println("İkinci açıyı giriniz..");
        angle2= scan.nextInt();

            hip= Math.sqrt(Math.pow(angle1,2)+Math.pow(angle2,2));
            System.out.println("Hiponetüs:"+hip);

        return hip;
    }
}
