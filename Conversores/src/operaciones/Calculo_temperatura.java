package operaciones;


public class Calculo_temperatura {
	
	String de ="C°", a="C°";
	double temp = 0.0;
	double valor = 1;

    
	public String getDe() {return de;	}


	public void setDe(String de) {this.de = de;	}


	public String getA() {return a;}


	public void setA(String a) {this.a = a;	}


	public double getTemp() {return temp;}


	public void setTemp(double temp) {this.temp = temp;	}


	public double getValor() {return valor;}


	public void setValor(double valor) {this.valor = valor;
	}


	public double convertirTemperatura() {
	
	        switch (de) {
	            case "C°": 
	                if(a.equals("F°")) {
	                	temp = ((9 * valor) / 5)+32;
	                }else if (a.equals("K°")) {
	                	temp = valor + 273.15;
	                } else {
	                	temp = valor;
	                }
	                break;
	            case "F°": 
	                if(a.equals("C°")) {
	                	temp = ((5 * (valor - 32))/9);	                	
	                }else if (a.equals("K°")) {
	                	temp = ((5 * (valor - 32))/9)+ 273.15;
	                } else {
	                	temp = valor;
	                } 
	                break;
	            case "K°": 
	                if(a.equals("C°")) {
	                	temp = valor - 273.15;
	                }else if (a.equals("F°")) {
	                	temp = ((9 * (valor - 273.15))/5) + 32;
	                } else {
	                	temp = valor;
	                }
	                break;
	        } 
        return temp;
       
	    }
}
