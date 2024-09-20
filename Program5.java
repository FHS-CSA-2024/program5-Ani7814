
public class Program5{
    public static void main(String[] args){
        int royaleMiles = 286;
        int royaleGallons = 9;
        int koopaKingMiles = 412;
        int koopaKingGallons = 40;
        int pipeFrameMiles = 361;
        int pipeFrameGallons = 18;
        int badwagonMiles = 161;
        int badwagonGallons = 11;
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon: ");
        System.out.println("Royale averaged "+ Math.round(10*(double)royaleMiles/royaleGallons)/10.0+"m/s");
        System.out.println("Koopa King averaged "+ Math.round(10*(double)koopaKingMiles/koopaKingGallons)/10.0+"m/s");
        System.out.println("Pipe frame averaged "+ Math.round(10*(double)pipeFrameMiles/pipeFrameGallons)/10.0+"m/s");
        System.out.println("Badwagon averaged "+ Math.round(10*(double)badwagonMiles/badwagonGallons)/10.0+"m/s");
        
    }
}
//Paste console output below:
/*
Mushroom Cup Prix Racer Average Miles/Per Gallon: 
Royale averaged 31.8m/s
Koopa King averaged 10.3m/s
Pipe frame averaged 20.1m/s
Badwagon averaged 14.6m/s

*/
