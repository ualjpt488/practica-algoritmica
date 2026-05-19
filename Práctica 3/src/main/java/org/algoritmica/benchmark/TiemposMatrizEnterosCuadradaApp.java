package org.algoritmica.benchmark;

import Clases.MatrizEnterosCuadrada;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import org.openjdk.jmh.infra.Blackhole;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 10)
@Measurement(iterations = 10)
@Fork(1)

public class TiemposMatrizEnterosCuadradaApp {

	 @Benchmark
	    public void testOrdenarFilas(BenchmarkState state, Blackhole bh) {
	        bh.consume(state.matriz.matrizOrdenadaPorFilas());
	    }
	 
	public static void main(String[] args) throws RunnerException {
	    Options opt = new OptionsBuilder()
	            .include(TiemposMatrizEnterosCuadradaApp.class.getSimpleName())
	            .build();

	    new Runner(opt).run();
	}
	
    @State(Scope.Thread)
    public static class BenchmarkState {
        @Param({"32","64","128", "256", "512", "1024","2048", "4096", "8192"})
        public int n;

        public MatrizEnterosCuadrada matriz;

        @Setup(Level.Trial)
        public void setup() {
            matriz = new MatrizEnterosCuadrada(n);
        }
    }
   
}