package makingAPhoneBook;

import java.util.*;

public class PhonebookNameMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Directory directory = new Directory();
		Person[] people = new Person[3];
		Address[] addresses = new Address[3];
		Address address1 = new Address(2834, "Armature", "Ave", "Nashville", "TN", 23945);
		Address address2 = new Address(9, "Tiny Oak", "Ct", "Tomlinson", "NC", 53427);
		Address address3 = new Address(1922, "Wesley", "Way", "Audobon", "OR", 48863);
		Person person1 = new Person("Tom", "Jones", "Tom Jones", 7634869275L, 3217456893L, 9045672345L, 2345436785L,
				10271991L, 11222018L, "tomjones@yahoo.com", address1);
		Person person2 = new Person("Jessica", "Timber", "Jessica Timber", 7392642347L, 4758234758L, 7893452673L,
				3546664875L, 12251989L, 9232000L, "TimberForWood@woodchuck.net", address2);
		Person person3 = new Person("Ryan", "Strikler", "Ryan Strikler", 3742830923L, 7567539922L, 8097893647L,
				3829782356L, 7131969L, 8151986L, "BowlingStriklers@aol.com", address3);
		directory.addEntry(person1);
		directory.addEntry(person2);
		directory.addEntry(person3);

		System.out.println("\n***********************************" + " \n  WELCOME TO THE PHONY PHONEBOOK!"
				+ "\n***********************************" + "\n" + " \nThere Are Many Things You Can Do Here..."
				+ "\nLet's Get Started!" + " \nWhat Would You Like To Do? " + "\nMake your selection to begin: " + "\n"
				+ "\n1. ADD NEW ENTRY" + "\n2. SEARCH BY FIRST NAME " + "\n3. SEARCH BY LAST NAME"
				+ "\n4. SEARCH BY FULL NAME " + "\n5. SEARCH BY PHONE NUMBER " + "\n6. SEARCH BY CITY"
				+ "\n7. SEARCH BY STATE" + "\n8. DELETE RECORD FOR PHONE NUMBER "
				+ "\n9. UPDATE RECORD FOR PHONE NUMBER" + "\n10. PRINT CONTACT LIST"
				+ "\n11. EXIT THE PHONY PHONEBOOK, YOU PHONY");
		System.out.println("\n");
		int x = 0;
		do {
			try {
				x = input.nextInt();
				switch (x) {
				case 1:

					System.out.println("ADD FIRST NAME");
					String firstName = input.next();
					System.out.println("ADD LAST NAME");
					String lastName = input.next();
					String fullName = firstName + " " + lastName;
					System.out.println("ADD PHONE NUMBER ex. 8134563210");
					long phoneNumber = input.nextLong();
					System.out.println("ADD CELLPHONE NUMBER ex. 8134563210");
					long cellphoneNumber = input.nextLong();
					System.out.println("ADD WORK PHONE NUMBER ex. 8134563210");
					long workphoneNum = input.nextLong();
					System.out.println("ADD FAX NUMBER ex. 8134563210");
					long faxphoneNum = input.nextLong();
					System.out.println("ADD NUMBER OF ADDRESS");
					int houseNumber = input.nextInt();
					System.out.println("ADD STREET NAME AS ONE WORD \nex. 'BRUCEBDOWNS' FOR 'BRUCE B DOWNS'");
					String streetName = input.next();
					System.out.println("ADD STREET ENDING ex. AVE, DR, CT");
					String streetNameEnding = input.next();
					System.out.println("ADD CITY AS ONE WORD \nex. 'EASTGREATFALLS' FOR 'EAST GREAT FALLS'");
					String cityName = input.next();
					System.out.println("ADD STATE INITIALS");
					String stateInitials = input.next();
					System.out.println("ADD ZIPCODE");
					int zipcode = input.nextInt();
					System.out.println("ADD BIRTHDAY");
					long birthDay = input.nextLong();
					System.out.println("ADD ANNIVERSARY, IF APPLICABLE");
					long anniversary = input.nextLong();
					System.out.println("ADD EMAIL");
					String email = input.next();
					System.out.println();
					Address address4 = new Address(houseNumber, streetName, streetNameEnding, cityName, stateInitials,
							zipcode);
					Person person4 = new Person(firstName, lastName, fullName, phoneNumber, cellphoneNumber,
							workphoneNum, faxphoneNum, birthDay, anniversary, email, address4);
					directory.addEntry(person4);
					System.out.println("THE FOLLOWING ENTRY HAS BEEN ADDED");
					System.out.println(person4.getFirstName());
					System.out.println(person4.getLastName());
					System.out.println(person4.getFullName());
					System.out.println("Home: " + directory.toStringHomeNum(person4.getPhoneNum()));
					System.out.println("Cell: " + directory.toStringCellNum(person4.getCellNum()));
					System.out.println("Work: " + directory.toStringWorkNum(person4.getWorkNum()));
					System.out.println("Fax: " + directory.toStringFaxNum(person4.getFaxNum()));
					System.out.println(person4.getAddress());
					System.out.println("Birthday: " + person4.getBirthday());
					System.out.println("Anniversary: " + person4.getAnniversary());
					System.out.println("Email: " + email);
					System.out.println("\n");
					break;

				case 2:
					System.out.println("ENTER THE FIRST NAME OF THE PERSON YOU'D LIKE TO SEARCH FOR");
					String firstNameKey = input.next();
					System.out.println(directory.searchFirstName(firstNameKey));
					break;

				case 3:
					System.out.println("ENTER THE LAST NAME OF THE PERSON YOU'D LIKE TO SEARCH FOR");
					String lastNameKey = input.next();
					System.out.println(directory.searchLastName(lastNameKey));
					break;

				case 4:
					System.out.println("ENTER THE FULL NAME OF THE PERSON YOU'D LIKE TO SEARCH FOR");
					String firstNameK = input.next();
					String lastNameK = input.next();
					String fullNameKey = firstNameK + " " + lastNameK;
					System.out.println(directory.searchFullName(fullNameKey));
					break;

				case 5:
					System.out.println("ENTER THE PHONE NUMBER OF THE PERSON YOU'D LIKE TO SEARCH FOR ex. 8134311098");
					long phoneNumberKey = input.nextLong();
					System.out.println(directory.searchPhoneNum(phoneNumberKey));
					break;

				case 6:
					System.out.println(
							"ENTER THE CITY OF THE PERSON YOU'D LIKE TO SEARCH FOR AS ONE WORD \nex. 'EASTGREATFALLS' FOR 'EAST GREAT FALLS'");
					String cityKey = input.next();
					System.out.println(directory.searchByCity(cityKey));
					break;

				case 7:
					System.out.println(
							"ENTER THE STATE OF THE PERSON YOU'D LIKE TO SEARCH FOR AS ONE WORD \nex. 'NEWYORK' FOR 'NEW YORK'");
					String stateKey = input.next();
					System.out.println(directory.searchByState(stateKey));
					break;

				case 8:
					System.out.println("ENTER THE PHONE NUMBER OF THE RECORD YOU'D LIKE DELETED");
					long phoneNumberToDelete = input.nextLong();
					directory.deleteRecord(phoneNumberToDelete);
					System.out.println("CONTACT HAS BEEN REMOVED FROM PHONY PHONEBOOK");
					System.out.println();
					break;

				case 9:
					System.out.println("ENTER THE PHONE NUMBER OF THE RECORD YOU'D LIKE TO UPDATE");
					long phoneNumberUsedToUpdatePerson = input.nextLong();
					directory.updateRecord(people, phoneNumberUsedToUpdatePerson);
					break;

				case 10:
					directory.printArray(directory.getContacts(people));
					break;

				case 11:
					System.exit(0);
					break;

				default:
					System.out.println("YOU DIDN'T ENTER A NUMBER FROM THE MENU");

				}
				System.out.println("****************************************"
						+ " \n  WELCOME BACK TO THE PHONY PHONEBOOK!" + "\n****************************************"
						+ "\n" + " \nThere Are Many Other Things You Can Do Here..." + " \nWhat Would You Like To Do? "
						+ "\nMake your selection to begin: " + "\n" + "\n1. ADD NEW ENTRY"
						+ "\n2. SEARCH BY FIRST NAME " + "\n3. SEARCH BY LAST NAME" + "\n4. SEARCH BY FULL NAME "
						+ "\n5. SEARCH BY PHONE NUMBER " + "\n6. SEARCH BY CITY" + "\n7. SEARCH BY STATE "
						+ "\n8. DELETE RECORD FOR PHONE NUMBER " + "\n9. UPDATE RECORD FOR PHONE NUMBER"
						+ "\n10. PRINT CONTACT LIST" + "\n11. EXIT THE PHONY PHONEBOOK, YOU PHONY");

			} catch (InputMismatchException d) {

			} catch (NoSuchElementException e) {

			} catch (IllegalStateException f) {

			}

		} while (x <= 11);
	}
}
