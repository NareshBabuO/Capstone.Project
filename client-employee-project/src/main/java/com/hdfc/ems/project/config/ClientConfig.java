package com.hdfc.ems.project.config;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.util.ResourceUtils;
import org.springframework.web.client.RestTemplate;
/**
 *@author NareshBabu O
 *@created Date23-Apr-2023
*
 */
@Configuration
public class ClientConfig {

	@Bean
	RestTemplate restTemplate(RestTemplateBuilder builder) {
	    return builder
	    		.requestFactory( () -> {
					try {
						return validateSSL();
					} catch (KeyManagementException | NoSuchAlgorithmException | KeyStoreException
							| CertificateException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return null;
				})
	            .build();
	}
	 
	 private HttpComponentsClientHttpRequestFactory validateSSL() throws KeyManagementException, NoSuchAlgorithmException, KeyStoreException, CertificateException, FileNotFoundException, IOException{
	     String location = "C:\\Users\\Lenovo\\Desktop\\CapstoneProject\\employee-management-project\\src\\main\\resources\\capstone.p12";
	     String pass = "nareshb";
	     SSLContext sslContext = SSLContextBuilder
                 .create()
                 .loadTrustMaterial(ResourceUtils.getFile(location), pass.toCharArray())
                 .build();
	    
	     SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext,new LocalHostnameVerifier());
	     CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(csf).build();
	     HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory(httpClient);

	     return requestFactory;
	 }

	 private class LocalHostnameVerifier implements HostnameVerifier {
	     @Override
	     public boolean verify(String s, SSLSession sslSession) {
	         return "localhost".equalsIgnoreCase(s) || "127.0.0.1".equals(s);
	     }
	 }

	}
