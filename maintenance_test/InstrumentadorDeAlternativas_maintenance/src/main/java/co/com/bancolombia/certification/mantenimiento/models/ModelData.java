package co.com.bancolombia.certification.mantenimiento.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.Map;

@Log4j2
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModelData {

    protected String cedula;
    protected String tipo;
    protected String subtituloListadoCreditos;
    protected String tipoObligacion;
    protected String numeroObligacion;
    protected String diasMora;
    protected String saldoMora;
    protected String cuotasPagadas;
    protected String cuotasVencidas;
    protected String diasEnMora;
    protected String teQuedanPorPagar;
    protected String inicioMora;
    protected String estasAca;
    protected String mensajeSalir;
    protected String estado;


    public static ModelData configModel(Map<String, String> row) {
        return new ModelData(
                row.get("cedula"),
                row.get("tipo"),
                row.get("subtituloListadoCreditos"),
                row.get("tipoObligacion"),
                row.get("numeroObligacion"),
                row.get("diasMora"),
                row.get("saldoMora"),
                row.get("cuotasPagadas"),
                row.get("cuotasVencidas"),
                row.get("diasEnMora"),
                row.get("teQuedanPorPagar"),
                row.get("inicioMora"),
                row.get("estasAca"),
                row.get("mensajeSalir"),
                row.get("estado")
        );
    }
}
