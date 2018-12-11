/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.io.Serializable;

/**
 * Esta Classe serve para definir uma Data, onde estarao contidos atributos e metodos para o mesmo.
 * @author jcunha
 */
public class Data implements Serializable{
    /**
     * Atributo que indica um dia, mes, ano, hora, minuto à Data.
     */
    private final int dia, mes, ano, hora, minuto;
    /**
     * Lista pré-definida com os dos meses.
     */
    public static String[] meses = {"","Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
    /**
     * Construtor da Data.
     * @param dia
     * @param mes
     * @param ano
     * @param hora
     * @param minuto 
     */
    public Data(int dia, int mes, int ano, int hora, int minuto){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.minuto = minuto;
    }
    /**
     * Retorna o Dia.
     * @return 
     */
    public int getDia(){ 
        return this.dia;
    }
    /**
     * Retorna de Mes(string).
     * @return 
     */
    public String getMes(){
        return meses[this.mes];
    }
    /**
     * Retorna o Ano.
     * @return 
     */
    public int getAno(){ 
        return this.ano;
    }
    /**
     *Retorna a Hora.
     * @return 
     */
    public int getHora(){ 
        return this.hora;
    }
    /**
     *Retorna o Minuto.
     * @return 
     */
    public int getMinuto(){ 
        return this.minuto;
    }
    /**
     *Funcao que recebe duas datas e respetivas duracoes e returna False/True caso as datas se sobrepoem ou não.
     * @param data
     * @param duracao
     * @param novaData
     * @param novaDuracao
     * @return 
     */
    public static boolean horaLivre(Data data, double duracao, Data novaData,double novaDuracao){
        double v;
        if (data.getAno() == novaData.getAno()){
            if (data.getMes().equals(novaData.getMes())){
                if (data.getDia() == novaData.getDia()){
                    if (data.getHora() == novaData.getHora())return false;
                    else if (data.getHora() < novaData.getHora()){
                        v = data.getHora() + duracao + data.getMinuto()*0.1 - (novaData.getHora() + novaData.getMinuto()*0.1);
                        if ( v > 0.0) return false;
                        else return true;
                    }
                    else{
                        v = novaData.getHora() + novaDuracao + novaData.getMinuto()*0.1 - (data.getHora() + data.getMinuto()*0.1);
                        if (v > 0.0) return false;
                        else return true;
                    }
                }
                else return true;
            }
            else return true;
        }
        else return true;
    }
    /**
     *Return a Data no formato String.
     * @return 
     */
    @Override
    public String toString(){
        return String.format("Data: %d de %s de %d\tHora: %d:%d\n",dia, Data.meses[mes],ano,hora,minuto);
    }
}
