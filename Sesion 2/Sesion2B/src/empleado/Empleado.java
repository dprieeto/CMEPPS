package empleado;

public class Empleado {
	public enum TipoEmpleado {
		Vendedor, Encargado
	};
	
	public static float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
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
		else if(ventasMes < 0)
			primas = 0;
		//determinacion extras
		if(horasExtra < 0)
			horasExtra = 0;
		extras = horasExtra*PRECIO_HE;
				
		return salariobase + primas + extras;
	}
	
	public static float calculoNominaNeta(float nominaBruta) {
		if(nominaBruta <0)
			nominaBruta = 0;
		float salarioNeto = 0, retencion = 0;
		if(nominaBruta <= 2100)
			retencion = 0;
		else if(nominaBruta > 2100 && nominaBruta < 2500)
			retencion = (float) 0.15;
		else if(nominaBruta >= 2500)
			retencion = (float) 0.18;
		salarioNeto = nominaBruta*(1-retencion);
		return salarioNeto;
	}
	
	
}
