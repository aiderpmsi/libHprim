package aider.org.hprim.parser;

import org.antlr.runtime.RecognitionException;

/**
 * Définition de la structure de base de collecte des élément du hpri
 * 3 fonctions permettent de récupérer les données parsées :
 * <ul>
 *  <li>startElement</li>
 *  <li>content</li>
 *  <li>endElement</li>
 * </ul>
 * 
 * Les différents types d'éléments sont les suivants :
 * <ul>
 *  <li>"message" : début du fichier</li>
 *  <li>"ligne" : début de ligne</li>
 *  <li>"champ" : début de champ</li>
 * </ul>
 * @author delabre
 * @version $Revision: 1029 $
 */
public interface ContentHandler {

	/**
	 * Méthode appelée lorque le parser trouve un élément
	 * @param typeElement
	 * @param nameElement
	 */
	public void startElement(String typeElement, String nameElement) throws RecognitionException;

	/**
	 * Méthode appelée lorsque le parseur quitte l'élément
	 */
	public void endElement() throws RecognitionException;
	
	/**
	 * Méthode appelée quand le parseur est à l'intérieur de l'élément
	 * @param content
	 */
	public void content(String content) throws RecognitionException;

}
