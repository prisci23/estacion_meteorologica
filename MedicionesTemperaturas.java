import java.util.ArrayList; 

/**
 * Registros de temperaturas diarios de una estacion meteorológica
 * autor: priscila 
 */
public class MedicionesTemperaturas
{
    /**
     * Contiene las mediciones de temperaturas.
     */
    private ArrayList<Integer> registros;
    
    /**
     * Dia del registro
     */
    private int dia;
    
    /**
     * Mes del registro
     */
    private int mes;
    
    /**
     * Constructor de la clase. Inicializa dia y mes con los parámetros respectivos,
     * y la lista de registros se inicializa vacía (sin mediciones).
     * Precondición: 
     *  - dia debe ser un día válido (entre 1 y 31)
     *  - mes debe ser un mes válido (entre 1 y 12)
     */
    public MedicionesTemperaturas(int dia, int mes) {
        assert dia >= 1 && dia <= 31;
        assert mes >= 1 && mes <= 12;
        this.dia = dia;
        this.mes = mes;
        this.registros = new ArrayList<Integer>();
    }
    
    /**
     * Agrega una temperatura al registro de temperaturas
     */
    public void agregarRegistro(int nuevaTemperatura) {
        registros.add(new Integer(nuevaTemperatura));
    }
    
    /**
     * Muestra todas las temperaturas registradas en 
     * la pantalla. 
     */
    public void cantTemperaturasExtremas(){
        System.out.println(dia + "/" + mes);
        int ext = 0;
        for (Integer temperatura: registros) {
              if ( temperatura > 35 || temperatura  < -15){
              System.out.print(ext + ": ");
              System.out.println(temperatura + "C");
              ext = ext + 1;
            }
        }
    }
     public int promedioTemp(){
        int prom = 0;
        for (Integer temperatura: registros) {
            temperatura += temperatura ;
           
        }
        return prom / registros.size();
    }
    public int maxTemperatura(){
        int maxtem = registros.get(0);
        for (Integer temperatura: registros) {
            if (temperatura > maxtem) {
                maxtem = temperatura;
            }
        }
        return maxtem;
    }
     public int minTemperatura(){
        int mintem = registros.get(0);
        for (Integer temperatura: registros) {
            if (temperatura < mintem) {
                mintem = temperatura;
            }
        }
        return mintem;
    }
    public void imprimirTemperaturas() {
        System.out.println(dia + "/" + mes);
        int pos = 0;
        for (Integer temperatura: registros) {
            System.out.print(pos + ": ");
            System.out.println(temperatura + "C");
            pos = pos + 1;
        }
    }
    
}
