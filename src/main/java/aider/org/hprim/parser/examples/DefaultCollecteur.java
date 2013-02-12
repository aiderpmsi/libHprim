package aider.org.hprim.parser.examples;

import java.io.PrintStream;

import aider.org.hprim.parser.HPRIMSCollecteur;

/**
 * Implémentation de l'interface HPRIMSCollecteur permettant de sortir sur une sortie
 * de type {@link PrintStream} les éléments du fichier HPRIM sous la forme d'un xml
 * (mais sans l'échappement des caractères xml).
 * Réalise une classe d'exemple d'implémentation de HPRIMSCollecteur
 * @author delabre
 * @version $Revision: 972 $
 */
public class DefaultCollecteur extends HPRIMSCollecteur {
	
	/**
	 * Writer utilisé dans ce collecteur
	 */
	private PrintStream out;
	
	/**
	 * Constructeur
	 */
	public DefaultCollecteur(PrintStream out) {
		this.out = out;
	}
	
	/**
	 * Méthode appelée lorque le parser trouve un élément
	 * @param typeElement
	 * @param nameElement
	 */
	public void startElement(String typeElement, String nameElement) {
		super.startElement(typeElement, nameElement);
		out.print("<" + getCurrentType() + " nom = " + getCurrentName() + ">\n");
	}

	/**
	 * Méthode appelée lorsque le parseur quitte l'élément
	 */
	public void endElement() {
		out.print("<\\" + getCurrentType() + ">\n");
		super.endElement();
	}

	/**
	 * Méthode appelée quand le parseur est à l'intérieur de l'élément
	 * @param contenu
	 */
	public void content(String contenu) {
		out.print(contenu + "\n");
	}	
}
