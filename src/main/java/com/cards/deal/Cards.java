package com.cards.deal;

public class Cards {
	
private String suiteName;
private String name;
private int faceValue;

public Cards(String suiteName, String name, int faceValue) {
	this.suiteName = suiteName;
	this.name = name;
	this.faceValue = faceValue;
}

/**
 * @return the suiteName
 */
public String getSuiteName() {
	return suiteName;
}
/**
 * @param suiteName the suiteName to set
 */
public void setSuiteName(String suiteName) {
	this.suiteName = suiteName;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the faceValue
 */
public int getFaceValue() {
	return faceValue;
}
/**
 * @param faceValue the faceValue to set
 */
public void setFaceValue(int faceValue) {
	this.faceValue = faceValue;
}


}
