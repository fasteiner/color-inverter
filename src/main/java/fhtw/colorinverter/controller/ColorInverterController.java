package fhtw.colorinverter.controller;

import fhtw.colorinverter.service.ColorInverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ColorInverterController {
    private ColorInverterService colorInverterService;

    @Autowired
    public ColorInverterController(ColorInverterService colorInverterService) {
        this.colorInverterService = colorInverterService;
    }
    @GetMapping("/complementary")
    public String invertColor(@RequestParam String color) {
        return this.colorInverterService.invertColor(color);
    }
}

