package kata3;

import histograma.model.Histogram;
import histograma.view.HistogramDisplay;

public class Kata3 {
    private static Histogram<String> histogram;
    
    public static void main(String[] args) {
        histogram = new Histogram<>();
        addToHistogram();
 
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
    
    private static void addToHistogram (){
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        
        histogram.increment("humble.es");
        histogram.increment("humble.es");
        histogram.increment("humble.es");
        
        histogram.increment("localhost.es");
        histogram.increment("localhost.es");
        histogram.increment("localhost.es");
        histogram.increment("localhost.es");
        histogram.increment("localhost.es");
        
        histogram.increment("youtube.com");
        histogram.increment("youtube.com");
        histogram.increment("youtube.com");
        histogram.increment("youtube.com");
    }
    
}
