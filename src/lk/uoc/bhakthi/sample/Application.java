package lk.uoc.bhakthi.sample;



import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class application {


    public static void main(String[] args) {
        List<String> students=new ArrayList<>();
        students.add("layan");
        students.add("annasi");
        students.add("lakshika");
        students.add("ubeysinghe");
        students.add("nadeesha");
        System.out.println(students);

        List<String> filtereddata=students.stream()
                .filter(s->s.length()>5)
                .collect(Collectors.toList());
        System.out.println(filtereddata);

     List<Sensor> sensors= new ArrayList<>();

     Sensor sensor1 = new Sensor() {
     Sensors.add(Sensor1);


     {
     }

List<Sensor> hotSensors=sensors.stream()
    .filter(sensor -> sensor.getValue()>28)
        .collect(Collections.toList());




    }

    private static void collect(Collector<Object,?, List<Object>> toList) {
    }
}