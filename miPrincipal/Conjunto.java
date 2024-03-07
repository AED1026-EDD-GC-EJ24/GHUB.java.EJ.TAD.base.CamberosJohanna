public class Conjunto {
	static int M = 20;
	private Object cto[];
	private int cardinal;
	private int capacidad;

	public Conjunto()
	{
		cto = new Object[M];
		cardinal = 0;
		capacidad = M;
	}

	public boolean esVacio()
	{
	   return (cardinal == 0);
	}

	public void añadir(Object elemento)
	{
		if (!pertenece(elemento))
		{
			if(cardinal ==capacidad)
			{
				Object [] nuevoCto;
				nuevoCto = new Object[capacidad + M];
				for(int k = 0;k<capacidad;k++)
				nuevoCto[k] = cto[k];
				capacidad += M;
				cto = nuevoCto;
				System.gc();
			}
			cto[cardinal++] = elemento;
		}
	}

	public void retirar(Object elemento)
	{
		if(pertenece(elemento))
		{
			int k = 0;
			while (!cto[k].equals(elemento))
			k++;
			for(;k<cardinal;k++)
			cto[k] = cto[k+1];
			cardinal--;
		}
	}

	public boolean pertenece(Object elemento)
	{
		int k = 0;
		boolean encontrado = false;
		while (k<cardinal && !encontrado)
		{
			encontrado = cto[k].equals(elemento);
			k++;
		}
		return encontrado;
	}

	public int cardinal()
	{
		return this.cardinal;
	}

	public Conjunto union(Conjunto c2)
	{
		Conjunto u = new Conjunto();
		for(int k = 0;k<cardinal;k++)
			u.cto[k] = cto[k];
		u.cardinal = cardinal;
		for (int k=0;k<c2.cardinal;k++)
			u.añadir(c2.cto[k]);
		return u;
	}
	public Object elemento(int n) throws Exception
	{
	  if (n<=cardinal)
		return cto[--n];
	  else
		throw new Exception("Fuera deRango");
	}
}