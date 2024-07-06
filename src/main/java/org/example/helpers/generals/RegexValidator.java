package org.example.helpers.generals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidator {

    public boolean validarRegex(String cadena, String regex){

        Pattern patron=Pattern.compile(regex);
        Matcher coincidencia=patron.matcher(cadena);

        if(!coincidencia.matches()){
            return false;
        }else {
            return true;
        }
    }
}
