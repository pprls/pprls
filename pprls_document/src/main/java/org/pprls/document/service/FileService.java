/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.document.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Application service to upload files to the system 
 */
@Service
public class FileService {
	/**
	 * The constructor
	 */
	@Autowired
	public FileService() {
	}

	/**
	 * Upload files from to 
	 * @parameter from filepath to get the files from
	 * @param to filepath were to lay the files
	 */
	public String upload(String from, String to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Remove a file from the server.
	 * @param filepath to be removed
	 */
	public void remove(String filepath) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}


} 
