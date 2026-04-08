package com.example.api;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import java.util.List;

import com.example.model.Student;
import com.example.util.JPAUtil;

import jakarta.persistence.EntityManager;

@Path("/students")
public class StudentResource {

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello, SWDev2026!";
    }

    @GET
    @Path("/getall")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getAll() {
        EntityManager em = JPAUtil.getEntityManager();
        return em.createQuery("SELECT s FROM Student s", Student.class)
                 .getResultList();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Student create(Student s) {
        EntityManager em = JPAUtil.getEntityManager();

        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();

        return s;
    }
}