package Entrega2;
import java.util.ArrayList;

/**
 * Write a description of class Estacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estacion extends Node
{
    ArrayList<Cliente> clientesCercanos = new ArrayList<Cliente>();
    
    public Estacion(char tipo,int x, int y, int id){
        super(tipo,x,y,id);
    }
    
    public void addCliente(Cliente c){
        clientesCercanos.add(c);
    }
}
