/***********************************************************************************************************
 *This file is an interface for the all opration methods
 *@author  :vishal kumar
 *@version :1.0
 *@date    :05/12/19
 *@File    :ClinicService.java
 ***********************************************************************************************************/

package com.blbz.services;
import org.json.simple.JSONArray;

public interface CliniqueService {

	void doctorDetails();

	void readDoctorData(String key, String value, String choice);

	void readPatientData(String key, String value);

}