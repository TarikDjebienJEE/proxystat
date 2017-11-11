package com.dreamit.proxystat.model.dao;
import java.io.Serializable;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dreamit.proxystat.model.dao.pattern.GenericDataAccessObject;


/**
 * Classe de test generique pour les daos
 * @author RAKOTOBE Sitraka Eric
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/test-context.xml"})
public abstract class GenericJpaDataAccessObjectTest<E, PK extends Serializable> extends AbstractTransactionalJUnit4SpringContextTests {

		/**
		 * Methode abstraite permettant de recuperer un dao d'une sous-classe
		 * et ainsi permettre la parametrisation des donnees
		 */
		 abstract protected GenericDataAccessObject<?, ?> getDAO();
		
		 /**
		  * Methode abstraite permettant de recuperer un jeu de 
		  * donnees pour les tests
		  */
		 abstract protected E getEntity(); 

		 /**
		  * Methode abstraite permettant de recuperer la valeur
		  * de la primary key de l'objet pou la recherche par identifiant
		  */
		 abstract protected PK getPK(); 		 
		 
		 
		 private E entity ; 
		 private PK key ; 
		 @SuppressWarnings("rawtypes")
		private GenericDataAccessObject dao ; 
		 
		 
		 
        /**
         * Initialisation des attributs avant de commencer les tests
         * (Arrange)
         * @throws Exception
         */
        @Before
        public void setUp() throws Exception {
        	entity = getEntity(); 
        	dao = getDAO();
        	key = getPK();
        }



        /**
         * Test pour la méthode save()
         */
        @SuppressWarnings("unchecked")
		public void testSave() {
        	//TODO refactor test eric
//        	int nbDataInDBBeginning = getDAO().countAll();
        	
        	dao.save(entity);
//        	int nbDataInDBEnding = getDAO().countAll();

        	//assert(nbDataInDBEnding == (nbDataInDBBeginning + 1) );
        }


        /**
         * Test pour la méthode findById()
         */
        public void testFindById() {
        	
        	@SuppressWarnings("unchecked")
			E entityExpected = (E) dao.findById(key);
                
        	Assert.assertNotNull(entityExpected);
        }    


        
        /**
         * Test junit pour la methode findAll()
         */
        public void testFindAll() {
        	
        	@SuppressWarnings("unchecked")
			List<E> all = dao.findAll();

        	Assert.assertNotNull(all);
        	Assert.assertTrue(all.size() > 0);
        }     



        /**
         * Test pour la méthode delete()
         */
        @SuppressWarnings("unchecked")
		public void testDelete() {
        	int nbDataInDBBeginning = dao.countAll(); 
        	entity = (E) dao.findById(key);
        	
        	dao.delete(entity) ; 
        	int nbDataInDBEnding =  dao.countAll();

        	assert(nbDataInDBBeginning - 1  == nbDataInDBEnding );
        }      


        
        

        /**
         * Scenarios de tests regroupant tous les tests 
         * CRUD sur les objets
         */
        @Test
        public void testAll() {
                this.testSave();
                this.testFindById();
                this.testFindAll();
                this.testDelete(); 
        }		
	 
}