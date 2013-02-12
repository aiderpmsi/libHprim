package aider.org.hprim.parser;

import java.util.Stack;

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
public abstract class HPRIMSCollecteur {

	/**
	 * Pile FILO permettant de se souvenir du type d'élément antérieur
	 */
	private Stack<String> typeElement = new Stack<String>();

	/**
	 * Pile FILO permettant de se souvenir du nom d'élément antérieur
	 */
	private Stack<String> nameElement = new Stack<String>();
	
	/**
	 * Méthode appelée lorque le parser trouve un élément
	 * @param typeElement
	 * @param nameElement
	 */
	public void startElement(String typeElement, String nameElement) {
		this.typeElement.add(typeElement);
		this.nameElement.add(nameElement);
	}

	/**
	 * Méthode appelée lorsque le parseur quitte l'élément
	 */
	public void endElement() {
		typeElement.pop();
		this.nameElement.pop();
	}
	
	/**
	 * Méthode appelée quand le parseur est à l'intérieur de l'élément
	 * @param content
	 */
	public abstract void content(String content);
	
	/**
	 * Retourne le type de l'élément courant
	 * @return
	 */
	public String getCurrentType() {
		return typeElement.peek();
	}
	
	/**
	 * Retourne le nom de l'élément courant
	 * @return
	 */
	public String getCurrentName() {
		return nameElement.peek();
	}
}
