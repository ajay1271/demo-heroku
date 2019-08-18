package com.edormapp.ws.ui.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edormapp.ws.exceptions.AuthenticationFailedException;
import com.edormapp.ws.model.LoginResponse;
import com.edormapp.ws.services.AuthenticationService;
import com.edormapp.ws.services.UserService;

import Entities.UserAuthTokenEntiy;
import Entities.UserEntity;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.security.Key;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
 // http://localhost:8080/admin
public class AdminController {

	/*

	@Autowired
	AuthenticationService authService;
	
	@Autowired
	UserService userService;

	 @RequestMapping(method=RequestMethod.POST, path="/login", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	    public ResponseEntity<LoginResponse> login (@RequestHeader("authorization") final String authorization) throws AuthenticationFailedException {

	        // Check for correct format for credentials ...
	        String[] decodedArray= authService.authenticate(authorization);

	        // Get Login Response If login is successfull
	       UserAuthTokenEntiy userAuthToken = authService.authenticateUser(decodedArray[0],decodedArray[1]);
	       
	       
	       UserEntity userDetails = userService.getUserByUserId(userAuthToken.getUserId());
	       LoginResponse loginResponse = new LoginResponse();
	       
	       loginResponse.setId(userDetails.getUserId());
	       loginResponse.setFirstName("Success");

	       // List of Exposed Headers ...
	        List<String> header = new ArrayList<>();
	        header.add("access-token");

	        // Set Headers ...
	        HttpHeaders headers = new HttpHeaders();
	        headers.add("access-token",userAuthToken.getAccessToken());
	        headers.setAccessControlExposeHeaders(header);

	        return new ResponseEntity<LoginResponse>(loginResponse,headers,HttpStatus.OK);
	    }

	@PostMapping
	public String getUserName(String token) {
		
		 Claims claims = Jwts.parser()
		            .setSigningKey(DatatypeConverter.parseBase64Binary("ajay"))
		            .parseClaimsJws(token).getBody();
		 
		 return claims.getIssuer();
		
	}
	
	@PostMapping
	public String addAdmin(String userId,String password) {
		
		userService.addAdmin(userId,password);
		
		return "Admin Added";
		
	
	}
	
	
	
	@RequestMapping(method=RequestMethod.POST,path="/create")
	public static String createJWT(String id, String issuer, String subject, long ttlMillis) {
		  
	    //The JWT signature algorithm we will be using to sign the token
	    SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

	    long nowMillis = System.currentTimeMillis();
	    Date now = new Date(nowMillis);

	    //We will sign our JWT with our ApiKey secret
	    byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary("ajay");
	    Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());

	    //Let's set the JWT Claims
	    JwtBuilder builder = Jwts.builder().setId(id)
	            .setIssuedAt(now)
	            .setSubject(subject)
	            .setIssuer(issuer)
	            .signWith(signatureAlgorithm, signingKey);
	  
	    //if it has been specified, let's add the expiration
	    if (ttlMillis > 0) {
	        long expMillis = nowMillis + ttlMillis;
	        Date exp = new Date(expMillis);
	        builder.setExpiration(exp);
	    }  
	  
	    //Builds the JWT and serializes it to a compact, URL-safe string
	    return builder.compact();
	}
	
	/*

	@PostMapping
	public StudentDetailsResponseModel addStudent(@RequestBody StudentDetailsRequestModel studentDetailRequestModel) {

		StudentDetailsResponseModel returnValue = new StudentDetailsResponseModel();
		StudentDataTransferObject studentDataTransferObject = new StudentDataTransferObject();
		BeanUtils.copyProperties(studentDetailRequestModel, studentDataTransferObject);
		StudentDataTransferObject addedStudentDetails = adminService.addStudent(studentDataTransferObject);
		BeanUtils.copyProperties(addedStudentDetails, returnValue);

		return returnValue;

	}

	@RequestMapping(method = RequestMethod.POST, path = "/{adminId}/registerComplaint", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ComplaintsListEntity registerAComplaint(@PathVariable String adminId,
			@RequestBody ComplaintRequestModel complaintRequestModel) {

		ComplaintsListEntity complaintsListEntity = new ComplaintsListEntity();

		BeanUtils.copyProperties(complaintRequestModel, complaintsListEntity);

		complaintsListEntity.setUserId(adminId);

		return adminService.registerAComplaint(complaintsListEntity);

	}

*/
	public String updateStudentDetails() {
		return "updateStudent was called";
	}

}
