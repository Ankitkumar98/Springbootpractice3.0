package com.example.demo.DAO;

import com.example.demo.Model.InvoiceUnFundedPojo;
import com.example.demo.Model.InvoiceFundedPojo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class InvoiceDAO {
    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public List<InvoiceFundedPojo> getInvoiceFundedDetails(Integer userId,Integer start){
        System.out.println("1 "+userId);
        return entityManager.createQuery("SELECT inv FROM InvoiceFundedPojo inv WHERE inv.user.userId =:id",InvoiceFundedPojo.class).setFirstResult(start).setMaxResults(3).setParameter("id",userId).getResultList();
    }
    @Transactional
    public List<InvoiceUnFundedPojo> getInvoiceUnFundedDetails(Integer userId, Integer start){
        System.out.println("2 "+userId);
        return entityManager.createQuery("SELECT inv FROM InvoiceUnFundedPojo inv WHERE inv.user.userId =:id",InvoiceUnFundedPojo.class).setFirstResult(start).setMaxResults(3).setParameter("id",userId).getResultList();
    }

}
