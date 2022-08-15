import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int month, day, dayofyear=0, residual=0;
        String Burc ="";
        Scanner input = new Scanner(System.in);
        System.out.println("Doğduğunuz Ayı giriniz: ");
        month = input.nextInt();
        System.out.println("Doğduğunuz Günü giriniz: ");
        day = input.nextInt();



        if (month < 7){                                     // 1 2 3 4 5 6
            if (month < 4){                                 // 1 2 3
                if (month < 2){                             // 1
                    residual = 0;
                    dayofyear = day;
                    Burc = (dayofyear < 22) ? "OĞLAK" : "KOVA";
                }
                else if(month == 2){                        // 2
                    residual = 1;
                    dayofyear = (month-1) * 30 + residual + day;
                    Burc = (dayofyear < 51) ? "KOVA" : "BALIK";

                }else{                                      // 3
                    residual = -1;
                    dayofyear = (month-1) * 30 + residual + day;
                    Burc = (dayofyear < 80) ? "BALIK" : "KOÇ";
                }
            }else if(month == 5 | month == 4){              // 4 and 5
                residual = 0;
                dayofyear = (month-1) * 30 + residual + day;
                Burc = (dayofyear < 111) ? "KOÇ" : ((dayofyear < 142) ? "BOĞA" : "İKİZLER");

            }else{                                          // 6
                residual = 1;
                dayofyear = (month-1) * 30 + residual + day;
                Burc = (dayofyear < 174) ? "İKİZLER" : "YENGEÇ";
            }
        }else if(month < 9){                                // 7 8
            if(month == 7){                                  // 7
                residual = 1;
                dayofyear = (month-1) * 30 + residual + day;
                Burc = (dayofyear < 204) ? "YENGEÇ" : "ASLAN";
            }else{                                          // 8
                residual = 2;
                dayofyear = (month-1) * 30 + residual + day;
                Burc = (dayofyear < 235) ? "ASLAN" : "BAŞAK";
            }
        }else if (month < 11){                              //9 10
            residual = 3;
            dayofyear = (month-1) * 30 + residual + day;
            Burc = (dayofyear < 266) ? "BAŞAK" : ((dayofyear < 296) ? "TERAZİ" : "AKREP");

        }else{                                              // 11 12
            residual = 4;
            dayofyear = (month-1) * 30 + residual + day;
            Burc = (dayofyear < 326) ? "AKREP" : ((dayofyear < 356) ? "YAY" : "OĞLAK");
        }
        System.out.println("Burcunuz : "+Burc+"   "+dayofyear);
    }
}
