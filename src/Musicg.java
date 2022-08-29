import com.musicg.fingerprint.FingerprintSimilarity;
import com.musicg.wave.Wave;

public class Musicg {
    public static void main(String[] args) {
        String filenameFirst = "E:\\Magister\\Nagrania_magister\\down_k\\bazowy.wav";
        String filenameSecond = "E:\\Magister\\Nagrania_magister\\down_k\\predkosc.wav";
        long startTime = System.nanoTime();
        Wave w1 = new Wave(filenameFirst);
        Wave w2 = new Wave(filenameSecond);
        FingerprintSimilarity sim1 = w1.getFingerprintSimilarity(w2);
        long endaTime = System.nanoTime();
        System.out.println((endaTime-startTime)/100000000);
        System.out.println(sim1.getSimilarity()*100);
    }
}
