public class sepedaMotor {
    String merk;
    boolean kontakMotor = false;
    int kecepatanMotor;

    sepedaMotor(){

    }
    sepedaMotor(String mrk){
        merk = mrk
    }
    matikanMotor(boolean kontakMotor){
        kontakMotor = km;
    }
    matikanMotor(boolean lm){
        kontakMotor = lm;
    }
    tambahKecepatanMotor(int kec){
        kecepatanMotor = kec;
    }
    kurangiKecepatanMotor(int kec){
        kecepatanMotor = kec;
        if (kecepatanMotor == 0){
            System.out.print("Minimal kecepatan motor adalah 0");
        }else {
            kecepatanMotor -= 0;
        }

    }
    info(){
        System.out.println("-------------------------")
        if(kontakMotor == true){
            System.out.println("SEPEDA MOTOR TELAH DIHIDUPKAN";)
        }else{
            System.out.println("SEPEDA MOTOR TELAH DIMATIKAN");
        }
        System.out.println("kecepatan : " + kecepatanMotor);

    }
}