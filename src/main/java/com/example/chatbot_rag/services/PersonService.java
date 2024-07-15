package com.example.chatbot_rag.services;

import com.example.chatbot_rag.PersonRepository;
import com.example.chatbot_rag.entities.Person;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.crud.CrudRepositoryService;

@BrowserCallable
@AnonymousAllowed
public class PersonService extends CrudRepositoryService<Person , Long , PersonRepository> {
}
