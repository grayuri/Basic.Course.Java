package com.loiane.curso_java.aula_36;

public class Test {

	public static void main(String[] args) {
		Contact contact = new Contact();
		Address address = new Address();
		Phone firstPhone = new Phone();
		Phone secondPhone = new Phone();
		Phone[] phones = new Phone[2];
		
		contact.setName("Bruce Wayne");
		
		address.setCity("Gotham");
		contact.setAddress(address);
		
		firstPhone.setDdd("11");
		firstPhone.setNumber("88888-8888");
		secondPhone.setDdd("11");
		secondPhone.setNumber("99999-9999");
		phones[0] = firstPhone;
		phones[1] = secondPhone;
		contact.setPhones(phones);
		
		
		System.out.println("- Name: " + contact.getName());
		
		if (contact != null && contact.getAddress() != null) { 
			System.out.println("- Address: " + contact.getAddress().getCity()); 
		}
		
		if (contact != null && contact.getPhones() != null) { 
			System.out.print("- Phones: ");
			for (Phone t : contact.getPhones()) {
				System.out.print(t.getDdd() + " " + t.getNumber() + "   "); 
			}
		}
	}

}
