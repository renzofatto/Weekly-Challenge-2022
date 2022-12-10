package com.mouredev.weeklychallenge2022

/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Fecha publicación enunciado: 03/01/22
 * Fecha publicación resolución: 10/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

fun main() {
    println(isAnagram("amor", "roma"))
}

private fun isAnagram(wordOne: String, wordTwo: String): Boolean {
    if (wordOne.lowercase() == wordTwo.lowercase()) {
        return false
    }
    return wordOne.lowercase().toCharArray().sortedArray().contentEquals(wordTwo.lowercase().toCharArray().sortedArray())
}


//---------------------------------------------------
//C#
//---------------------------------------------------


using System;

public class Challenge01
{
    public static void Main(string[] args)
    {
        Console.WriteLine(Anagrama("jamon","Nojam"));
    }
    
    private static bool Anagrama(string palabra1, string palabra2){
        string pal1 = palabra1.ToLower();
        string pal2 = palabra2.ToLower();
        bool continuar = false;
        
        if(!pal1.Equals(pal2) && pal1.Length==pal2.Length){
            for (int i =0; i< pal1.Length; i++){
                for(int j=0; j<pal2.Length && !continuar; i++){
                    if (pal1[i].Equals(pal2[j])){
                        continuar = true;
                    }
                }
                if (!continuar){
                    return false;
                }
            }
        }
        return continuar;
    }   
}
