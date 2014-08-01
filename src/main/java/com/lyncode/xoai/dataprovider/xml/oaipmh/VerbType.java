//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.13 at 08:24:23 PM WET 
//

package com.lyncode.xoai.dataprovider.xml.oaipmh;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * Java class for verbType.
 * 
 *
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * 












 * 
 */
@XmlType(name = "verbType")
@XmlEnum
public enum VerbType {

	@XmlEnumValue("Identify")
	IDENTIFY("Identify"), @XmlEnumValue("ListMetadataFormats")
	LIST_METADATA_FORMATS("ListMetadataFormats"), @XmlEnumValue("ListSets")
	LIST_SETS("ListSets"), @XmlEnumValue("GetRecord")
	GET_RECORD("GetRecord"), @XmlEnumValue("ListIdentifiers")
	LIST_IDENTIFIERS("ListIdentifiers"), @XmlEnumValue("ListRecords")
	LIST_RECORDS("ListRecords");
	private final String value;

	VerbType(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static VerbType fromValue(String v) {
		for (VerbType c : VerbType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}