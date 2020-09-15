package com.he.addressBook;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class AddressBook {
	private Set<Contact> contacts;

	public AddressBook() {
		// TODO
	}

	public void addContact(Contact contact) throws Exception {
		if (this.contacts == null) {
			contacts = new HashSet<>();
		}
		if (!contacts.add(contact)) {
			throw new Exception("Cannot add duplicate Contacts");
		}

	}

	public void deleteContact(String name) {
		// TODO
		Stream<Contact> str = contacts.stream();
		Set<Contact> newSet = new HashSet<>();

		str.forEach(con -> {

			boolean test = con.getName().equals(name);
			if (!test) {
				newSet.add(con);
			}

		});

		this.contacts = newSet;
	}

	public void updateContact(String name, Contact contact) throws Exception {
		// TODO
		Stream<Contact> str = contacts.stream();
		Set<Contact> newSet = new HashSet<>();
		Iterator<Contact> itr = contacts.iterator();
		boolean found = false;
		while (itr.hasNext()) {
			if (itr.next().getName().equalsIgnoreCase(name)) {
				found = true;
				break;
			}
		}
		if (!found) {
			throw new Exception("Could not search by name");
		}
		str.forEach(con -> {

			boolean test = con.getName().equals(name);
			if (test) {
				newSet.add(contact);
			} else {
				newSet.add(con);
			}

		});

		this.contacts = newSet;

	}

	public List<Contact> searchByName(String name) {
		List<Contact> list = new ArrayList<>();
		if (name.equals("")) {
			list.addAll(contacts);
			return list;
		}
		Iterator<Contact> contactItr = contacts.iterator();
		while (contactItr.hasNext()) {
			Contact next = contactItr.next();
			if (next.getName().contains(name)) {
				list.add(next);
			}
		}

		return list;
	}

	public List<Contact> searchByOrganisation(String organisation) {
		List<Contact> list = new ArrayList<>();
		if (organisation.equals("")) {
			list.addAll(contacts);
			return list;
		}
		Iterator<Contact> contactItr = contacts.iterator();
		while (contactItr.hasNext()) {
			Contact next = contactItr.next();
			if (next.getOrganisation().equalsIgnoreCase(organisation)) {
				list.add(next);
			}
		}

		return list;
	}

}