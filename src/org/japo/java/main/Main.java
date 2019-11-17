/* 
 * Copyright 2019 Josefina Pugliese Vazquez - josefinapwork@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Josefina Pugliese Vazquez
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //Variables
        int anyo;
        String decision;

        try {

            //Cabecera
            System.out.println("Alternativa Bisiesta");
            System.out.println("====================");

            //Pedida Año
            System.out.print("Análisis año ...: ");
            anyo = SCN.nextInt();

            //Separador
            System.out.println("---");
            
            //Calculos año bisiesto
            if (anyo % 400 == 0) {
                decision = "SI";
            } else if (anyo % 100 == 0) {
                decision = "NO";
            } else if (anyo % 4 == 0)  {
                decision = "SI";
            } else decision = "NO";
            
            //Salida pantalla
            System.out.printf("El año %d ....: %s es bisiesto%n", anyo, decision);

        } catch (Exception e) {
            System.out.println("ERROR: Entrada incorrecta");
        }

    }
}
