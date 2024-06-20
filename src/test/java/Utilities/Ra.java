package Utilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import org.json.JSONObject;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Ra extends BaseClass{

	public static ArrayList<String>numbers= new ArrayList<>();
	public static ArrayList<String>branches= new ArrayList<>();
	public static ArrayList<String>processors= new ArrayList<>();
	public static ArrayList<String>members= new ArrayList<>();
	public static ArrayList<String>branchIds= new ArrayList<>();
	public static ArrayList<String>branchhdpe= new ArrayList<>();
	public static ArrayList<String>branchpet= new ArrayList<>();
	public static ArrayList<String>processorpet= new ArrayList<>();
	public static ArrayList<String>processorhdpe= new ArrayList<>();
	public static ArrayList<String>processorIds= new ArrayList<>();
	public static String bonusOrderName;
	
	public static String getRandomProcessorName() {
        String prefix = "process_";
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder result = new StringBuilder(prefix);
        
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            int randomIndex = random.nextInt(characters.length());
            result.append(characters.charAt(randomIndex));
        }
        
        return result.toString();
    }

public static String getRandomBranch1Name() {
    String prefix = "brancha_";
    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    StringBuilder result = new StringBuilder(prefix);

    int length = 8;
    Random random = new Random();

    for (int i = 0; i < length; i++) {
        int randomIndex = random.nextInt(characters.length());
        result.append(characters.charAt(randomIndex));
    }

    return result.toString();
}
public static String getRandomBranch2Name() {
    String prefix = "branchb_";
    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    StringBuilder result = new StringBuilder(prefix);

    int length = 8;
    Random random = new Random();

    for (int i = 0; i < length; i++) {
        int randomIndex = random.nextInt(characters.length());
        result.append(characters.charAt(randomIndex));
    }

    return result.toString();
}
public static String getRandomBranch3Name() {
    String prefix = "branchc_";
    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    StringBuilder result = new StringBuilder(prefix);

    int length = 8;
    Random random = new Random();

    for (int i = 0; i < length; i++) {
        int randomIndex = random.nextInt(characters.length());
        result.append(characters.charAt(randomIndex));
    }

    return result.toString();
}


 public static String getRandomStringWithChars(int length, String characters) {
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        
        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(random.nextInt(characters.length())));
        }
        
        return result.toString();
    }

    public static String generateUniqueDeviceID() {
        String format = "XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX";
        String characters = "ABCDEF0123456789";

        StringBuilder deviceId = new StringBuilder();

        for (int i = 0; i < format.length(); i++) {
            if (format.charAt(i) == 'X') {
                char randomChar = characters.charAt(new Random().nextInt(characters.length()));
                deviceId.append(randomChar);
            } else {
                deviceId.append(format.charAt(i));
            }
        }

        return deviceId.toString();
    }
    
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder result = new StringBuilder();
        
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            result.append(characters.charAt(randomIndex));
        }
        
        return result.toString();
    }
    Instant now = Instant.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd'T'HH:mm:ss.SSSX").withZone(ZoneOffset.UTC);
    String formattedDateTime = formatter.format(now);


