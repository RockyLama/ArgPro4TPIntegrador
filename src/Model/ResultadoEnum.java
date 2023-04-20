package Model;

public class ResultadoEnum {
    public static String ganador="GANADOR";
    public static String perdedor="PERDEDOR";
    public static String empate="EMPATE";

   public ResultadoEnum() {
		super();
    }

    public static String getGanador() {
		return ganador;
    }

    public static String getPerdedor() {
		return perdedor;
    }

    public static String getEmpate() {
		return empate;
    }
}
