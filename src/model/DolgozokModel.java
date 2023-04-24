package model;

import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class DolgozokModel {
    private Path myPath = Paths.get("emberek.txt");
    private ArrayList<Dolgozo> dolgozok = new ArrayList<>();
    public DolgozokModel() throws IOException {
        List<String> myFile = Files.readAllLines(myPath);
        for (int i = 1; i < myFile.size(); i++) {
            String[] dolgozo = myFile.get(i).split(";");
            if (dolgozo.length == 3) {
                dolgozok.add(new Dolgozo(dolgozo[0], Integer.valueOf(dolgozo[1]), dolgozo[2]));
            }
            else dolgozok.add(new Dolgozo(dolgozo[0], Integer.valueOf(dolgozo[1]), dolgozo[2], Integer.valueOf(dolgozo[3])));
        }
    }

    public ArrayList<Dolgozo> getDolgozok() {
        return dolgozok;
    }
    public int legidosebb(String nem) {
        int max = 0;
        for (Dolgozo dolgozo : dolgozok) {
            if (dolgozo.getKor() > max && dolgozo.getNem().equals(nem)) {
                max = dolgozo.getKor();
            }
        }
        return max;
    }
    public int osszes(String nem) {
        int sum = 0;
        for (Dolgozo dolgozo : dolgozok) {
            if (dolgozo.getNem().equals(nem)) {
                sum += dolgozo.getKor();
            }
        }
        return sum;
    }
    public String hatEve(String nem) {
        String kik = "nincs";
        boolean egyVolt = false;
        for (Dolgozo dolgozo : dolgozok) {
            if (dolgozo.getHanyEve() >= 6 && dolgozo.getNem().equals(nem)) {
                if (egyVolt) {
                    kik += ", "+dolgozo.getNev();
                }
                else {
                    egyVolt = true;
                    kik = dolgozo.getNev();
                }
            }
        }
        return kik;
    }
    
   
    
}
