package com.moleksyuk.chapter7.Bridge;

/**
 * Based on: "Patterns in Java", Mark Grand.
 * 
 * Date: Aug 7, 2011
 * 
 * @author moleksyuk
 */
public interface IStreamingSensorListener {

	void processMeasurement(int value);

}
