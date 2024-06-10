package Utilities;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Data extends BaseClass{
	
	//ALC-4357*
	public static String bonusName;
	public static String password ="123456a"; 

	public static String member_Name;
	public static String member_Number;

	public static String branch1_Name;
	public static String branch1_Number;

	public static String branch2_Name;
	public static String branch2_Number;

	public static String branch3_Name;
	public static String branch3_Number;

	public static String processor_Name;
	public static String processor_Number;

	//*ALC-4357/
	
	public static ArrayList<String> values=new ArrayList<String>();
	public static ArrayList<String> values1=new ArrayList<String>();
	public static ArrayList<String> values_ALC_4361=new ArrayList<String>();
	public static ArrayList<String> values380=new ArrayList<String>();
	public static ArrayList<String> values1711=new ArrayList<String>();
	public static ArrayList<String> values4360=new ArrayList<String>();
	public static ArrayList<String> values4352=new ArrayList<String>();
	public static ArrayList<String> values4864=new ArrayList<String>();
	public static ArrayList<String> values4957=new ArrayList<String>();
	public static ArrayList<String> valuesMB=new ArrayList<String>();
	public static ArrayList<String> valuesBranch=new ArrayList<String>();
	public static ArrayList<String> valuesStore=new ArrayList<String>();
	public static ArrayList<String> valuesprocessor=new ArrayList<String>();
	public static ArrayList<String> values4359=new ArrayList<String>();
	public static ArrayList<String> values_ALC_4360=new ArrayList<String>();
	public static ArrayList<String> values4358=new ArrayList<String>();
	

	
	 public static String member_Name4864; 
	  public static String member_Number4864;
	
	  public static String member_Name1711; 
	  public static String member_Number1711;
	  public static String branch1_Name1711; 
	  public static String branch1_Number1711;
	  public static String branch2_Name1711;
	  public static String branch2_Number1711;  
	  public static String processor_Name1711; 
	  public static String processor_Number1711;
	  public static String bonusName1711;
	  public static String bonusName4957;
	  public static String member_Id1711;
	  public static String branch1_Id1711;
	  public static String branch2_Id1711;
	  public static String processor_Id1711;
	  public static String bonusOrderId1711;
	  public static String b1randomnum4957;
	  
	  public static String member_Name_4352;
	  public static String member_Number_4352;
	  
	  public static String member_NameMB; 
	  public static String member_NumberMB;
	  public static String branch1_NameMB; 
	  public static String branch1_NumberMB;
	  public static String branchNumber;
	  public static String branchName;
	  public static String storeNumber;
	  public static String storeName;
	  public static String processorNumber;
	  
	  	public static String member_Name4359;
	  	public static String member_Number4359;
	  	public static String branch1_Name4359;
	  	public static String branch1_Number4359;
	  	public static String processor_Name4359;
	  	public static String processor_Number4359;
	  	public static String bonusName4359;
	  	public static String m1randomnum4957;
	  	
	  	 public static String member1_Number380;
		 public static String member2_Number380;
		 public static String member1_Name380;
		 public static String member2_Name380;

		 public static String mname4360;
			public static   String mnum4360;
			 public static  String b1number4360;
			 public static  String b1name4360;
			 public static  String b1id4360;
			 public static  String b2number4360;
			 public static  String b2name4360;
			 public static String b2id4360;
			 public static String pnumber4360;
			 public static String pname4360;
			 public static String pid4360;
			 public static String bonusname4360;
			 public static String bonusid4360;
			 public static String branch1_Name4358;
				public static String branch1_Number4358;
				public static String processor_Name4358;
				public static String processor_Number4358;
				  

	  
	  
	public void runNewman() throws IOException {
	    try {
	        // Start the command prompt window
	        ProcessBuilder builder = new ProcessBuilder("cmd.exe");
	        builder.redirectErrorStream(true);
	        Process process = builder.start();
	        
	        // Send commands to the window
	        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
	        writer.write("newman run ALC_4357QA.postman_collection.json --export-environment variable.json\n");
	        writer.flush();
	        writer.close(); // Close the writer to signal the end of input
	        
	        // Read the output of the window
	        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            System.out.println(line);
	        }
	        
	        // Wait for the process to complete
	        int exitCode = process.waitFor();
	        System.out.println("Process completed with exit code: " + exitCode);
	        
	    } catch (IOException | InterruptedException e) {
	        e.printStackTrace();
	    }
	    
	    String jsonFilePath = ".\\variable.json"; // Replace with the actual path
	    ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Read the JSON file
            JsonNode rootNode = objectMapper.readTree(new File(jsonFilePath));

            // Extract values of specific keys
            JsonNode valuesNode = rootNode.get("values");
            if (valuesNode != null && valuesNode.isArray()) {
                for (JsonNode valueEntry : valuesNode) {
                    String key = valueEntry.get("key").asText();
                    String value = valueEntry.get("value").asText();

                    if ("m1randomUsername".equals(key) || "m1randomNumber".equals(key) || "b1randomBranchName".equals(key) || "b1randomNumber".equals(key) || "b2randomBranchName".equals(key) || "b2randomNumber".equals(key) || "b3randomBranchName".equals(key) || "b3randomNumber".equals(key) || "p1randomProcessorName".equals(key) || "p1randomNumber".equals(key) || "bonusOrderName".equals(key)) {
                        System.out.println(key + ": " + value);
                        values.add(value);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	    
          member_Name = values.get(0); 
		  member_Number=values.get(1);
		  branch1_Name = values.get(3); 
		  branch1_Number =values.get(2);
		  branch2_Name = values.get(5);
		  branch2_Number =values.get(4); 
		  branch3_Name = values.get(7);
		  branch3_Number = values.get(6); 
		  processor_Name = values.get(9); 
		  processor_Number = values.get(8);
		  bonusName = values.get(10);
	    
	    
	}
	public void createBranchProcessor_4358() throws IOException {
		try {
			// Start the command prompt window
			ProcessBuilder builder = new ProcessBuilder("cmd.exe");
			builder.redirectErrorStream(true);
			Process process = builder.start();

			// Send commands to the window
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
			writer.write("newman run create_Branch_Processor_Upg.postman_collection.json --export-environment variable4358.json\n");
			writer.flush();
			writer.close(); // Close the writer to signal the end of input

			// Read the output of the window
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

			// Wait for the process to complete
			int exitCode = process.waitFor();
			System.out.println("Process completed with exit code: " + exitCode);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}

		String jsonFilePath = ".\\variable4358.json"; // Replace with the actual path
		ObjectMapper objectMapper = new ObjectMapper();

		try {
			// Read the JSON file
			JsonNode rootNode = objectMapper.readTree(new File(jsonFilePath));

			// Extract values of specific keys
			JsonNode valuesNode = rootNode.get("values");
			if (valuesNode != null && valuesNode.isArray()) {
				for (JsonNode valueEntry : valuesNode) {
					String key = valueEntry.get("key").asText();
					String value = valueEntry.get("value").asText();

					if ("b1randomBranchName".equals(key) || "b1randomNumber".equals(key) || "p1randomProcessorName".equals(key) || "p1randomNumber".equals(key)) {
						System.out.println(key + ": " + value);
						values4358.add(value);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}


		branch1_Name4358 = values4358.get(1);
		branch1_Number4358 =values4358.get(0);
		processor_Name4358 = values4358.get(3);
		processor_Number4358 = values4358.get(2);

	}

	public void runNewman4957() throws IOException {
	    try {
	        // Start the command prompt window
	        ProcessBuilder builder = new ProcessBuilder("cmd.exe");
	        builder.redirectErrorStream(true);
	        Process process = builder.start();
	        
	        // Send commands to the window
	        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
	        writer.write("newman run ALC_4957_fixed.postman_collection.json --export-environment variable4957.json\n");
	        writer.flush();
	        writer.close(); // Close the writer to signal the end of input
	        
	        // Read the output of the window
	        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            System.out.println(line);
	        }
	        
	        // Wait for the process to complete
	        int exitCode = process.waitFor();
	        System.out.println("Process completed with exit code: " + exitCode);
	        
	    } catch (IOException | InterruptedException e) {
	        e.printStackTrace();
	    }
	    
	    String jsonFilePath = ".\\variable4957.json"; // Replace with the actual path
	    ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Read the JSON file
            JsonNode rootNode = objectMapper.readTree(new File(jsonFilePath));

            // Extract values of specific keys
            JsonNode valuesNode = rootNode.get("values");
            if (valuesNode != null && valuesNode.isArray()) {
                for (JsonNode valueEntry : valuesNode) {
                    String key = valueEntry.get("key").asText();
                    String value = valueEntry.get("value").asText();

                    if ("b1randomNumber".equals(key) || "m1randomNumber".equals(key) || "bonusOrderName".equals(key)) {
                        System.out.println(key + ": " + value);
                        values4957.add(value);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	    
          m1randomnum4957 = values4957.get(0);
          b1randomnum4957 = values4957.get(1);
		  bonusName4957 = values4957.get(2);
	    
	    
	}
	
	public void runNewmanALC_4362_4363() throws IOException {
	    try {
	        // Start the command prompt window
	        ProcessBuilder builder = new ProcessBuilder("cmd.exe");
	        builder.redirectErrorStream(true);
	        Process process = builder.start();
	        
	        // Send commands to the window
	        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
	        writer.write("newman run Alc_4362_63.postman_collection.json --export-environment variable_ALC_4362_4363.json\n");
	        writer.flush();
	        writer.close(); // Close the writer to signal the end of input
	        
	        // Read the output of the window
	        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            System.out.println(line);
	        }
	        
	        // Wait for the process to complete
	        int exitCode = process.waitFor();
	        System.out.println("Process completed with exit code: " + exitCode);
	    } catch (IOException | InterruptedException e) {
	        e.printStackTrace();
	    }
	    
	    String jsonFilePath = ".\\variable_ALC_4362_4363.json"; // Replace with the actual path
	    ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Read the JSON file
            JsonNode rootNode = objectMapper.readTree(new File(jsonFilePath));

            // Extract values of specific keys
            JsonNode valuesNode = rootNode.get("values");
            if (valuesNode != null && valuesNode.isArray()) {
                for (JsonNode valueEntry : valuesNode) {
                    String key = valueEntry.get("key").asText();
                    String value = valueEntry.get("value").asText();

                    if ("m1randomUsername".equals(key) || "m1randomNumber".equals(key) || "b1randomBranchName".equals(key) || "b1randomNumber".equals(key) || "b2randomBranchName".equals(key) || "b2randomNumber".equals(key) || "b3randomBranchName".equals(key) || "b3randomNumber".equals(key) || "p1randomProcessorName".equals(key) || "p1randomNumber".equals(key) || "bonusOrderName".equals(key)) {
                        System.out.println(key + ": " + value);
                        values1.add(value);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	    
        member_Name = values1.get(0); 
		  member_Number=values1.get(1);
		  branch1_Name = values1.get(3); 
		  branch1_Number =values1.get(2);
		  branch2_Name = values1.get(5);
		  branch2_Number =values1.get(4); 
		  branch3_Name = values1.get(7);
		  branch3_Number = values1.get(6); 
		  processor_Name = values1.get(9); 
		  processor_Number = values1.get(8);
		  bonusName = values1.get(10);
	    
	    
	}
	public void runNewmanFor_ALC_4361() throws IOException {
	    try {
	        // Start the command prompt window
	        ProcessBuilder builder = new ProcessBuilder("cmd.exe");
	        builder.redirectErrorStream(true);
	        Process process = builder.start();
	        
	        // Send commands to the window
	        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
	        writer.write("newman run ALC_4361ionic.postman_collection.json --export-environment variable_ALC_4361.json\n");
	        writer.flush();
	        writer.close(); // Close the writer to signal the end of input
	        
	        // Read the output of the window
	        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            System.out.println(line);
	        }
	        
	        // Wait for the process to complete
	        int exitCode = process.waitFor();
	        System.out.println("Process completed with exit code: " + exitCode);
	    } catch (IOException | InterruptedException e) {
	        e.printStackTrace();
	    }
	    
	    String jsonFilePath = ".\\variable_ALC_4361.json"; // Replace with the actual path
	    ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Read the JSON file
            JsonNode rootNode = objectMapper.readTree(new File(jsonFilePath));

            // Extract values of specific keys
            JsonNode valuesNode = rootNode.get("values");
            if (valuesNode != null && valuesNode.isArray()) {
                for (JsonNode valueEntry : valuesNode) {
                    String key = valueEntry.get("key").asText();
                    String value = valueEntry.get("value").asText();

                    if ("m1randomUsername".equals(key) || "m1randomNumber".equals(key) || "b1randomBranchName".equals(key) || "b1randomNumber".equals(key) || "p1randomProcessorName".equals(key) || "p1randomNumber".equals(key)) {
                        System.out.println(key + ": " + value);
                        values_ALC_4361.add(value);
                       
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	    
   }
	public void runNewman_ALC380() throws IOException {
		
		
		
	    try {
	        // Start the command prompt window
	        ProcessBuilder builder = new ProcessBuilder("cmd.exe");
	        builder.redirectErrorStream(true);
	        Process process = builder.start();
	        
	        // Send commands to the window
	        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
	        writer.write("newman run dtt.postman_collection.json --export-environment variable380.json\n");
	        writer.flush();
	        writer.close(); // Close the writer to signal the end of input
	        
	        // Read the output of the window
	        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            System.out.println(line);
	        }
	        
	        // Wait for the process to complete
	        int exitCode = process.waitFor();
	        System.out.println("Process completed with exit code: " + exitCode);
	    } catch (IOException | InterruptedException e) {
	        e.printStackTrace();
	    }
	    
	    String jsonFilePath = ".\\variable380.json"; // Replace with the actual path
	    ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Read the JSON file
            JsonNode rootNode = objectMapper.readTree(new File(jsonFilePath));

            // Extract values of specific keys
            JsonNode valuesNode = rootNode.get("values");
            if (valuesNode != null && valuesNode.isArray()) {
                for (JsonNode valueEntry : valuesNode) {
                    String key = valueEntry.get("key").asText();
                    String value = valueEntry.get("value").asText();

                    if ("m1randomUsername".equals(key) || "m1randomNumber".equals(key) || "m2randomUsername".equals(key) || "m2randomNumber".equals(key)) {
                        System.out.println(key + ": " + value);
                        values380.add(value);
          
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        
        }
          member1_Name380 = values380.get(0); 
          member1_Number380=values380.get(1);
          member2_Name380 = values380.get(2); 
          member2_Number380=values380.get(3);
          
          
	}
	public void runNewman1711() throws IOException {
	    try {
	        // Start the command prompt window
	        ProcessBuilder builder = new ProcessBuilder("cmd.exe");
	        builder.redirectErrorStream(true);
	        Process process = builder.start();
	        
	        // Send commands to the window
	        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
	        writer.write("newman run ALC-1711.postman_collection.json --export-environment variable_1711.json\n");
	        writer.flush();
	        writer.close(); // Close the writer to signal the end of input
	        
	        // Read the output of the window
	        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            System.out.println(line);
	        }
	        
	        // Wait for the process to complete
	        int exitCode = process.waitFor();
	        System.out.println("Process completed with exit code: " + exitCode);
	    } catch (IOException | InterruptedException e) {
	        e.printStackTrace();
	    }
	    
	    String jsonFilePath = ".\\variable_1711.json"; // Replace with the actual path
	    ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Read the JSON file
            JsonNode rootNode = objectMapper.readTree(new File(jsonFilePath));

            // Extract values of specific keys
            JsonNode valuesNode = rootNode.get("values");
            if (valuesNode != null && valuesNode.isArray()) {
                for (JsonNode valueEntry : valuesNode) {
                    String key = valueEntry.get("key").asText();
                    String value = valueEntry.get("value").asText();

                    if ("m1randomUsername".equals(key) || "m1randomNumber".equals(key) || "b1randomBranchName".equals(key) || "b1randomNumber".equals(key) || "b2randomBranchName".equals(key) || "b2randomNumber".equals(key) || "p1randomProcessorName".equals(key) || "p1randomNumber".equals(key) || "bonusOrderName".equals(key) || "m1id".equals(key) || "b1branchid".equals(key) || "b2branchid".equals(key) || "p1processorid".equals(key) || "bonusOrderId".equals(key)) {
                        System.out.println(key + ": " + value);
                        values1711.add(value);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	    
          member_Name1711 = values1711.get(0); 
		  member_Number1711=values1711.get(1);
		  member_Id1711=values1711.get(2);
		  branch1_Number1711 =values1711.get(3);
		  branch1_Name1711 = values1711.get(4); 
		  branch1_Id1711 =values1711.get(5);
		  branch2_Number1711 =values1711.get(6);
		  branch2_Name1711 = values1711.get(7);
		  branch2_Id1711 =values1711.get(8);
		  processor_Number1711 = values1711.get(9);
		  processor_Name1711 = values1711.get(10);  
		  processor_Id1711 = values1711.get(11);
		  bonusName1711 = values1711.get(12);    
		  bonusOrderId1711 = values1711.get(13);
	}
	
	public void runNewmanmb1b2pnobonuspaid() throws IOException {
	    try {
	        // Start the command prompt window
	        ProcessBuilder builder = new ProcessBuilder("cmd.exe");
	        builder.redirectErrorStream(true);
	        Process process = builder.start();
	        
	        // Send commands to the window
	        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
	        writer.write("newman run mb1b2p_without_bonus_upgrade.postman_collection.json --export-environment variablenobonuspaid.json\n");
	        writer.flush();
	        writer.close(); // Close the writer to signal the end of input
	        
	        // Read the output of the window
	        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            System.out.println(line);
	        }
	        
	        // Wait for the process to complete
	        int exitCode = process.waitFor();
	        System.out.println("Process completed with exit code: " + exitCode);
	    } catch (IOException | InterruptedException e) {
	        e.printStackTrace();
	    }
	    
	    String jsonFilePath = ".\\variablenobonuspaid.json"; // Replace with the actual path
	    ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Read the JSON file
            JsonNode rootNode = objectMapper.readTree(new File(jsonFilePath));

            // Extract values of specific keys
            JsonNode valuesNode = rootNode.get("values");
            if (valuesNode != null && valuesNode.isArray()) {
                for (JsonNode valueEntry : valuesNode) {
                    String key = valueEntry.get("key").asText();
                    String value = valueEntry.get("value").asText();

                    if ("m1randomUsername".equals(key) || "m1randomNumber".equals(key) || "b1randomBranchName".equals(key) || "b1randomNumber".equals(key) || "b2randomBranchName".equals(key) || "b2randomNumber".equals(key) || "p1randomProcessorName".equals(key) || "p1randomNumber".equals(key) || "bonusOrderName".equals(key) || "b1branchid".equals(key) || "b2branchid".equals(key) || "p1processorid".equals(key) || "bonusOrderId".equals(key)) {
                        System.out.println(key + ": " + value);
                        values_ALC_4360.add(value);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	   
        mname4360=values_ALC_4360.get(0);
        mnum4360=values_ALC_4360.get(1);
        b1number4360=values_ALC_4360.get(2);
        b1name4360=values_ALC_4360.get(3);
        b1id4360=values_ALC_4360.get(4);
        b2number4360=values_ALC_4360.get(5);
        b2name4360=values_ALC_4360.get(6);
        b2id4360=values_ALC_4360.get(7);
        pnumber4360=values_ALC_4360.get(8);
        pname4360=values_ALC_4360.get(9);
        pid4360=values_ALC_4360.get(10);
        bonusname4360=values_ALC_4360.get(11);
        bonusid4360=values_ALC_4360.get(12);
    }
	
	public void runonceFor_ALC_4360() throws IOException {
		
			runNewmanmb1b2pnobonuspaid();
		
	}
	
	public void createMember() throws IOException {
	    try {
	        // Start the command prompt window
	        ProcessBuilder builder = new ProcessBuilder("cmd.exe");
	        builder.redirectErrorStream(true);
	        Process process = builder.start();
	        
	        // Send commands to the window
	        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
	        writer.write("newman run create_Member.postman_collection.json --export-environment variable_4352.json\n");
	        writer.flush();
	        writer.close(); // Close the writer to signal the end of input
	        
	        // Read the output of the window
	        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            System.out.println(line);
	        }
	        
	        // Wait for the process to complete
	        int exitCode = process.waitFor();
	        System.out.println("Process completed with exit code: " + exitCode);
	    } catch (IOException | InterruptedException e) {
	        e.printStackTrace();
	    }
	    
	    String jsonFilePath = ".\\variable_4352.json"; // Replace with the actual path
	    ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Read the JSON file
            JsonNode rootNode = objectMapper.readTree(new File(jsonFilePath));

            // Extract values of specific keys
            JsonNode valuesNode = rootNode.get("values");
            if (valuesNode != null && valuesNode.isArray()) {
                for (JsonNode valueEntry : valuesNode) {
                    String key = valueEntry.get("key").asText();
                    String value = valueEntry.get("value").asText();

                    if ("m1randomUsername".equals(key) || "m1randomNumber".equals(key)) {
                        System.out.println(key + ": " + value);
                        values4352.add(value);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	    
        member_Name_4352 = values4352.get(0); 
		member_Number_4352=values4352.get(1);
		
	    
	    
	}
	
	public void createMember4864() throws IOException {
	    try {
	        // Start the command prompt window
	        ProcessBuilder builder = new ProcessBuilder("cmd.exe");
	        builder.redirectErrorStream(true);
	        Process process = builder.start();
	        
	        // Send commands to the window
	        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
	        writer.write("newman run createamember.postman_collection.json --export-environment variable_4864.json\n");
	        writer.flush();
	        writer.close(); // Close the writer to signal the end of input
	        
	        // Read the output of the window
	        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            System.out.println(line);
	        }
	        
	        // Wait for the process to complete
	        int exitCode = process.waitFor();
	        System.out.println("Process completed with exit code: " + exitCode);
	    } catch (IOException | InterruptedException e) {
	        e.printStackTrace();
	    }
	    
	    String jsonFilePath = ".\\variable_4864.json"; // Replace with the actual path
	    ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Read the JSON file
            JsonNode rootNode = objectMapper.readTree(new File(jsonFilePath));

            // Extract values of specific keys
            JsonNode valuesNode = rootNode.get("values");
            if (valuesNode != null && valuesNode.isArray()) {
                for (JsonNode valueEntry : valuesNode) {
                    String key = valueEntry.get("key").asText();
                    String value = valueEntry.get("value").asText();

                    if ("m1randomUsername".equals(key) || "m1randomNumber".equals(key)) {
                        System.out.println(key + ": " + value);
                        values4864.add(value);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	    
        member_Name4864 = values4864.get(0); 
		member_Number4864=values4864.get(1);
		
	    
	    
	}
	
	public void createMemberBranch() throws IOException {
	    try {
	        // Start the command prompt window
	        ProcessBuilder builder = new ProcessBuilder("cmd.exe");
	        builder.redirectErrorStream(true);
	        Process process = builder.start();
	        
	        // Send commands to the window
	        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
	        writer.write("newman run create_Member_Branch.postman_collection.json --export-environment variableMB.json\n");
	        writer.flush();
	        writer.close(); // Close the writer to signal the end of input
	        
	        // Read the output of the window
	        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            System.out.println(line);
	        }
	        
	        // Wait for the process to complete
	        int exitCode = process.waitFor();
	        System.out.println("Process completed with exit code: " + exitCode);
	    } catch (IOException | InterruptedException e) {
	        e.printStackTrace();
	    }
	    
	    String jsonFilePath = ".\\variableMB.json"; // Replace with the actual path
	    ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Read the JSON file
            JsonNode rootNode = objectMapper.readTree(new File(jsonFilePath));

            // Extract values of specific keys
            JsonNode valuesNode = rootNode.get("values");
            if (valuesNode != null && valuesNode.isArray()) {
                for (JsonNode valueEntry : valuesNode) {
                    String key = valueEntry.get("key").asText();
                    String value = valueEntry.get("value").asText();

                    if ("m1randomUsername".equals(key) || "m1randomNumber".equals(key) || "b1randomBranchName".equals(key) || "b1randomNumber".equals(key)) {
                        System.out.println(key + ": " + value);
                        valuesMB.add(value);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	    
          member_NameMB = valuesMB.get(0); 
		  member_NumberMB=valuesMB.get(1);
		  branch1_NumberMB =valuesMB.get(2);
		  branch1_NameMB = valuesMB.get(3); 
		  
	}
	
	
	public void createBranch() throws IOException {
	    try {
	        // Start the command prompt window
	        ProcessBuilder builder = new ProcessBuilder("cmd.exe");
	        builder.redirectErrorStream(true);
	        Process process = builder.start();
	        
	        // Send commands to the window
	        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
	        writer.write("newman run CreateBranch.postman_collection.json --export-environment variableBranch.json\n");
	        writer.flush();
	        writer.close(); // Close the writer to signal the end of input
	        
	        // Read the output of the window
	        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            System.out.println(line);
	        }
	        
	        // Wait for the process to complete
	        int exitCode = process.waitFor();
	        System.out.println("Process completed with exit code: " + exitCode);
	    } catch (IOException | InterruptedException e) {
	        e.printStackTrace();
	    }
	    
	    String jsonFilePath = ".\\variableBranch.json"; // Replace with the actual path
	    ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Read the JSON file
            JsonNode rootNode = objectMapper.readTree(new File(jsonFilePath));

            // Extract values of specific keys
            JsonNode valuesNode = rootNode.get("values");
            if (valuesNode != null && valuesNode.isArray()) {
                for (JsonNode valueEntry : valuesNode) {
                    String key = valueEntry.get("key").asText();
                    String value = valueEntry.get("value").asText();

                    if ("b1randomBranchName".equals(key) || "b1randomNumber".equals(key)) {
                        System.out.println(key + ": " + value);
                        valuesBranch.add(value);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	    
         
		  branchNumber =valuesBranch.get(0);
		  branchName = valuesBranch.get(1); 
		  
	}
	
	
	
	public void createStore() throws IOException {
	    try {
	        // Start the command prompt window
	        ProcessBuilder builder = new ProcessBuilder("cmd.exe");
	        builder.redirectErrorStream(true);
	        Process process = builder.start();
	        
	        // Send commands to the window
	        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
	        writer.write("newman run Create_Store.postman_collection.json --export-environment variablestore.json\n");
	        writer.flush();
	        writer.close(); // Close the writer to signal the end of input
	        
	        // Read the output of the window
	        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            System.out.println(line);
	        }
	        
	        // Wait for the process to complete
	        int exitCode = process.waitFor();
	        System.out.println("Process completed with exit code: " + exitCode);
	    } catch (IOException | InterruptedException e) {
	        e.printStackTrace();
	    }
	    
	    String jsonFilePath = ".\\variablestore.json"; // Replace with the actual path
	    ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Read the JSON file
            JsonNode rootNode = objectMapper.readTree(new File(jsonFilePath));

            // Extract values of specific keys
            JsonNode valuesNode = rootNode.get("values");
            if (valuesNode != null && valuesNode.isArray()) {
                for (JsonNode valueEntry : valuesNode) {
                    String key = valueEntry.get("key").asText();
                    String value = valueEntry.get("value").asText();

                    if ("randomStoreName".equals(key) || "b1randomNumber".equals(key)) {
                        System.out.println(key + ": " + value);
                        valuesStore.add(value);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	    
         
		  storeNumber =valuesStore.get(0);
		  
		  
	}
	
	
	public void createProcessor() throws IOException {
	    try {
	        // Start the command prompt window
	        ProcessBuilder builder = new ProcessBuilder("cmd.exe");
	        builder.redirectErrorStream(true);
	        Process process = builder.start();
	        
	        // Send commands to the window
	        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
	        writer.write("newman run create_processor.postman_collection.json --export-environment variableprocessor.json\n");
	        writer.flush();
	        writer.close(); // Close the writer to signal the end of input
	        
	        // Read the output of the window
	        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            System.out.println(line);
	        }
	        
	        // Wait for the process to complete
	        int exitCode = process.waitFor();
	        System.out.println("Process completed with exit code: " + exitCode);
	    } catch (IOException | InterruptedException e) {
	        e.printStackTrace();
	    }
	    
	    String jsonFilePath = ".\\variableprocessor.json"; // Replace with the actual path
	    ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Read the JSON file
            JsonNode rootNode = objectMapper.readTree(new File(jsonFilePath));

            // Extract values of specific keys
            JsonNode valuesNode = rootNode.get("values");
            if (valuesNode != null && valuesNode.isArray()) {
                for (JsonNode valueEntry : valuesNode) {
                    String key = valueEntry.get("key").asText();
                    String value = valueEntry.get("value").asText();

                    if ("randomStoreName".equals(key) || "p1randomNumber".equals(key)) {
                        System.out.println(key + ": " + value);
                        valuesprocessor.add(value);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	    
         
		  processorNumber =valuesprocessor.get(0);
		  
		  
	}
	
	
	
	public void runNewman_1Branch1member1processor() throws IOException {
		try {
			// Start the command prompt window
			ProcessBuilder builder = new ProcessBuilder("cmd.exe");
			builder.redirectErrorStream(true);
			Process process = builder.start();

			// Send commands to the window
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
			writer.write("newman run ALC258upgrade.postman_collection.json --export-environment variable4359.json\n");
			writer.flush();
			writer.close(); // Close the writer to signal the end of input

			// Read the output of the window
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

			// Wait for the process to complete
			int exitCode = process.waitFor();
			System.out.println("Process completed with exit code: " + exitCode);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}

		String jsonFilePath = ".\\variable4359.json"; // Replace with the actual path
		ObjectMapper objectMapper = new ObjectMapper();

		try {
			// Read the JSON file
			JsonNode rootNode = objectMapper.readTree(new File(jsonFilePath));

			// Extract values of specific keys
			JsonNode valuesNode = rootNode.get("values");
			if (valuesNode != null && valuesNode.isArray()) {
				for (JsonNode valueEntry : valuesNode) {
					String key = valueEntry.get("key").asText();
					String value = valueEntry.get("value").asText();

					if ("m1randomUsername".equals(key) || "m1randomNumber".equals(key) || "b1randomBranchName".equals(key) || "b1randomNumber".equals(key) || "p1randomProcessorName".equals(key) || "p1randomNumber".equals(key) || "bonusOrderName".equals(key)) {
						System.out.println(key + ": " + value);
						values4359.add(value);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		member_Name4359 = values4359.get(0);
		member_Number4359=values4359.get(1);
		branch1_Name4359 = values4359.get(3);
		branch1_Number4359 =values4359.get(2);
		processor_Name4359 = values4359.get(5);
		processor_Number4359 = values4359.get(4);
		bonusName4359 = values4359.get(6);

	}
	
}