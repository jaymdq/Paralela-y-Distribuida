package moldyn.Better;

import jgfutil.JGFInstrumentor;

public class Main {

	private static int cantidadRepeticiones = 1;
	private static int limiteSuperiorDeThreads = 10;
	
	public static void main(String[] args) {
				
		// Variación de cantidad de threads
		for (int nthreads = 1; nthreads <= limiteSuperiorDeThreads; nthreads++){
			System.out.println("\nCantidad de Threads: " + nthreads);
			
			// Variación de cantidad de repeticiones
			for (int rep = 1; rep <= cantidadRepeticiones; rep++){
				System.out.println("Repetición: " + rep);
				
				String[] params = {""+nthreads};
				JGFMolDynBenchSizeB_Better.main(params);				
				
				// Se borran los timers
				JGFInstrumentor.clearTimers();
			}
		}
		
	}
}
