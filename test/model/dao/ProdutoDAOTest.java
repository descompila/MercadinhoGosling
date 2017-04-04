/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import model.bean.Produto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Samuelson
 */
public class ProdutoDAOTest {
    
    public ProdutoDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCreate() {
        System.out.println("create");
        Produto p = null;
        ProdutoDAO instance = new ProdutoDAO();
        instance.create(p);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRead() {
        System.out.println("read");
        ProdutoDAO instance = new ProdutoDAO();
        List<Produto> expResult = null;
        List<Produto> result = instance.read();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testReadForDesc() {
        System.out.println("readForDesc");
        String desc = "";
        ProdutoDAO instance = new ProdutoDAO();
        List<Produto> expResult = null;
        List<Produto> result = instance.readForDesc(desc);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        Produto p = null;
        ProdutoDAO instance = new ProdutoDAO();
        instance.update(p);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        Produto p = null;
        ProdutoDAO instance = new ProdutoDAO();
        instance.delete(p);
        fail("The test case is a prototype.");
    }
    
}
