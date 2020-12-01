package com.company;

import clases.CapacidadEndedudamiento;
import clases.Constantes;
import javafx.scene.input.KeyCode;

import java.util.Scanner;

public class Main {
    //Recuerda que aca empieza todo
    public static void main(String[] args) {
        //Con este objeto de la clase Scanner puedes capturar informacion por consola cada ves que lo uses
        // recuerda cerrar el flujo de consulta cada ves lo uses sobre para que los uses in.close()
        Scanner in = new Scanner(System.in);

        int ingMensuales;
        int gastFijos;
        int gastVariables;
        String control;

        String entrada = "SI";
        while (entrada.equals("SI")) {
            System.out.println(Constantes.MSJINGRESO);
            ingMensuales = convertirNumerico(lecturaIngreso(), Constantes.MSJINGRESO);

            System.out.println(Constantes.MSJFIJO);
            gastFijos = convertirNumerico(lecturaIngreso(), Constantes.MSJFIJO);

            System.out.println(Constantes.MSJVARIABLE);
            gastVariables = convertirNumerico(lecturaIngreso(), Constantes.MSJVARIABLE);

            CapacidadEndedudamiento objCapacidad = new CapacidadEndedudamiento();

            objCapacidad.setIngresosTotales(ingMensuales);
            objCapacidad.setGastosFijos(gastFijos);
            objCapacidad.setGastosVariables(gastVariables);

            System.out.println(Constantes.MSJCAPACIDAD + objCapacidad.getCapacidadEndeudamiento());
            System.out.println(Constantes.MSJCONTROL);
            control = lecturaIngreso().toUpperCase();

            if (!control.equals("S")){
                entrada = "No";
                }
        }
    }

    private static int convertirNumerico(String valorUsuario, String mensaje) {
        while (isNumeric(valorUsuario) != true) {
            System.out.println(Constantes.MSJERROR + mensaje);
            valorUsuario = lecturaIngreso();
        }
        return Integer.parseInt(valorUsuario);
    }
    private static String lecturaIngreso()
    {
        String returnValor;
        Scanner in = new Scanner(System.in);

        returnValor = in.next();

        return returnValor;
    }

    private static boolean isNumeric(String valor) {
        try {
            Integer.parseInt(valor);
            return true;

        } catch (NumberFormatException error) {
            return false;
        }
    }
}
