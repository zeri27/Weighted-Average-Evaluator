package BackEnd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Weitage {

    private final Map<Double, List<Double>> weitageMap = new HashMap<>();

    public Weitage() {
    }

    public void addEntry(double weight, double grade) {
        List<Double> list;
        if (weitageMap.containsKey(weight)) {
            list = weitageMap.get(weight);
        } else {
            list = new ArrayList<>();
        }
        list.add(grade);
        weitageMap.put(weight, list);
    }

    public boolean deleteEntry(double weight, double grade) {
        if (weitageMap.containsKey(weight)) {
            List<Double> list = weitageMap.get(weight);
            if (list.contains(grade)) {
                list.remove(grade);
                weitageMap.put(weight, list);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public double totalSize() {
        double size = 0;
        for (double key : weitageMap.keySet()) {
            List<Double> list = weitageMap.get(key);
            size += list.size();
        }
        return size;
    }

    public double sumOfWeights() {
        double sum = 0;
        for (double key : weitageMap.keySet()) {
            List<Double> list = weitageMap.get(key);
            for (double ignored : list) {
                sum += key;
            }
        }
        return sum;
    }

    public double evaluateFinalGrade() {
        double numerator = 0;
        double denominator = sumOfWeights();
        if (denominator == 0) {
            return 0.0;
        }
        for (double i : weitageMap.keySet()) {
            List<Double> list = weitageMap.get(i);
            for (double j : list) {
                numerator += i * j;
            }
        }
        return numerator/denominator;
    }
}
