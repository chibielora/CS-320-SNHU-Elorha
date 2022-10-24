/* 
* 
* @author elorhanewcomb
* 
*/
package model;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ContactTest{

//Test a constructor that is valid	
	@DisplayName("Test a constructor that is valid")
	@Test
	public void testGoodConstructor() {
        String contactId = "1";
      	String firstName = "Java";
        String lastName = "Newcomb";
        String phoneNumber = "1234567890";
        String address = "1243 Ave Boston";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);
        
		assertEquals(1, testContact.getContactID());
		assertEquals(firstName, testContact.getFirstName());
		assertEquals(lastName, testContact.getLastName());
		assertEquals(phoneNumber, testContact.getPhoneNumber());
		assertEquals(address, testContact.getAddress());
	}
	

//Test a constructor with an invalid phone number length
	@DisplayName("Test a constructor that is invalid")
	@Test
	public void testBadConstructor() {
        String contactId = "2";
      	String firstName = "Java";
        String lastName = "Newcomb";
        String phoneNumber = "1";
        String address = "1243 Ave Boston"; 
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactId, firstName, lastName, phoneNumber, address);
        });
	}
	
// Test if setFirstName is valid
	@DisplayName("Test if setFirstName is valid")
	@Test
	public void testGoodSetFirst() {
        String contactId = "3";
      	String firstName = "Java";
        String lastName = "Newcomb";
        String phoneNumber = "1234567890";
        String address = "1243 Ave Boston";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        testContact.setFirstName("Test");        
        assertEquals("Test", testContact.getFirstName());
	}
	
// Test if setFirstName is null
	@DisplayName("Test if setFirstName is null")
	@Test
	public void testBadSetFirst() {
        String contactId = "3";
      	String firstName = "Java";
        String lastName = "Newcomb";
        String phoneNumber = "1234567890";
        String address = "1243 Ave Boston";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setFirstName(null);
        });
	}
	
//Test if length of setFirstName is valid
	@DisplayName("Test if length of setFirstName is valid")
	@Test
	public void testLongSetFirst() {
        String contactId = "3";
      	String firstName = "Java";
        String lastName = "Newcomb";
        String phoneNumber = "1234567890";
        String address = "1243 Ave Boston";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setFirstName("fFSafDSFVDFBSNSDSBFSsdsfs");
        });
	}
	
// Tests if getID returns an integer
	@DisplayName("Tests if getID returns an integer")
	@Test
	public void testGetID() {
        String contactId = "3";
      	String firstName = "Java";
        String lastName = "Newcomb";
        String phoneNumber = "1234567890";
        String address = "1243 Ave Boston";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        assertEquals(3, testContact.getContactID());
	}
	
// Tests if getID doesn't return a String
	@DisplayName("Tests if getID doesn't return a String")
	@Test
	public void testBadGetID() {
        String contactId = "3";
      	String firstName = "Java";
        String lastName = "Newcomb";
        String phoneNumber = "1234567890";
        String address = "1243 Ave Boston";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        assertNotEquals("3", testContact.getContactID());
	}
	
// Tests if getID is too long
	@DisplayName("Tests if getID returns an integer is too long")
	@Test
	public void testlongGetID() {
        String contactId = "12345678910111213";
      	String firstName = "Java";
        String lastName = "Newcomb";
        String phoneNumber = "1234567890";
        String address = "1243 Ave Boston";
		
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactId, firstName, lastName, phoneNumber, address);
        });
	}
	
// Test if setLastName is null
	@DisplayName("Test if setLastName is null")
	@Test
	public void testBadSetLast() {
        String contactId = "3";
      	String firstName = "Java";
        String lastName = "Newcomb";
        String phoneNumber = "1234567890";
        String address = "1243 Ave Boston";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setLastName(null);
        });
	}
	
// Test if setLastName is too long
	@DisplayName("Test if setLastName is too long")
	@Test
	public void testLongSetLast() {
        String contactId = "3";
      	String firstName = "Java";
        String lastName = "Newcomb";
        String phoneNumber = "1234567890";
        String address = "1243 Ave Boston";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setLastName("IamWayTooLongOfALastName");
        });
	}
	
// Test if setLastName is valid
	@DisplayName("Test if setLastName is valid")
	@Test
	public void testGoodsetLast() {
        String contactId = "3";
      	String firstName = "Java";
        String lastName = "Newcomb";
        String phoneNumber = "1234567890";
        String address = "1243 Ave Boston";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        testContact.setLastName("Test");        
        assertEquals("Test", testContact.getLastName());
	}
	
// Test if setPhoneNumber is null
	@DisplayName("Test if setPhoneNumber is null")
	@Test
	public void testBadSetPhone() {
        String contactId = "3";
      	String firstName = "Java";
        String lastName = "Newcomb";
        String phoneNumber = "1234567890";
        String address = "1243 Ave Boston";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setPhoneNumber(null);
        });
        
	}
	
// Test if length of setPhoneNumber is invalid
	@DisplayName("Test if length of setPhoneNumber is invalid")
	@Test
	public void testWrongLengthPhone() {
        String contactId = "3";
      	String firstName = "Java";
        String lastName = "Newcomb";
        String phoneNumber = "1234567890";
        String address = "1243 Ave Boston";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setPhoneNumber("1");
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setPhoneNumber("123456789101112131415");
        });
	}
// Test if length of setPhoneNumber is valid
	@DisplayName("Test if length of setPhoneNumber is valid")
	@Test
	public void testGoodPhone() {
        String contactId = "3";
      	String firstName = "Java";
        String lastName = "Newcomb";
        String phoneNumber = "1234567890";
        String address = "1243 Ave Boston";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   

        testContact.setPhoneNumber("7852158964");        
        assertEquals("7852158964", testContact.getPhoneNumber());

	}
	
// Test if setAddress is null
	@DisplayName("Test if setAddress is null")
	@Test
	public void testNullSetAddress() {
        String contactId = "3";
      	String firstName = "Java";
        String lastName = "Newcomb";
        String phoneNumber = "1234567890";
        String address = "1243 Ave Boston";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setAddress(null);
        });
        
	}
	
// Test if length of setAddress is invalid
	@DisplayName("Test if length of setAddress is invalid")
	@Test
	public void testWrongLengthAddress() {
        String contactId = "3";
      	String firstName = "Java";
        String lastName = "Newcomb";
        String phoneNumber = "1234567890";
        String address = "1243 Ave Boston";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setAddress("Random address that is way too long");
        });
	}
// Test if length of setAddress is valid
	@DisplayName("Test a valid length setAddress")
	@Test
	public void testGoodAddress() {
        String contactId = "3";
      	String firstName = "Java";
        String lastName = "Newcomb";
        String phoneNumber = "1234567890";
        String address = "1243 Ave Boston";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   

        testContact.setAddress("testing address");        
        assertEquals("testing address", testContact.getAddress());

	}
	
}
