import static org.junit.Assert.*;

import org.junit.Test;


public class CollectData {
    Scanner scan = new Scanner();
    @Test
    public void testScanner(){
        for (int i = 0; i < 100; i++) {
            String[] electronics = new String[2];
            double smallNum = StdRandom.uniform();
            if (smallNum >= 0 && smallNum < .15) {
                electronics[0] = "wires";
                electronics[1] = "Sheath Cable";
            }
            if (smallNum >= .15 && smallNum < .30) {
                electronics[0] = "wires";
                electronics[1] = "Feeder cable";
            }
            if (smallNum >= .30 && smallNum < .45) {
                electronics[0] = "wires";
                electronics[1] = "One to One Arduino";
            }
            if (smallNum >= .45 && smallNum < .60) {
                electronics[0] = "metals";
                electronics[1] = "sheet";
            }
            if (smallNum >= .60 && smallNum < .75) {
                electronics[0] = "metals";
                electronics[1] = "steel";
            }
            if (smallNum >= .75 && smallNum < .85) {
                electronics[0] = "metals";
                electronics[1] = "copper";
            }
            if (smallNum >= .85 && smallNum < .90) {
                electronics[0] = "chips";
                electronics[1] = "Intel I7";
            }
            if (smallNum >= .90 && smallNum <= 1) {
                electronics[0] = "chips";
                electronics[1] = "GTX 1050";
            }
            scan.addElectronic(electronics);
        }
    }
}
