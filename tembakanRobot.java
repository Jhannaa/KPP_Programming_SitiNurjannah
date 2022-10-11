/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan;

/**
 *
 * @author hp
 */


    
    class peluru{
    double g = 10;
    double sudut = 45;
    double kecAwal = 25;



    double sin2A(double sudut){
        return Math.sinh(2*sudut);
    }
    public double VTang(double kA){
        if (kA>0 && kA<=25){
            System.out.println("V Tangensial yaitu :");
            if (kA>0 && kA<=10){
                return kA + 1;
            } else if (kA>10 && kA<=20){
                return kA + 3;
            }else if (kA>20 && kA<=30){
                return kA + 5;
            }
        }
        return kA;
    }

    double xmaks (){
        return (Math.pow(kecAwal,2)*2*Math.sinh(sudut)*Math.cosh(sudut))/g;
    }

    public void printInfo(){
        System.out.println("jarak terjauh : " + xmaks() + "v tangensial : " +VTang(30));
    }
}
public class tembakanRobot {
    public static void main(String[] args) {

        peluru peluru1 = new peluru();
        peluru1.VTang(30);
        peluru1.xmaks();
        peluru1.printInfo();
    }
}
    
