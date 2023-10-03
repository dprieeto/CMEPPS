package empleado;

public class Empleado {
	public enum TipoEmpleado {
		Vendedor, Encargado
	};
	
	public float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		float salariobase = 0, primas = 0, extras = 0;
		final int PRECIO_HE = 30;	
		
		//determinacion salario base:
		if(tipo == TipoEmpleado.Vendedor)
			salariobase = 2000;
		else if (tipo == TipoEmpleado.Encargado)
			salariobase =2500;
		//determinacion prima:
		if(ventasMes >= 1500)
			primas = 200;
		else if (ventasMes >= 1000)
			primas = 100;
		//determinacion extras
		extras = horasExtra*PRECIO_HE;
				
		return salariobase + primas + extras;
	}
}
