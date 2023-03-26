package operaciones;


public class Calculo_moneda {
	
	private double valor = 0, resultado = 0;
    private int opcion;

    
    public Calculo_moneda() { }
    
    public double getValor() {return valor;	}
    
	public void setValor(double valor) {this.valor = valor;	}
	
	public double getResultado() {return resultado;	}
	
	public void setResultado(double resultado) {this.resultado = resultado;	}
	
	public int getOpcion() {return opcion;	}
	
	public void setOpcion(int opcion) {	this.opcion = opcion;	}
	
	
	
	public double convertir() {
	
	        switch (opcion) {
	            case 0: //Peso Colombiano a Dolar
	                resultado = valor * 0.00021;
	                break;
	            case 1: //Peso Colombiano a Euros
	                resultado = valor * 0.00019;
	                break;
	            case 2: //Peso Colombiano a Libras Esterlinas
	                resultado = valor * 0.00017;
	                break;
	            case 3: //Peso Colombiano a Yen Japonés
	                resultado = valor * 0.027;
	                break;
	            case 4: //Peso Colombiano a Won sul-coreano
	                resultado = valor * 0.27;
	                break;
	            case 5: //Dólar a Peso Colombiano
	                resultado = valor * 4813.43;
	                break;
	            case 6: // Euros a Peso Colombiano
	                resultado = valor * 5183.01;
	                break;
	            case 7:// Libras Esterlinas a Peso Colombiano
	                resultado = valor * 5883.79;
	                break;
	            case 8: // Yen Japonés a Peso Colombiano
	                resultado = valor * 36.36;
	                break;
	            case 9: // Won sul-coreano a Peso Colombiano
	                resultado = valor * 3.68;
	                break;
	            default:
	                break;
	        }
	        return resultado;
	    }
}
