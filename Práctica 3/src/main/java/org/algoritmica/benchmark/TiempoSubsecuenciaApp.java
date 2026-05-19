package org.algoritmica.benchmark;

import Clases.Subsecuencia;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime) // Medimos tiempo medio
@OutputTimeUnit(TimeUnit.NANOSECONDS) // Resultados en milisegundos
@Warmup(iterations = 3) // Calentamiento de la JVM
@Measurement(iterations = 10) // Tus 10 repeticiones requeridas
@Fork(1)
@State(Scope.Thread)
public class TiempoSubsecuenciaApp {

    // JMH probará automáticamente con todos estos valores de N
    @Param({"64", "128", "256", "512", "1024", "2048", "4096", "8192"})
    public int n;

    private Subsecuencia sub;

    @Setup(Level.Trial) 
    public void setup() {
        sub = new Subsecuencia(n);
    }

    @Benchmark
    public void testFuerzaBruta(Blackhole bh) {
        sub.maxSubsecuenciaSum();
        bh.consume(sub.getSuma()); 
    }

    @Benchmark
    public void testMejorado(Blackhole bh) {
        sub.SubsecuenciaMejorado();
        bh.consume(sub.getSuma());
    }

    @Benchmark
    public void testLineal(Blackhole bh) {
        sub.SubsecuenciaLineal();
        bh.consume(sub.getSuma());
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(TiempoSubsecuenciaApp.class.getSimpleName())
                .build();

        new Runner(opt).run();
    }
}