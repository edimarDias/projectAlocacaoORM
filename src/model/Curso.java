
package model;

import enums.Turnos;

public class Curso {
    private int id;
    private String nome;
    private Turnos turno;
    private Professor coordenador;
    private int carga;
    //
    public Curso() {
        this.setId(0);
        this.setNome("noname");
        this.setTurno(Turnos.N);
        this.setCoordenador(null);
        this.setCarga(1);
    }
    public Curso(String nome, Turnos turno, Professor coordenador, int carga) {
          this.setId(0);
        this.setNome(nome);
        this.setTurno(turno);
        this.setCoordenador(coordenador);
        this.setCarga(carga);
    }
    //
    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty()?"NONAME":nome.toUpperCase();
    }
    public void setTurno(Turnos turno) {
        this.turno = turno;
    }
    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador==null ? new Professor() : coordenador;
    }
    public void setCarga(int carga) {
        this.carga = (carga<1) ? 1 : carga;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    //
    public String getNome() {
        return this.nome;
    }
    public Turnos getTurno() {
        return this.turno;
    }
    public Professor getCoordenador() {
        return this.coordenador;
    }
    public int getCarga() {
        return this.carga;
    }

    public int getId() {
        return this.id;
    }
    
    
    //
    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Curso other = (Curso) obj;
        return this.id == other.id;
    }
    
    
    
    
    
    
    
    
    
}
