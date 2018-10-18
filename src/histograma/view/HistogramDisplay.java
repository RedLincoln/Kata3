package histograma.view;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.ui.ApplicationFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class HistogramDisplay extends ApplicationFrame{
    
    public HistogramDisplay() {
        super("HISTOGRAMA");
        setContentPane(createPanel());
        
        pack();
    }
    
    public void execute(){
        setVisible(true);
    }

    private JPanel createPanel() {
        JPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset){
        JFreeChart chart;
        chart = ChartFactory.createBarChart("Histograma JFreeChart",
                "Dominions email",
                "Nº de email",
                dataset,
                PlotOrientation.VERTICAL,
                false,
                false, rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10, "", "ulpgc.es");
        dataset.addValue(5, "", "wikileaks.es");
        dataset.addValue(6, "", "locahost.es");
        dataset.addValue(20, "", "humble.es");
        dataset.addValue(10, "", "steam.com");
        dataset.addValue(7, "", "youtube.com");
        return dataset;
    }
}
