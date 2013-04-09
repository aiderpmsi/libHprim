package com.github.aiderpmsi.hprim.parser;

import java.io.IOException;
import java.util.Arrays;


/**
 * Cellte classe garde en mémoire les séparateurs d'un fichier HPRIM 
 * @author delabre
 * @version $Revision: 1027 $
 */
public class HPRIMSDelimiters {

	/**
	 * Liste des délimiteurs :
	 * <ol>
	 *  <li> Délimiteur 1 (champ)</li>
	 *  <li> Délimiteur 2 (sous champ)</li>
	 *  <li> Répétiteur</li>
	 *  <li> Caractère d'échappement</li>
	 *  <li> Délimiteur 3 (sous sous champ)</li>
	 *</ol>
	 */
	private char[] delimiters = new char[DELIMITERS_COUNT];
	
	/**
	 * Nombre de délimiteurs à obtenir (cf norme hprim)
	 */
	private static final int DELIMITERS_COUNT = 5; 

	/**
	 * Choix de délimiteurs. Si le nombre de délimiteurs fourni est différent de ce qui est
	 * attendu, ou si deux délimiteurs sont équivalents, une erreur est lancée
	 * @param Tableau de caractères
	 * @throws IOException Si le nombre de caractères lus ou leur type est incompatible avec la norme HPRIM 
	 */
	public void setDelimiters(char[] delimiters) throws IOException {
		// Vérification de la taille du paramêtre d'entrée
		if (delimiters.length != DELIMITERS_COUNT)
			throw new IOException("Nombre de caractères dans l'entête de délimiteurs insuffisants");
		
		// Vérification de l'unicité des délimiteurs
		if (!distinctElements(delimiters))
			throw new IOException("Répétition de caractères dans l'entête des délimiteurs");

		// Copie de ces délimiteurs
		System.arraycopy(delimiters, 0, this.delimiters, 0, delimiters.length);
	}
	
	/**
	 * Retourne les délimiteurs dans l'ordre où ils apparaissent dans le fichier hprim
	 * @return
	 */
	public char[] getDelimiters() {
		return delimiters;
	}

	/**
	 * Retourne le séparateur de champ
	 * @return délimiteur
	 */
	public char getDelimiter1() {
		return delimiters[0];
	}
	
	/**
	 * Retourne le séparateur de sous-champ
	 * @return délimiteur
	 */
	public char getDelimiter2() {
		return delimiters[1];
	}
	
	/**
	 * Retourne le séparateur de sous-sous-champ
	 * @return délimiteur
	 */
	public char getDelimiter3() {
		return delimiters[4];
	}
	
	/**
	 * Retourne le répétiteur
	 * @return délimiteur
	 */
	public char getRepet() {
		return delimiters[2];
	}

	/**
	 * Retourne le caractère d'échappement
	 * @return délimiteur
	 */
	public char getEchap() {
		return delimiters[3];
	}
	
	/**
     * Vérifie si tous les caractères d'une liste sont différents
     * @param liste Liste de caractres à vérifier
     * @return true si les éléments sont différents
     */
    private static boolean distinctElements(char[] liste) {
    	// Si la liste est vide ou n'a qu'un élément, tous les caractères sont distincts
    	if (liste.length <= 1)
    		return true;
      
    	// Copie de la liste pour pouvoir la torturer
    	char[] listeCopy = new char[liste.length];
    	System.arraycopy(liste, 0, listeCopy, 0, listeCopy.length);
      
    	// Tri de la liste
    	Arrays.sort(listeCopy);
      
    	//On vérifie qu'il n'y a pas 2 éléments se suivants égaux
    	for (int i = 0 ; i < listeCopy.length - 1; i++) {
    		if (listeCopy[i] == listeCopy[i + 1])
    			return false;    			  
    	}
    	
    	// Tous les caractères sont distincts
    	return true;
    }
}
