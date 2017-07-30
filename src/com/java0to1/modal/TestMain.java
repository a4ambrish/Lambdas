package com.java0to1.modal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

import com.java0to1.modal.ApplicationConstants.AddressType;
import com.java0to1.modal.ApplicationConstants.ContactType;

public class TestMain {

	public static ArrayList<Profile> profiles;

	// public static Stream<Profile> friendsProfile =
	// profiles.stream().map(p->p.addresses.stream().filter(a->a.addressType ==
	// AddressType.PARMANENT));

	public static void main(String[] args) {
		resourceGenerator();
		//System.out.println(profiles);
		Stream<Profile> sortByFirstName = profiles.stream().sorted(Comparator.comparing(Profile::getFname));
		//profiles.stream().forEach(p-> System.out.println("Name " + p.getFname() +" has " + p.addresses.stream().count()+"  addresses"));
		Stream<Address> addressStream =
				profiles.stream().flatMap(p->p.getAddresses().stream()).filter(p->p.pincode.equalsIgnoreCase("782022"));//forEach(p->System.out.println(p));
	
		
		Collections.sort((ArrayList )profiles); // NOS
		profiles.sort(null);  // NOS
		
		
		
		
		
		addressStream.forEach(p->System.out.println(p)); // terminal command
		
	//	addressStream.filter(p->p.pincode.equalsIgnoreCase("782022")).forEach(p->System.out.println(p));
		// profiles.stream().forEach(p->p.addresses.stream());
		//sortByFirstName.forEach(p -> System.out.println(p));
	}

	public static void resourceGenerator() {
		profiles = new ArrayList<>();

		ArrayList<ContactType> contactTypes = new ArrayList<ContactType>();
		contactTypes.add(ContactType.FAMILY);
		contactTypes.add(ContactType.FRIEND);
		Profile p = new Profile();
		p.getAddresses().add(
				new Address("20 A Extn 4 C", "Kamruddin Nagar, Nangloi", "Delhi", "Delhi", "110041", AddressType.TEMP));
		p.getAddresses().add(new Address("Vill. Madhopur", "Bathnaha, Sitamarhi", "Sitamrhi", "Bihar", "832022",
				AddressType.PARMANENT));
		p.getContacts().add(new Contact("9811545125", "9958085803", "vahan.nic@gmail.com"));
		p.setContactTypes(contactTypes);
		p.getSocialNetwork().setFacebook("ambrishpooja");
		p.getSocialNetwork().setTwitter("ambrishkjha");
		p.getSocialNetwork().setSkype("a4ambrish");
		p.getSocialNetwork().setLinkedIn("vahan.nic@gmail.com");
		p.getSocialNetwork().setStackoverflow("vahan.nic@gmail.com");
		p.setFname("Ambrish");
		p.setLname("Jha");
		p.setTitle(new Title("Mr.", "Mister."));

		profiles.add(p);

		contactTypes = new ArrayList<ContactType>();
		contactTypes.add(ContactType.OFFICE);
		contactTypes.add(ContactType.FRIEND);
		p = new Profile();
		p.getAddresses()
				.add(new Address("20 A Uttam Nagar", "Rajouri Garden", "Delhi", "Delhi", "81", AddressType.TEMP));
		p.getAddresses()
				.add(new Address("Vill. Rampur", "Luknow, UP", "Launow", "UP", "782022", AddressType.PARMANENT));
		p.getContacts().add(new Contact("9988776655", "8899889983", "sarvesh4470@gmail.com"));
		p.setContactTypes(contactTypes);
		p.getSocialNetwork().setFacebook("sarvesh");
		p.getSocialNetwork().setTwitter("sarveshTwitter");
		p.getSocialNetwork().setSkype("sarvesh4470");
		p.getSocialNetwork().setLinkedIn("sarvesh4470@gmail.com");
		p.getSocialNetwork().setStackoverflow("sarvesh4470@gmail.com");
		p.setFname("Sarvesh");
		p.setLname("Kumar");
		p.setTitle(new Title("Mr.", "Mister."));
		profiles.add(p);

		contactTypes = new ArrayList<ContactType>();
		contactTypes.add(ContactType.UNKNOWN);

		p = new Profile();
		p.getAddresses()
				.add(new Address("20 A Kamlesh Nagar", "Kamlesh Garden", "Delhi", "Delhi", "81", AddressType.TEMP));
		p.getAddresses()
				.add(new Address("Vill. Kamlesh", "Luknow, UP", "Launow", "UP", "782022", AddressType.PARMANENT));
		p.getContacts().add(new Contact("5544332211", "1122334455", "sarvesh4470@gmail.com"));
		p.setContactTypes(contactTypes);
		p.getSocialNetwork().setFacebook("Kamlesh");
		p.getSocialNetwork().setTwitter("KamleshTwitter");
		p.getSocialNetwork().setSkype("Kamlesh4470");
		p.getSocialNetwork().setLinkedIn("Kamlesh4470@gmail.com");
		p.getSocialNetwork().setStackoverflow("Kamlesh4470@gmail.com");
		p.setFname("Kamlesh");
		p.setLname("Kumar");
		p.setTitle(new Title("Mr.", "Mister."));
		profiles.add(p);

	}
}
