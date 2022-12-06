package fhtw.colorinverter.service;

import org.springframework.stereotype.Service;

@Service
public class ColorInverterService {
    public String invertColor(String color) {
        switch (color) {
            case "red":
                return "green";
            case "green":
                return "red";
            case "blue":
                return "orange";
            case "orange":
                return "blue";
            case "yellow":
                return "purple";
            case "purple":
                return "yellow";
            default:
                return "unknown";
        }
    }
}
