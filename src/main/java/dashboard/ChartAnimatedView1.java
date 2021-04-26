/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboard;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;

@Named(value = "chartAnimatedView1")
@SessionScoped
public class ChartAnimatedView1 implements Serializable {

    private BarChartModel animatedIncidents1;
    private BarChartModel animatedIncidents2;

    @PostConstruct
    public void init() {
        createAnimatedModels();
    }

    public BarChartModel getAnimatedIncidents1() {
        return animatedIncidents1;
    }

    public BarChartModel getAnimatedIncidents2() {
        return animatedIncidents2;
    }

    private BarChartModel initBarModel() {
        BarChartModel model = new BarChartModel();

        ChartSeries incidents = new ChartSeries();
        incidents.setLabel("Incidents");
        incidents.set("20/4/2021", 11);
        incidents.set("21/4/2021", 15);
        incidents.set("22/4/2021", 6);
        incidents.set("23/4/2021", 16);
        incidents.set("24/4/2021", 4);

        model.addSeries(incidents);

        return model;
    }

    private BarChartModel initBarModel2() {
        BarChartModel model = new BarChartModel();

        ChartSeries request = new ChartSeries();
        request.setLabel("Request");
        request.set("20/4/2021", 10);
        request.set("21/4/2021", 9);
        request.set("22/4/2021", 11);
        request.set("23/4/2021", 5);
        request.set("24/4/2021", 7);
        model.addSeries(request);

        return model;
    }

    private void createAnimatedModels() {
        animatedIncidents1 = initBarModel();
        animatedIncidents1.setTitle("Incidents");
        animatedIncidents1.setAnimate(true);
        animatedIncidents1.setLegendPosition("se");
        Axis yAxis = animatedIncidents1.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(25);

        animatedIncidents2 = initBarModel2();
        animatedIncidents2.setTitle("Request");
        animatedIncidents2.setAnimate(true);
        animatedIncidents2.setLegendPosition("ne");
        yAxis = animatedIncidents2.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(25);
    }
}
