import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Phone xiaomi = new Xiaomi();
        Phone iphone = new Iphone();
        Phone samsung = new Samsung();
        Phone oppo = new Oppo();

        PhoneUser fauzi = new PhoneUser(xiaomi);
        PhoneUser irfan = new PhoneUser(iphone);
        PhoneUser sya = new PhoneUser(samsung);
        PhoneUser putra = new PhoneUser(oppo);

        Scanner input = new Scanner(System.in);

        int pil;

        do {
            System.out.println("APLIKASI INTERFACE");
            System.out.println("");
            System.out.println("Silahkan pilih HP");
            System.out.println("1. Xiaomi");
            System.out.println("2. Iphone");
            System.out.println("3. Samsung");
            System.out.println("4. Oppo");
            System.out.println("0. Keluar Aplikasi");
            System.out.println("");
            System.out.print("Pilih   : ");
            pil = input.nextInt();

            System.out.println("");
            System.out.println("");

            switch (pil) {
                case 1 :
                    do {
                        System.out.println("Menu HP Xiaomi");
                        System.out.println("1. Nyalakan HP");
                        System.out.println("2. Matikan HP");
                        System.out.println("3. Perbesar Volume");
                        System.out.println("4. Perkecil Volume");
                        System.out.println("0. Keluar");
                        System.out.print("Silahkan pilih : ");
                        pil = input.nextInt();

                        System.out.println("");
                        System.out.println("");

                        switch (pil) {
                            case 1 :
                                fauzi.turnOnThePhone();
                                break;
                            case 2 :
                                fauzi.turnOffThePhone();
                                break;
                            case 3 :
                                fauzi.makePhoneLouder();
                                break;
                            case 4 :
                                fauzi.makePhoneSilent();
                                break;
                            case 0 :
                                main(args);
                                break;
                            default :
                                System.out.println("Pilihan salah...");
                        }

                    } while (pil != 0);
                    break;
                case 2 :
                    do {
                        System.out.println("Menu HP Iphone");
                        System.out.println("1. Nyalakan HP");
                        System.out.println("2. Matikan HP");
                        System.out.println("3. Perbesar Volume");
                        System.out.println("4. Perkecil Volume");
                        System.out.println("0. Keluar");
                        System.out.print("Silahkan pilih : ");
                        pil = input.nextInt();

                        System.out.println("");
                        System.out.println("");

                        switch (pil) {
                            case 1 :
                                irfan.turnOnThePhone();
                                break;
                            case 2 :
                                irfan.turnOffThePhone();
                                break;
                            case 3 :
                                irfan.makePhoneLouder();
                                break;
                            case 4 :
                                irfan.makePhoneSilent();
                                break;
                            case 0 :
                                main(args);
                                break;
                            default :
                                System.out.println("Pilihan salah....");
                        }
                    } while (pil != 0);
                    break;
                case 3 :
                    do {
                        System.out.println("Menu HP Samsung");
                        System.out.println("1. Nyalakan HP");
                        System.out.println("2. Matikan HP");
                        System.out.println("3. Perbesar Volume");
                        System.out.println("4. Perkecil Volume");
                        System.out.println("0. Keluar");
                        System.out.print("Silahkan pilih : ");
                        pil = input.nextInt();

                        System.out.println("");
                        System.out.println("");

                        switch (pil) {
                            case 1 :
                                sya.turnOnThePhone();
                                break;
                            case 2 :
                                sya.turnOffThePhone();
                                break;
                            case 3 :
                                sya.makePhoneLouder();
                                break;
                            case 4 :
                                sya.makePhoneSilent();
                                break;
                            case 0 :
                                main(args);
                                break;
                            default :
                                System.out.println("Pilihan salah....");
                        }
                    } while (pil != 0);
                    break;
                case 4 :
                    do {
                        System.out.println("Menu HP Oppo");
                        System.out.println("1. Nyalakan HP");
                        System.out.println("2. Matikan HP");
                        System.out.println("3. Perbesar Volume");
                        System.out.println("4. Perkecil Volume");
                        System.out.println("0. Keluar");
                        System.out.print("Silahkan pilih : ");
                        pil = input.nextInt();

                        System.out.println("");
                        System.out.println("");

                        switch (pil) {
                            case 1 :
                                putra.turnOnThePhone();
                                break;
                            case 2 :
                                putra.turnOffThePhone();
                                break;
                            case 3 :
                                putra.makePhoneLouder();
                                break;
                            case 4 :
                                putra.makePhoneSilent();
                                break;
                            case 0 :
                                main(args);
                                break;
                            default :
                                System.out.println("Pilihan salah....");
                        }
                    } while (pil != 0);
                    break;
                case 0 :
                    System.out.println("Selamat tinggal....");
                    System.out.println("");
                    System.out.println("");
                    System.exit(0);
                    break;
                default :
                    System.out.println("Pilihan salah....");
            }
        } while (pil != 0);
    }
}
