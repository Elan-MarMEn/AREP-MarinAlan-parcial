package edu.escuelaing.arep.parcial2tercio.service;

import org.json.JSONObject;

public interface Calculator {
    
    Double tan(Double num);

    Double sqrt(Double num);

    JSONObject defaultOut(Double num);
}
