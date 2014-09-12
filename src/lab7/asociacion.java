
/*
	Angel Basegoda, 	13256
	Sergio Cancinos, 	13062
	
	asociacion.java
		se encarga de asociar una palabra en ingles con su equivalente en espanol
*/ 


package lab7;

public class asociacion<K, V> {
    K key;
    V value;
    
	/*se unen las palabras a traves de una asociacion*/
    public void addAsociation(K key, V value){
        this.key = key;
        this.value = value;
    }
	
	/*se obtiene la misma palabra en espanol*/
    public V getValor(){
        return this.value;
    }
	
	/*se obtiene la palabra en ingles*/
    public K getKey(){
        return this.key;
    }
	
}
