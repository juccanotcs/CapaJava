package clases;

public class CapacidadEndedudamiento {
    Integer ingresosTotales;
    Integer gastosFijos;
    Integer gastosVariables;
    final double POR_FIJO = 0.35;

    //Metodos getter and setter para la clase

    public void setIngresosTotales(Integer ingresosTotales) {
        this.ingresosTotales = ingresosTotales;
    }

    public void setGastosFijos(Integer gastosFijos) {
        this.gastosFijos = gastosFijos;
    }

    public void setGastosVariables(Integer gastosVariables) {
        this.gastosVariables = gastosVariables;
    }

    public Integer getIngresosTotales() {
        return ingresosTotales;
    }

    public Integer getGastosFijos() {
        return gastosFijos;
    }

    public Integer getGastoVaribales() {
        return gastosVariables;
    }

    //Construye un metodo que retorne una cadena con las propiedades de la clase

    public String getCapacidadEndeudamiento() {
        return Double.toString((ingresosTotales - gastosFijos - gastosVariables) * POR_FIJO);
        // retornar la capacidad de endeudamiento puede ser una cadena con el valor
    }
}
