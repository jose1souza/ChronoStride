package javarecordscontrol;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Recorde {
    private LocalDate dataRecorde;
    private String nome;
    private double tempo;

    public LocalDate getDataRecorde() {
        return dataRecorde;
    }

    public void setDataRecorde(LocalDate dataRecorde) {
        this.dataRecorde = dataRecorde;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString(){
        String dataFormatada = 
                this.dataRecorde.format
              (DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        return "Nome:"+this.nome + " Tempo:" +this.tempo
                 + " Data:"+dataFormatada;
    }
    
    
}
