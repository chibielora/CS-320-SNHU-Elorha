/*
 * @author elorhanewcomb
 *
 */
package service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ContactServiceTest {
// Clear the array list is cleared after we've run a test
	@AfterEach
	void tearDown() throws Exception {
		ContactService.contactList.clear();
	}

// Tests if addContact is valid
	@DisplayName("Tests if addContact is valid")
	@Test
	void testAddContact() {

      	String firstName = "Java";
        String lastName = "Newcomb";
        String phoneNumber = "1234567890";
        String address = "1243 Ave Boston";

		ContactService test = new ContactService();

		assertTrue(ContactService.contactList.isEmpty());

		test.addContact(firstName, lastName, phoneNumber, address);

		assertFalse(ContactService.contactList.isEmpty());
		assertEquals(0, ContactService.contactList.get(0).getContactID());
		assertEquals(firstName, ContactService.contactList.get(0).getFirstName());
		assertEquals(lastName, ContactService.contactList.get(0).getLastName());
		assertEquals(phoneNumber, ContactService.contactList.get(0).getPhoneNumber());
		assertEquals(address, ContactService.contactList.get(0).getAddress());

	}

// Tests if deleteContact is valid	
	@DisplayName("Tests if deleteContact is valid")			  
	@Test void testDeleteContact() {
				  
      	String firstName = "Java";
        String lastName = "Newcomb";
        String phoneNumber = "1234567890";
        String address = "1243 Ave Boston";
		boolean testBool = false;
		  
		ContactService test = new ContactService();
		  
		assertTrue(ContactService.contactList.isEmpty());
		 
		test.addContact(firstName, lastName, phoneNumber, address);//object at ID 0
		test.addContact(firstName, lastName, phoneNumber, address);//object at ID 1
		test.addContact(firstName, lastName, phoneNumber, address);//object at ID 2
		  
		assertEquals(3,ContactService.contactList.size());
		  
		test.deleteContact("1");
		  
		assertEquals(2,ContactService.contactList.size());
		 
		for(int i = 0; i < ContactService.contactList.size(); i++) {
			if(ContactService.contactList.get(i).getContactID() == 1) {
				testBool = true;
			}
		}		
		assertFalse(testBool);				 
	}

// Tests if editPhone is valid
	@DisplayName("Tests if editPhone is valid")
	@Test
	void testEditPhone() {
		
      	String firstName = "Java";
        String lastName = "Newcomb";
        String phoneNumber = "1234567890";
        String address = "1243 Ave Boston";
		  
		ContactService test = new ContactService();
		test.addContact(firstName, lastName, phoneNumber, address);
		
		assertEquals(phoneNumber, ContactService.contactList.get(0).getPhoneNumber());
		
		test.editNumber("0", "1987654321");
		assertEquals("1987654321", ContactService.contactList.get(0).getPhoneNumber());
	}

// Tests if EditLast to input last names  is valid
	@DisplayName("Tests if EditLast to input last names is valid")
	@Test
	void testEditLast() {
		
      	String firstName = "Java";
        String lastName = "Newcomb";
        String phoneNumber = "1234567890";
        String address = "1243 Ave Boston";
		  
		ContactService test = new ContactService();
		test.addContact(firstName, lastName, phoneNumber, address);
		
		assertEquals(lastName, ContactService.contactList.get(0).getLastName());
		
		test.editLastName("0", "Test_Name");
		assertEquals("Test_Name", ContactService.contactList.get(0).getLastName());
	}

// Tests if EditFirst to input last names  is valid
	@DisplayName("Tests if EditFirst to input last names  is valid")
	@Test
	void testEditFirst() {
		
      	String firstName = "Java";
        String lastName = "Newcomb";
        String phoneNumber = "1234567890";
        String address = "1243 Ave Boston";

		ContactService test = new ContactService();
		test.addContact(firstName, lastName, phoneNumber, address);
		
		assertEquals(firstName, ContactService.contactList.get(0).getFirstName());
		
		test.editFirstName("0", "Test_First");
		assertEquals("Test_First", ContactService.contactList.get(0).getFirstName());
	}

// Tests if Address is valid
	@DisplayName("Tests if Address is valid")
	@Test
	void testEditAddress() {
		
      	String firstName = "Java";
        String lastName = "Newcomb";
        String phoneNumber = "1234567890";
        String address = "1243 Ave Boston";

		ContactService test = new ContactService();
		test.addContact(firstName, lastName, phoneNumber, address);
		
		assertEquals(address, ContactService.contactList.get(0).getAddress());
		
		test.editAddress("0", "Test_Address");
		assertEquals("Test_Address", ContactService.contactList.get(0).getAddress());
	}
}