public void sendPostRequest() throws IOException {
RestAssured.baseURI = "https://qapb.cognitionfoundry.io"; // Your API endpoint

for(int i=0;i<5;i++) {
//MEMBER CREATION------------------------------------------------------------------------------------------------------------------------------------------------
// Generate random username starting with "Fleek"
String memberName = "StrongestMember" + getRandomStringWithChars(6, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789");
members.add(memberName);
System.out.println("member name is "+memberName);
// Generate random phone number starting with "+63" and numbers only
String memberNumber = "+63" + getRandomStringWithChars(10, "0123456789");
System.out.println("member number is "+memberNumber);
numbers.add(memberNumber);
// Generate unique device ID
String deviceID = generateUniqueDeviceID();

// Read the JSON template file
String templatePath = ".\\mtemplate.json"; // Update the path
String templateContent = Files.readString(Paths.get(templatePath));

// Replace placeholders with actual values
String requestBody = templateContent
    .replace("{{randomUsername}}", memberName)
    .replace("{{randomNumber}}", memberNumber)
    .replace("{{deviceID}}", deviceID);

// Send the REST Assured request
Response response = RestAssured.given()
    .contentType(ContentType.JSON)
    .body(requestBody)
    .post("/register"); // Endpoint
String id = response.path("id");
System.out.println("id "+id);
// Process the response as needed
System.out.println("Response: " + response.body().asString());


if (i==1) {
//LOGIN----FOR-----BRANCH----------------------------------------------------------------------------------------------------------------------------

String loginPath = ".\\logintemplate.json"; // Update the path
String loginContent = Files.readString(Paths.get(loginPath));
String requestBodylogin = loginContent
		.replace("{{randomNumber}}", memberNumber)
		.replace("{{deviceID}}", deviceID);
        
Response responselogin = RestAssured.given()
        .contentType(ContentType.JSON)
        .body(requestBodylogin)
        .post("/login"); // Endpoint
String token = responselogin.jsonPath().getString("token");
System.out.println("Response: " + responselogin.body().asString());

//CREATE BRANCH------------------------------------------------------------------------------------------------
String branchname=getRandomBranch1Name();
branches.add(branchname);
System.out.println("branch name is "+branchname);
String branchPath = ".\\branchtemplate.json"; // Update the path
String branchContent = Files.readString(Paths.get(branchPath));
String requestBodybranch = branchContent
		.replace("{{randomBranchName}}", branchname)
		.replace("{{bid}}",id)
		.replace("{{randomNumber}}",memberNumber);
Response responsebranch = RestAssured.given()
        .contentType(ContentType.JSON)
        .header("Authorization", "Bearer " + token) // Set the Authorization header
        .body(requestBodybranch)
        .post("/cp"); // Endpoint
System.out.println("Response: " + responsebranch.body().asString());
String branchid= responsebranch.path("id");
branchIds.add(branchid);
System.out.println("branchid "+branchid);
//ADD MATERIALS----BRANCH------------------------------------------------------------------------------------------------

String hdpePath = ".\\hdpetemplate.json"; // Update the path
String hdpeContent = Files.readString(Paths.get(hdpePath));
String requestBodyhdpe = hdpeContent
		.replace("{{id}}", branchid);
Response responsehdpe=RestAssured.given()
		.contentType(ContentType.JSON)
		.header("Authorization", "Bearer " + token) // Set the Authorization header
        .body(requestBodyhdpe)
        .post("/cp/"+branchid+"/item"); // Endpoint
String bitem1id= responsehdpe.path("id");
branchhdpe.add(bitem1id);
System.out.println("Response: " + responsehdpe.body().asString());
String petPath = ".\\pettemplate.json"; // Update the path
String petContent = Files.readString(Paths.get(petPath));
String requestBodypet = petContent
		.replace("{{id}}", branchid);
Response responsepet=RestAssured.given()
		.contentType(ContentType.JSON)
		.header("Authorization", "Bearer " + token) // Set the Authorization header
        .body(requestBodypet)
        .post("/cp/"+branchid+"/item"); // Endpoint
String bitem2id = responsepet.path("id");
branchpet.add(bitem2id);
System.out.println("Response: " + responsepet.body().asString());
}
if (i==2) {
	//LOGIN----FOR-----BRANCH----------------------------------------------------------------------------------------------------------------------------

	String loginPath = ".\\logintemplate.json"; // Update the path
	String loginContent = Files.readString(Paths.get(loginPath));
	String requestBodylogin = loginContent
			.replace("{{randomNumber}}", memberNumber)
			.replace("{{deviceID}}", deviceID);
	        
	Response responselogin = RestAssured.given()
	        .contentType(ContentType.JSON)
	        .body(requestBodylogin)
	        .post("/login"); // Endpoint
	String token = responselogin.jsonPath().getString("token");
	System.out.println("Response: " + responselogin.body().asString());

	//CREATE BRANCH------------------------------------------------------------------------------------------------
	String branchname=getRandomBranch2Name();
	branches.add(branchname);
	System.out.println("branch name is "+branchname);
	String branchPath = ".\\branchtemplate.json"; // Update the path
	String branchContent = Files.readString(Paths.get(branchPath));
	String requestBodybranch = branchContent
			.replace("{{randomBranchName}}", branchname)
			.replace("{{bid}}",id)
			.replace("{{randomNumber}}",memberNumber);
	Response responsebranch = RestAssured.given()
	        .contentType(ContentType.JSON)
	        .header("Authorization", "Bearer " + token) // Set the Authorization header
	        .body(requestBodybranch)
	        .post("/cp"); // Endpoint
	System.out.println("Response: " + responsebranch.body().asString());
	String branchid= responsebranch.path("id");
	branchIds.add(branchid);
	System.out.println("branchid "+branchid);
	//ADD MATERIALS----BRANCH------------------------------------------------------------------------------------------------

	String hdpePath = ".\\hdpetemplate.json"; // Update the path
	String hdpeContent = Files.readString(Paths.get(hdpePath));
	String requestBodyhdpe = hdpeContent
			.replace("{{id}}", branchid);
	Response responsehdpe=RestAssured.given()
			.contentType(ContentType.JSON)
			.header("Authorization", "Bearer " + token) // Set the Authorization header
	        .body(requestBodyhdpe)
	        .post("/cp/"+branchid+"/item"); // Endpoint
	String bitem1id= responsehdpe.path("id");
	branchhdpe.add(bitem1id);
	System.out.println("Response: " + responsehdpe.body().asString());
	String petPath = ".\\pettemplate.json"; // Update the path
	String petContent = Files.readString(Paths.get(petPath));
	String requestBodypet = petContent
			.replace("{{id}}", branchid);
	Response responsepet=RestAssured.given()
			.contentType(ContentType.JSON)
			.header("Authorization", "Bearer " + token) // Set the Authorization header
	        .body(requestBodypet)
	        .post("/cp/"+branchid+"/item"); // Endpoint
	String bitem2id = responsepet.path("id");
	branchpet.add(bitem2id);
	System.out.println("Response: " + responsepet.body().asString());
	}
if (i==3) {
	//LOGIN----FOR-----BRANCH----------------------------------------------------------------------------------------------------------------------------

	String loginPath = ".\\logintemplate.json"; // Update the path
	String loginContent = Files.readString(Paths.get(loginPath));
	String requestBodylogin = loginContent
			.replace("{{randomNumber}}", memberNumber)
			.replace("{{deviceID}}", deviceID);
	        
	Response responselogin = RestAssured.given()
	        .contentType(ContentType.JSON)
	        .body(requestBodylogin)
	        .post("/login"); // Endpoint
	String token = responselogin.jsonPath().getString("token");
	System.out.println("Response: " + responselogin.body().asString());

	//CREATE BRANCH------------------------------------------------------------------------------------------------
	String branchname=getRandomBranch3Name();
	branches.add(branchname);
	System.out.println("branch name is "+branchname);
	String branchPath = ".\\branchtemplate.json"; // Update the path
	String branchContent = Files.readString(Paths.get(branchPath));
	String requestBodybranch = branchContent
			.replace("{{randomBranchName}}", branchname)
			.replace("{{bid}}",id)
			.replace("{{randomNumber}}",memberNumber);
	Response responsebranch = RestAssured.given()
	        .contentType(ContentType.JSON)
	        .header("Authorization", "Bearer " + token) // Set the Authorization header
	        .body(requestBodybranch)
	        .post("/cp"); // Endpoint
	System.out.println("Response: " + responsebranch.body().asString());
	String branchid= responsebranch.path("id");
	branchIds.add(branchid);
	System.out.println("branchid "+branchid);
	//ADD MATERIALS----BRANCH------------------------------------------------------------------------------------------------

	String hdpePath = ".\\hdpetemplate.json"; // Update the path
	String hdpeContent = Files.readString(Paths.get(hdpePath));
	String requestBodyhdpe = hdpeContent
			.replace("{{id}}", branchid);
	Response responsehdpe=RestAssured.given()
			.contentType(ContentType.JSON)
			.header("Authorization", "Bearer " + token) // Set the Authorization header
	        .body(requestBodyhdpe)
	        .post("/cp/"+branchid+"/item"); // Endpoint
	String bitem1id= responsehdpe.path("id");
	branchhdpe.add(bitem1id);
	System.out.println("Response: " + responsehdpe.body().asString());
	String petPath = ".\\pettemplate.json"; // Update the path
	String petContent = Files.readString(Paths.get(petPath));
	String requestBodypet = petContent
			.replace("{{id}}", branchid);
	Response responsepet=RestAssured.given()
			.contentType(ContentType.JSON)
			.header("Authorization", "Bearer " + token) // Set the Authorization header
	        .body(requestBodypet)
	        .post("/cp/"+branchid+"/item"); // Endpoint
	String bitem2id = responsepet.path("id");
	branchpet.add(bitem2id);
	System.out.println("Response: " + responsepet.body().asString());
	}
if(i==4) {
//LOGIN FOR PROCESSOR-----------------------------------------------------------------------------------------------
String loginPathP = ".\\logintemplate.json"; // Update the path
String loginContentP = Files.readString(Paths.get(loginPathP));
String requestBodyloginP = loginContentP
		.replace("{{randomNumber}}", memberNumber)
		.replace("{{deviceID}}", deviceID);
        
Response responseloginP = RestAssured.given()
        .contentType(ContentType.JSON)
        .body(requestBodyloginP)
        .post("/login"); // Endpoint
String tokenP = responseloginP.jsonPath().getString("token");


System.out.println("Response: " + responseloginP.body().asString());

//CREATE PROCESSOR-----------------------------------------------------------------------------------------------
String processorname=getRandomProcessorName();
processors.add(processorname);
System.out.println("processor name is "+processorname);
String processorPath = ".\\processortemplate.json"; // Update the path
String processorContent = Files.readString(Paths.get(processorPath));
String requestBodyprocessor = processorContent
		.replace("{{randomProcessorName}}", processorname)
		.replace("{{userId}}",id)
		.replace("{{randomNumber}}",memberNumber);
Response responseprocessor = RestAssured.given()
		.contentType(ContentType.JSON)
        .header("Authorization", "Bearer " + tokenP) // Set the Authorization header
        .body(requestBodyprocessor)
        .post("/rc"); // Endpoint
System.out.println("Response: " + responseprocessor.body().asString());
String processorid= responseprocessor.path("id");
processorIds.add(processorid);
System.out.println("processorid "+processorid);

//ADD MATERIALS---PROCESSOR-------------------------------------------------------------------------------------------------
String hdpePathP = ".\\hdpeprocessor.json"; // Update the path
String hdpeContentP = Files.readString(Paths.get(hdpePathP));
String requestBodyhdpeP = hdpeContentP
		.replace("{{id}}", processorid);
Response responsehdpeP=RestAssured.given()
		.contentType(ContentType.JSON)
		.header("Authorization", "Bearer " + tokenP) // Set the Authorization header
        .body(requestBodyhdpeP)
        .post("/rc/"+processorid+"/item"); // Endpoint
String pitem1id= responsehdpeP.path("id");
processorhdpe.add(pitem1id);
System.out.println("Response: " + responsehdpeP.body().asString());

String petPathP = ".\\petprocessor.json"; // Update the path
String petContentP = Files.readString(Paths.get(petPathP));
String requestBodypetP = petContentP
		.replace("{{id}}", processorid);
Response responsepetP=RestAssured.given()
		.contentType(ContentType.JSON)
		.header("Authorization", "Bearer " + tokenP) // Set the Authorization header
        .body(requestBodypetP)
        .post("/rc/"+processorid+"/item"); // Endpoint
String pitem2id = responsepetP.path("id");
processorpet.add(pitem2id);
System.out.println("Response: " + responsepetP.body().asString());

} 

}  

JSONObject data=new JSONObject();
data.put("phoneNumber", "+919560071590");
data.put("pin", "123456a");
data.put("app", "ADMIN");
Response responsealchemylogin=RestAssured.given()
.contentType("application/json")
.body(data.toString())
.when()
.post("/pl/admin/login");

String sessioncode= responsealchemylogin.path("sessionCode");

JSONObject data1 = new JSONObject();
data1.put("smsCode","778899");
data1.put("sessionCode",sessioncode);
Response responsealchemy2fal=RestAssured.given()
		.contentType("application/json")
		.body(data1.toString())
		.when()
		.post("/admin/two_factor_auth_login");
String alchemytoken= responsealchemy2fal.path("token");

for(int i=0;i<3;i++) {
JSONObject data2 = new JSONObject();
data2.put("offsetEligible",true);
         given()
		.contentType(ContentType.JSON)
		.header("Authorization", "Bearer " + alchemytoken) 
		.body(data2.toString())
		.post("/admin/cp/"+ branchIds.get(i)+"/item/"+branchhdpe.get(i));

JSONObject data3 = new JSONObject();
         data3.put("offsetEligible",true);
                  given()
         		.contentType(ContentType.JSON)
         		.header("Authorization", "Bearer " + alchemytoken) 
         		.body(data3.toString())
         		.post("/admin/cp/"+ branchIds.get(i)+"/item/"+branchpet.get(i));
   
}

for(int i=0;i<3;i++) {
String editbranch = ".\\editbranch.json"; // Update the path
String editBranch = Files.readString(Paths.get(editbranch));
String requestEditBranch = editBranch
		.replace("{{randomBranchName}}", branches.get(i))
		.replace("{{randomNumber}}", numbers.get(i+1));
Response responseEditBranch=RestAssured.given()
		.contentType(ContentType.JSON)
		.header("Authorization", "Bearer " + alchemytoken) // Set the Authorization header
        .body(requestEditBranch)
        .post("/admin/cp/"+branchIds.get(i)); // Endpoint
int t=i+1;
System.out.println("Response for "+t+" branch edit: " + responseEditBranch.body().asString());

}            
                 
String editprocessor = ".\\editprocessor.json"; // Update the path
String editProcessor = Files.readString(Paths.get(editprocessor));
String requestEditProcessor = editProcessor
		.replace("{{randomProcessorName}}", processors.get(0))
		.replace("{{randomNumber}}", numbers.get(4));
Response responseEditProcessor=RestAssured.given()
		.contentType(ContentType.JSON)
		.header("Authorization", "Bearer " + alchemytoken) // Set the Authorization header
        .body(requestEditProcessor)
        .post("/admin/rc/"+processorIds.get(0)); // Endpoint

System.out.println("Response for processor edit: " + responseEditProcessor.body().asString());


JSONObject data5 = new JSONObject();
data5.put("type","CREATE_OFFSET");
Response twofafb=RestAssured.  given()
		.contentType(ContentType.JSON)
		.header("Authorization", "Bearer " + alchemytoken) 
		.body(data5.toString())
		.post("/admin/init_two_factor_auth");
String bonusordersessionCode= twofafb.path("sessionCode");
System.out.println("Response for two fac auth for bonus order: " + twofafb.body().asString());

// Generate a random string
String randomText = generateRandomString(6);
 bonusOrderName = "Fleek" + randomText;
String bonus = ".\\bonusordercreation.json"; // Update the path
String bonuscreate = Files.readString(Paths.get(bonus));
String bonusCreationbody = bonuscreate
		.replace("{{bonusOrderName}}", bonusOrderName)
		.replace("{{formattedDateTime}}", formattedDateTime)
		.replace("{{b1branchid}}", branchIds.get(0))
		.replace("{{b2branchid}}", branchIds.get(1))
		.replace("{{b3branchid}}", branchIds.get(2))
		.replace("{{bonusordersessionCode}}", bonusordersessionCode);
Response responseBonusOrderCreation=RestAssured.given()
		.contentType(ContentType.JSON)
		.header("Authorization", "Bearer " + alchemytoken) // Set the Authorization header
        .body(bonusCreationbody)
        .post("/pl/admin/offset"); // Endpoint
String bonusorderid=responseBonusOrderCreation.path("id");
System.out.println("Response for bonus order creation: " + responseBonusOrderCreation.body().asString());



JSONObject data6 = new JSONObject();
data6.put("type","UPDATE_OFFSET");
Response twofafboe=RestAssured.  given()
		.contentType(ContentType.JSON)
		.header("Authorization", "Bearer " + alchemytoken) 
		.body(data6.toString())
		.post("/admin/init_two_factor_auth");
String addprosessionCode= twofafboe.path("sessionCode");
System.out.println("Response for two factor auth for bonus order edit : " + twofafboe.body().asString());

String last="addprocessorinbonusorder.json";
String lAst = Files.readString(Paths.get(last));

String lastbody=lAst
		.replace("{{addprosessionCode}}", addprosessionCode)
		.replace("{{p1processorid}}", processorIds.get(0));
Response responselast=RestAssured.given()
		.contentType(ContentType.JSON)
		.header("Authorization", "Bearer " + alchemytoken) // Set the Authorization header
        .body(lastbody)
        .post("/pl/admin/offset/"+bonusorderid+"/addParticipants");
System.out.println("Response for last request: " + responselast.body().asString());




System.out.println("----------------------------------------------------------------------------------------");
for(String number: numbers) {
	System.out.println(number);
}
for(String branch: branches) {
	System.out.println(branch);
}
for(String pro: processors) {
	System.out.println(pro);
}

System.out.println("bonus order name-----"+bonusOrderName);
}


}
